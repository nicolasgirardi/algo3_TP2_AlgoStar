package edu.fiuba.algo3.Vista;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.File;

public class LabelRecursos {
    private Label label;

    public LabelRecursos(String path){
        label = new Label("prueba");
        File recurso = new File(path);
        Image imagen = new Image(recurso.toURI().toString(),20,20,true,true);
        ImageView view = new ImageView(imagen);
        label.setGraphic(view);
        label.setFont(new Font(20));
        label.setTextFill(Color.RED);
    }

    public Label getLabel(){
        return label;
    }
}
