package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class NodoMineralProtossHandler implements EventHandler<ActionEvent> {

    private JuegoModelo juegoModelo;
    private  BotonGenerico botonMineral;
    private NodoMineral nodoMineral;
    private VBox vBoxMenu;

    public NodoMineralProtossHandler(VBox vBoxMenu, Ubicacion ubicacion, BotonGenerico botonMineral, JuegoModelo juegoModelo) {
        this.vBoxMenu = vBoxMenu;
        this.nodoMineral = ubicacion.getNodoMineral();
        this.botonMineral = botonMineral;
        this.juegoModelo = juegoModelo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Button botonCrearNexoMineral = new Button("Construir Sobre NexoMineral");
        botonCrearNexoMineral.setOnAction( new BotonCrearNexoMineralHandler(vBoxMenu, nodoMineral,botonMineral, juegoModelo.getJugadorActivo().getRaza() ) );
        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(botonCrearNexoMineral);
    }
}
