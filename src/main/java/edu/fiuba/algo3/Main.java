package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage){
        stage.setTitle("AlgoStarII");

        stage.setFullScreen(true);
        Button botonJugar = new Button();
        botonJugar.setText("Empezar Nuevo Juego");
        Button botonSalir = new Button();
        botonSalir.setText("Salir");
        VBox contenedor = new VBox(botonJugar,botonSalir);
        contenedor.setSpacing(50);
        contenedor.setPadding(new Insets(512));
        Scene scene = new Scene(contenedor,200,200);
        stage.setScene(scene);
        stage.show();
    }
}
