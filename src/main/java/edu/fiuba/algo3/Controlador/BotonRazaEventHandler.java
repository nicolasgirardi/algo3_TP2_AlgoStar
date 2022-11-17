package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.File;

public class BotonRazaEventHandler implements EventHandler<ActionEvent> {
    String razaSeleccionada;
    Label labelRazaResult;
    public BotonRazaEventHandler(String zerg, Label razaResulHBox) {
        this.razaSeleccionada = zerg;
        this.labelRazaResult = razaResulHBox;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(razaSeleccionada == "ZERG"){
           labelRazaResult.setText( "ZERG");
        }
        else{
            labelRazaResult.setText( "PROTOSS");
        }

    }
}
