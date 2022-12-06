package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class VolcanHandlerProtoss implements EventHandler<ActionEvent> {
    private VBox vBoxMenu;
    private Volcan volcan;

    public VolcanHandlerProtoss(VBox vBoxMenu, Ubicacion ubicacion) {
        this.vBoxMenu = vBoxMenu;
        this.volcan = ubicacion.getVolcan();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Asimilador asimilador = null;
        Button botonCrearAsimilador = new Button("Construir Sobre Volcan ");
        botonCrearAsimilador.setOnAction( new BotonCrearAsimiladorHandler(asimilador, vBoxMenu, volcan) );
        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(botonCrearAsimilador);
    }
}
