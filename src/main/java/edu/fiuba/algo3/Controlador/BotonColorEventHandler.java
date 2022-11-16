package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class BotonColorEventHandler implements EventHandler<ActionEvent> {
    Color unColor;
    Label label;

    public BotonColorEventHandler(Color colorIngresado, Label label) {
        unColor = colorIngresado;
        this.label = label;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        label.setText("Color seleccionado");
        label.setTextFill(unColor);
    }

}
