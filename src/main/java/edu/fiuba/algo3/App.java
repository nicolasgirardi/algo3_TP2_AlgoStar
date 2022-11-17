package edu.fiuba.algo3;

import edu.fiuba.algo3.Controlador.*;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Ejemplo1 ejemplo = new Ejemplo1();
        //ejemplo.ejecutar(stage);

        Ejemplo2 ejemplo2 = new Ejemplo2();
        ejemplo2.ejecutar(stage);

        //Ejemplo3 ejemplo3 = new Ejemplo3();
        //ejemplo3.ejecutar(stage);



    }

    public static void main(String[] args) {
        launch();
    }

}