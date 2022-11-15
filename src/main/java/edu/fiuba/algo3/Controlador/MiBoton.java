package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class MiBoton implements EventHandler<ActionEvent> {
    private Button boton;


    public void MiBotonEvenHandler(Button boton){
        this.boton = boton;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String unString = "Me han clikeado putamadre";
        System.out.println(unString);

    }
}
