package edu.fiuba.algo3;

import edu.fiuba.algo3.Controlador.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        //Ejemplo1 ejemplo = new Ejemplo1();
        //ejemplo.ejecutar(stage);

        Ejemplo2 ejemplo2 = new Ejemplo2();
        ejemplo2.ejecutar(stage);


    }

    public static void main(String[] args) {
        launch();
    }

}