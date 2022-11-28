package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Juego.Juego;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;


public class ContenedorJuego extends BorderPane {

    public ContenedorJuego(Stage stage, Juego juego) {
        Label labelHud = new Label("");
        File fileHudJuego = new File("images/hudJuego.png");
        Image imagenHudJuego = new Image(fileHudJuego.toURI().toString(),1700, 1600, true, true );
        labelHud.setGraphic(new ImageView(imagenHudJuego) );
        Canvas canvas = new Canvas(1700,1600);
        canvas.getGraphicsContext2D().setFill(Color.GRAY);
        canvas.getGraphicsContext2D().fillRect(0,0,1700,1600);
        Group unGrupo = new Group(canvas,labelHud);
        this.setBottom(unGrupo);



    }




}
