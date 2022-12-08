package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Unidad.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class BotonMoverseHandler implements EventHandler<ActionEvent> {
    private Unidad unidad;
    private VBox vbox;

    public BotonMoverseHandler(Unidad unaUnidad, VBox cajita, RazaZerg unaRaza){
        unidad = unaUnidad;
        vbox = cajita;
    }

    public void handle(ActionEvent actionEvent){
        Text texto = new Text("Se puede mover usando las flechas del teclado");
        Button boton2 = new Button("Arriba");
        boton2.setOnAction(new BotonMoverseArribaHandler(unidad,boton2,texto));
        Button boton5 = new Button("Abajo");
        boton5.setOnAction(new BotonMoverseAbajoHandler(unidad,boton2,texto));
        Button boton3 = new Button("Izquierda");
        boton3.setOnAction(new BotonMoverseIzquierdaHandler(unidad,boton2,texto));
        Button boton4 = new Button("Derecha");
        boton4.setOnAction(new BotonMoverseDerechaHandler(unidad,boton2,texto));
        texto.setOnKeyPressed(new MoverseConFlechitasHandler(boton2,boton5,boton4,boton3));
        HBox hbox2 = new HBox(boton2);
        HBox hbox3 = new HBox(boton3,boton4);
        HBox hbox4 = new HBox(boton5);
        vbox.getChildren().clear();
        vbox.getChildren().addAll(hbox2,hbox3,hbox4,texto);

    }

}
