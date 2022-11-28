package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.BotonContinuarHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;

public class ContenedorPantallaInicio extends VBox {
    public ContenedorPantallaInicio(Stage stage, Scene escenaRegistro) {

        stage.setTitle("Inicio");
        Label inicioJuego = new Label();
        inicioJuego.setText("Bienvenido a AlgoStar");
        inicioJuego.setFont(Font.font(40));
        inicioJuego.setTextFill(Color.rgb(255, 255, 255, 1));
        inicioJuego.setAlignment(Pos.CENTER);

        Button botonContinuar = new Button();
        botonContinuar.setText("Continuar");
        botonContinuar.setMaxSize(200,100); //  (posx, posy?? no funciona)
        BotonContinuarHandler botonContinuarEH = new BotonContinuarHandler(botonContinuar, escenaRegistro, stage);
        botonContinuar.setOnAction(botonContinuarEH);


        File fileFondo = new File("images/fondoInicioFin.png");
        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(),
                1200,2500,true,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        this.getChildren().addAll( inicioJuego, botonContinuar);
        this.setBackground( new Background(primerBackGro) );
        this.setAlignment(Pos.CENTER);
    }

}
