package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonBasicoEventHandler implements EventHandler<ActionEvent> {
    private Button boton;

    public BotonBasicoEventHandler(Button boton) {
        this.boton = boton;
        boton.setText("Inicializando");
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        String unString = "Me han clikeado putamadre";
        System.out.println(unString);
        boton.setText("Me clickearon oh nooo");
    }



}
