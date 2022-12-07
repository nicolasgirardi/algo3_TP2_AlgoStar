package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonTierraHandlerZerg implements EventHandler<ActionEvent> {
    private VBox vBoxMenu;

    public BotonTierraHandlerZerg(VBox vBoxMenu) {
        this.vBoxMenu = vBoxMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label labelNuevo = new Label("Un pedazo de tierra para pode construir algo");
        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(labelNuevo);
    }
}
