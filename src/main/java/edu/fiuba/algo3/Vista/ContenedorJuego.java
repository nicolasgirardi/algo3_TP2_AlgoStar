package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ContenedorJuego extends BorderPane {

    public ContenedorJuego(Stage stage, Juego juego) {
        /*Label labelHud = new Label("");
        File fileHudJuego = new File("images/hudJuego.png");
        Image imagenHudJuego = new Image(fileHudJuego.toURI().toString(),1700, 1600, true, true );



        labelHud.setGraphic(new ImageView(imagenHudJuego) );
        Canvas canvas = new Canvas(1700,1600);
        canvas.getGraphicsContext2D().setFill(Color.GRAY);
        canvas.getGraphicsContext2D().fillRect(0,0,1700,1600);
        Group unGrupo = new Group(canvas,labelHud);
        this.setBottom(unGrupo);
        */


        Criadero criadero = new Criadero();

        GridPane gridPane = new GridPane();
        gridPane.setBackground(new Background(new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY)));
        gridPane.setAlignment(Pos.CENTER);
        final int TAMANIO = 100;

        // Tierra
        File fileFondo = new File("images/tierra.png");
        Image imagenRaza = new Image(fileFondo.toURI().toString(),TAMANIO, TAMANIO, true, true );

        BackgroundImage primerBackGro = new BackgroundImage(
                imagenRaza,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );





        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                try {
                    Button btn = new Button();
                    //btn.setGraphic( new ImageView(imagenRaza) );
                    btn.setMinSize(TAMANIO,TAMANIO);
                    btn.setBackground( new Background(primerBackGro) );
                    // btn.setStyle("-fx-background-color: #CA914B; -fx-border-width:1; -fx-border-color: #FFFFFF ");
                    gridPane.add(btn, i, j);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }

        // Criadero
        File criaderoFile = new File("images/criadero.png");
        Image criaderoImage = new Image(criaderoFile.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage criaderoBackGro = new BackgroundImage(
                criaderoImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        Button btnCriadero = new Button();
        btnCriadero.setMinSize(TAMANIO,TAMANIO);
        btnCriadero.setBackground( new Background(criaderoBackGro) );
        gridPane.add(btnCriadero, 0, 0);




        this.setCenter(gridPane);



    }




}
