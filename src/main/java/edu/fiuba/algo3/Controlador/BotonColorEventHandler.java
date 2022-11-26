package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class BotonColorEventHandler implements EventHandler<ActionEvent> {
    Color unColor;
    Label label;
    String colorEnString;

    public BotonColorEventHandler(Color colorIngresado, Label label, String colorEnString) {
        unColor = colorIngresado;
        this.label = label;
        this.colorEnString = colorEnString;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        label.setText(colorEnString);
        label.setTextFill(unColor);
    }

}
