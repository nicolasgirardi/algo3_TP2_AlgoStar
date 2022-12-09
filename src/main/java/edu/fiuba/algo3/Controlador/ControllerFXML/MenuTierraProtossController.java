package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.BotonTierra;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonAcceso;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonAsimilador;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonEdificioPilon;
import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;
import edu.fiuba.algo3.modelo.Edificio.CorrelativaDeConstruccionIncumplidaError;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.File;

public class MenuTierraProtossController {

    @FXML
    public AnchorPane contenerdorMenu;

    private GridPane tablero;
    private Ubicacion ubicacion;
    private RazaProtoss razaProtoss;
    private BotonTierra botonTierra;


    @FXML
    public void onClickedConstruirAcceso(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        String mensaje = null;
        //TODO: Agregar ubicicacion a los edificios deel modelo
        Acceso acceso = new Acceso();
        try{
            razaProtoss.agregarEdificio(acceso);
            botonTierra.borrarBotonDelTablero();
            tablero.add(new BotonAcceso(botonTierra),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        } catch(ConstruccionFueraDelRangoPilonError e ){
            mensaje = "Error la construccion del acceso esta fuera del rango del pilon mas cercano";

        }catch ( RecursosInsuficientesError e ){
            mensaje = "Error recursos insuficientes para construir Acceso";
        }

        if(mensaje != null){
            alert.setContentText(mensaje);
            alert.showAndWait();
        }

    }

    @FXML
    public void onClickedConstruirPilon(MouseEvent event) {
        Pilon pilon = new Pilon();
        try {
            razaProtoss.agregarEdificio(pilon);
            botonTierra.borrarBotonDelTablero();
            tablero.add(new BotonEdificioPilon(botonTierra),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        }catch ( RecursosInsuficientesError e ) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            String mensaje = "Error recursos insuficientes para construir Acceso";
            alert.setContentText(mensaje);
            alert.showAndWait();
        }
    }


    @FXML
    public void onClickedConstruirPuertoEstelar(MouseEvent event) {
        PuertoEstelar puertoEstelar = new PuertoEstelar();
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        String mensaje = null;
        try{
            razaProtoss.agregarEdificio(puertoEstelar);
            botonTierra.borrarBotonDelTablero();
            tablero.add(new BotonAcceso(botonTierra),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());

        }
        catch (CorrelativaDeConstruccionIncumplidaError e ){
            MostradorAlertas.mostrarAlerta(e,"Necesitas un Acceso para construir");
        }
        catch( Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }



    }

    public void setElements(GridPane tablero, Ubicacion ubicacion, RazaProtoss razaProtoss, BotonTierra botonTierra) {
        this.tablero = tablero;
        this.ubicacion =ubicacion;
        this.botonTierra = botonTierra;
        this.razaProtoss = razaProtoss;
    }
}
