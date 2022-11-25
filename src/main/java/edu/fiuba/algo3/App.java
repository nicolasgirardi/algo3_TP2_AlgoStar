package edu.fiuba.algo3;

import edu.fiuba.algo3.Controlador.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        //Ejemplo2 ejemplo2 = new Ejemplo2();
        //ejemplo2.ejecutar(stage);
        ContenedorRegistro contenedorInicio = new ContenedorRegistro(stage);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}