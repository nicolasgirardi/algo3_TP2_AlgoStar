package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonRazaEventHandler implements EventHandler<ActionEvent> {
    Label labelRazaIngresada;
    String razaSeleccionada;
    public BotonRazaEventHandler(Label razaIngresada, String zerg) {
        this.labelRazaIngresada = razaIngresada;
        this.razaSeleccionada = zerg;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Image image = new Image(getClass().getResourceAsStream("imagenes/simboloProtoss.jpeg"));
        labelRazaIngresada.setGraphic(new ImageView(image));
        //labelRazaIngresada.setText(razaSeleccionada);

    }
}
