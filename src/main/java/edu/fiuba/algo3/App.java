package edu.fiuba.algo3;

import edu.fiuba.algo3.Controlador.*;
import edu.fiuba.algo3.Vista.ContenedorPantallaInicio;
import edu.fiuba.algo3.Vista.ContenedorRegistro;
import edu.fiuba.algo3.modelo.Juego.Juego;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage){
        Juego algoStart = new Juego();
        ContenedorRegistro contenedorRegistro = new ContenedorRegistro(stage,algoStart);
        Scene escenaRegistro = new Scene(contenedorRegistro, 1200, 900);

        ContenedorPantallaInicio contenedorPantallaInicio = new ContenedorPantallaInicio(stage, escenaRegistro);
        Scene escenaInicial = new Scene(contenedorPantallaInicio, 1200, 900); // (posx, posy)


        stage.setScene(escenaInicial);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}