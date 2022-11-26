package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonContinuarEventHandler implements EventHandler<ActionEvent> {

    private Button botonContinuar;

    private  Scene escenaRegistro;

    private Stage stage;

    public BotonContinuarEventHandler(Button botonContinuar, Scene escenaRegistro, Stage stage) {
        this.botonContinuar = botonContinuar;
        this.escenaRegistro = escenaRegistro;
        this.stage = stage;
    }


    @Override
    public void handle(ActionEvent actionEvent) {

        stage.setScene(escenaRegistro);

    }

}



