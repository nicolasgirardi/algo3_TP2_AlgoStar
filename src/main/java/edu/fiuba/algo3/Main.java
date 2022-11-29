package edu.fiuba.algo3;

import edu.fiuba.algo3.Controlador.BotonSalirHandler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage){
        stage.setTitle("AlgoStarII");

        BackgroundImage myBI= new BackgroundImage(new Image("https://media.discordapp.net/attachments/585925891138519041/1047207845113909298/fondo.png?width=1189&height=676",0,0,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        stage.setFullScreen(true);
        Button botonJugar = new Button();
        botonJugar.setText("Empezar Nuevo Juego");
        Button botonSalir = new Button();
        BotonSalirHandler BSH = new BotonSalirHandler(botonSalir);
        botonSalir.setOnAction(BSH);
        VBox contenedor = new VBox(botonJugar,botonSalir);
        contenedor.setSpacing(50);
        contenedor.setPadding(new Insets(512));
        contenedor.setBackground(new Background(myBI));
        Scene scene = new Scene(contenedor,200,200);
        stage.setScene(scene);
        stage.show();
    }
}
