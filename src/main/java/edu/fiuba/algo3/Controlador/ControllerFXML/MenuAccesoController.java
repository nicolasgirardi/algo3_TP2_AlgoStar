package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.MostradorAlertas;
//import edu.fiuba.algo3.Vista.Botones.BotonZealot;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonAcceso;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MenuAccesoController {
    @FXML
    public AnchorPane contenerdorMenuAcceso;

    private GridPane tablero;
    private Ubicacion ubicacion;
    private RazaProtoss razaProtoss;
    BotonAcceso botonAcceso;
    public void onClickedConstruirAcceso(MouseEvent mouseEvent) {
        Acceso acceso = new Acceso(ubicacion);
        try {
            razaProtoss.agregarEdificio(acceso);
            botonAcceso.borrarBotonDelTablero();
            //tablero.add(new BotonZealot(botonAcceso), ubicacion.coordenada().horizontal(), ubicacion.coordenada().vertical());
        }catch (Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }


    }
    public void setElements(GridPane tablero, Ubicacion ubicacion, RazaProtoss razaProtoss, BotonAcceso botonAcceso){
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.razaProtoss = razaProtoss;
        this.botonAcceso = botonAcceso;
    }
}
