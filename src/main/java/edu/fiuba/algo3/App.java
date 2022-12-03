package edu.fiuba.algo3;

import edu.fiuba.algo3.Controlador.*;
import edu.fiuba.algo3.Vista.ContenedorPantallaInicio;
import edu.fiuba.algo3.Vista.ContenedorRegistro;
import edu.fiuba.algo3.modelo.Juego.Juego;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage){
        Juego algoStart = new Juego();
        ContenedorRegistro contenedorRegistro = new ContenedorRegistro(stage,algoStart);
        Scene escenaRegistro = new Scene(contenedorRegistro, 1200, 900);

        /*ContenedorPantallaInicio contenedorPantallaInicio = new ContenedorPantallaInicio(stage, escenaRegistro);
        Scene escenaInicial = new Scene(contenedorPantallaInicio, 1200, 900); // (posx, posy)
        stage.setScene(escenaInicial);
        stage.show();*/
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Prueba2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            System.out.println("IOException " );
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception "+ e.getMessage());
        }


    }

    public static void main(String[] args) {
        launch();
    }

}