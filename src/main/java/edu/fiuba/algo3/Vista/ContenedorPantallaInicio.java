package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonContinuarHandler;
import edu.fiuba.algo3.Controlador.BotonSalirHandler;
import edu.fiuba.algo3.Controlador.ControllerFXML.RegistroJugadorControlador;
import edu.fiuba.algo3.modelo.Juego.Juego;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;


public class ContenedorPantallaInicio extends VBox {
    public ContenedorPantallaInicio(Stage stage, Scene escenaRegistro) {
        stage.setTitle("Inicio");
        Label inicioJuego = new Label();
        inicioJuego.setText("Bienvenido a AlgoStar");
        inicioJuego.setFont(Font.font(40));
        inicioJuego.setTextFill(Color.rgb(255, 255, 255, 1));
        inicioJuego.setAlignment(Pos.CENTER);
        //inicioJuego.setStyle("-fx-stroke-width: 10;-fx-stroke: black;");

        Button botonContinuar = new Button();
        botonContinuar.setText("Continuar");
        botonContinuar.setMaxSize(200,100); //  (posx, posy?? no funciona)
        Button botonSalir = new Button();
        botonSalir.setOnAction(new BotonSalirHandler(botonSalir));
        BotonContinuarHandler botonContinuarEH = new BotonContinuarHandler(botonContinuar, escenaRegistro, stage); //refactor boton al pedo al handler
        botonContinuar.setOnAction(botonContinuarEH);




        /*botonContinuar.setOnAction(e -> {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/VistaFxml/RegistroJugador.fxml"));

                Scene scene = new Scene(fxmlLoader.load());
                RegistroJugadorControlador controlador = fxmlLoader.getController();
                controlador.setearJuego(new Juego());

                stage.setScene(scene);
                stage.show();
            }catch (IOException err){
                err.printStackTrace();
            }
        });*/

        File fileFondo = new File("images/fondoInicioFin.png");

        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(),
                1000, 562.5,true,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        this.getChildren().addAll( inicioJuego, botonContinuar,botonSalir);
        this.setBackground( new Background(primerBackGro) );
        this.setSpacing(100);
        this.setAlignment(Pos.CENTER);

    }

}
