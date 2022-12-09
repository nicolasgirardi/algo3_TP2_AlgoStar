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
        //TODO: Agregar ubicicacion a los edificios deel modelo
        try{
            Acceso acceso = new Acceso();
            razaProtoss.agregarEdificio(acceso);
            botonTierra.borrarBotonDelTablero();
            tablero.add(new BotonAcceso(botonTierra),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        } catch ( RecursosInsuficientesError e ){
            MostradorAlertas.mostrarAlerta(e,"un Acceso");
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
            MostradorAlertas.mostrarAlerta(e,"un Pilon");
        }
    }


    @FXML
    public void onClickedConstruirPuertoEstelar(MouseEvent event) {
        try{
            PuertoEstelar puertoEstelar = new PuertoEstelar(ubicacion);
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
