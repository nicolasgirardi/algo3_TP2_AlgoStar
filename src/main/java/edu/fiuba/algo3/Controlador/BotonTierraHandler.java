package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BotonTierraHandler implements EventHandler<ActionEvent> {

    private VBox vbox;

    public BotonTierraHandler(VBox cajaParaRellenar){
        this.vbox = cajaParaRellenar;
    }

    //Hacer que se muestren los edificios que se pueden construir y que al seleccionar uno se construya
    //si es que tiene recursos
    @Override
    public void handle(ActionEvent actionEvent) {
        Label mensajeEspacio = new Label("No se puede construir sobre el espacio");
        vbox.getChildren().clear();
        vbox.getChildren().addAll(mensajeEspacio);
        /*Button unBoton = new Button("Construir nuevo edificio");
        vbox.getChildren().clear();
        vbox.getChildren().addAll(unBoton);*/
    }
}
