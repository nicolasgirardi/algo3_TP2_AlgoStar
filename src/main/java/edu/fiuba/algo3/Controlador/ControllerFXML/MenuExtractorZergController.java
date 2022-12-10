package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonExtractor;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MenuExtractorZergController  {

    @FXML
    public AnchorPane contenerdorMenu;

    private BotonCeldaTablero botonCeldaTablero;

    private GridPane tablero;

    private Ubicacion ubicacion;
    private JuegoModelo juegoModelo;

    public void setElements(GridPane tablero, Ubicacion ubicacion, BotonCeldaTablero botonCeldaTablero, JuegoModelo juegoModelo){
        this.botonCeldaTablero = botonCeldaTablero;
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.juegoModelo = juegoModelo;
    }

    @FXML
    public void onClickedConstruirAsimilador(MouseEvent event) {
        botonCeldaTablero.borrarBotonDelTablero();
        tablero.add(new BotonExtractor(botonCeldaTablero), ubicacion.coordenada().horizontal(), ubicacion.coordenada().vertical() );
        juegoModelo.notificarSobreJugadorActivo();
    }


}
