package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BotonLimpiarEventHandler implements EventHandler<ActionEvent> {
    private TextField textField;

    public BotonLimpiarEventHandler(TextField texto ){
        this.textField = texto;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        textField.setText("");
        textField.requestFocus();
    }

}
