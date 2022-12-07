package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class VolcanHandlerProtoss implements EventHandler<ActionEvent> {
    private JuegoModelo juegoModelo;
    private BotonGenerico botonVolcan;
    private VBox vBoxMenu;
    private Volcan volcan;

    public VolcanHandlerProtoss(VBox vBoxMenu, Ubicacion ubicacion, BotonGenerico botonVolcan, JuegoModelo juegoModelo) {
        this.vBoxMenu = vBoxMenu;
        this.volcan = ubicacion.getVolcan();
        this.botonVolcan = botonVolcan;
        this.juegoModelo = juegoModelo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Button botonCrearAsimilador = new Button("Construir Sobre Volcan ");
        botonCrearAsimilador.setOnAction( new BotonCrearAsimiladorHandler(vBoxMenu, volcan, botonVolcan, juegoModelo.getJugadorActivo().getRaza() ) );
        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(botonCrearAsimilador);
    }
}
