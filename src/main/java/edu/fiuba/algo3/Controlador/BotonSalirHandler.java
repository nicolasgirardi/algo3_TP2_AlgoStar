package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.media.*;

public class BotonSalirHandler implements EventHandler<ActionEvent> {

    private Button boton;
    private AudioClip sonidito;

    public BotonSalirHandler(Button boton) {
        this.boton = boton;
        boton.setText("Salir");
        //System.out.println(getClass().getResource("http://sndup.net/4psz").toString());
        sonidito = new AudioClip("http://sndup.net/4psz");
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        sonidito.play();

    }
}
