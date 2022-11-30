package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.Controlador.*;
import edu.fiuba.algo3.modelo.Juego.Juego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.util.Objects;

public class ContenedorRegistro extends VBox{


    public ContenedorRegistro(Stage stage, Juego algoStart) {
        stage.setTitle("AlgoStar");
        Label labelJugador = new Label("Jugador  " + String.valueOf(algoStart.cantidadJugadores()) );
        labelJugador.setFont(Font.font(40));
        labelJugador.setTextFill(Color.rgb(0, 0, 200, 1));

        Label labelIngreseNombre = new Label("Nombre: ");
        labelIngreseNombre.setFont(Font.font(25));
        labelJugador.setTextFill(Color.rgb(0, 0, 200, 1));

        TextField campoNombre = new TextField();
        campoNombre.setPromptText("Ingrese Su Nombre Aqui");

        Button botonEnviarNombre = new Button("Enviar");

        HBox contHorizNombre = new HBox(labelIngreseNombre, campoNombre, botonEnviarNombre);
        contHorizNombre.setSpacing(50);
        contHorizNombre.setPadding(new Insets(20) );
        contHorizNombre.setAlignment(Pos.BASELINE_CENTER);       //para centrarlo al medio

        Label labelColor = new Label("Seleccione un color: ");
        labelColor.setFont(Font.font(30));
        labelColor.setTextFill(Color.rgb(0, 0, 200, 1));

        Button botonColorRojo = new Button("Rojo");
        Button botonColorAzul = new Button("Azul");
        Button botonColorVerde = new Button("Verde");
        Button botonColorAmarillo = new Button("Amarillo");
        Button botonColorCeleste = new Button("Celeste");


        HBox contHorzColores = new HBox(botonColorRojo, botonColorAzul, botonColorVerde, botonColorAmarillo, botonColorCeleste );
        contHorzColores.setSpacing(40);
        contHorzColores.setAlignment(Pos.BASELINE_CENTER);

        VBox contVertColores = new VBox(labelColor,contHorzColores);
        contVertColores.setSpacing(20);
        contVertColores.setPadding(new Insets(10));
        contVertColores.setAlignment(Pos.BASELINE_CENTER);


        Label seleccionRaza = new Label("Seleccione su raza: ");
        seleccionRaza.setFont(Font.font(30));
        seleccionRaza.setPadding(new Insets(10));
        seleccionRaza.setTextFill(Color.rgb(0, 0, 200, 1));

        Button botonZerg = new Button();
        VBox contVertZerg = obtenerContVer("ZERG", new Label(), botonZerg);
        contVertZerg.setAlignment(Pos.CENTER);

        Button botonProtoss = new Button();
        VBox contVertProtoss = obtenerContVer("PROTOSS", new Label(), botonProtoss);
        contVertProtoss.setAlignment(Pos.CENTER);


        HBox contHorzRazas = new HBox(contVertZerg, contVertProtoss);
        contHorzRazas.setSpacing(30);
        contHorzRazas.setAlignment(Pos.CENTER);

        Label nombreIngresado = new Label("");
        nombreIngresado.setFont(Font.font(20));

        Label colorIngresado = new Label("");
        colorIngresado.setFont(Font.font(20));

        Label razaIngresada = new Label("");
        razaIngresada.setFont(Font.font(20));


        HBox resultadoFinal = new HBox(nombreIngresado, colorIngresado, razaIngresada );
        resultadoFinal.setSpacing(15);
        resultadoFinal.setAlignment(Pos.CENTER);
        resultadoFinal.getChildren();

        BotonEnviar2Handler botonEnviar2Handler = new BotonEnviar2Handler(campoNombre, nombreIngresado);
        botonEnviarNombre.setOnAction(botonEnviar2Handler);

        BotonColorHandler botonColorHandlerRojo = new BotonColorHandler( Color.rgb(255,0,0) , colorIngresado,"Rojo");
        botonColorRojo.setOnAction(botonColorHandlerRojo);

        BotonColorHandler botonColorHandlerAzul = new BotonColorHandler( Color.rgb(0,0,255) , colorIngresado, "Azul");
        botonColorAzul.setOnAction(botonColorHandlerAzul);

        BotonColorHandler botonColorHandlerVerde = new BotonColorHandler(Color.rgb(94,255,0), colorIngresado, "Verde");
        botonColorVerde.setOnAction(botonColorHandlerVerde);

        BotonColorHandler botonColorHandlerAmarillo = new BotonColorHandler(Color.rgb(255,244,0), colorIngresado, "Amarillo");
        botonColorAmarillo.setOnAction(botonColorHandlerAmarillo);

        BotonColorHandler botonColorHandlerCeleste = new BotonColorHandler(Color.rgb(0,255,180), colorIngresado, "Celeste");
        botonColorCeleste.setOnAction(botonColorHandlerCeleste);


        BotonRazaHandler botonRazaHandlerZerg = new BotonRazaHandler("ZERG", razaIngresada);
        botonZerg.setOnAction(botonRazaHandlerZerg);

        BotonRazaHandler botonRazaHandlerProt = new BotonRazaHandler("PROTOSS", razaIngresada);
        botonProtoss.setOnAction(botonRazaHandlerProt);

        TextoEnterHandler textoEnterHandler = new TextoEnterHandler(botonEnviarNombre);
        campoNombre.setOnKeyPressed(textoEnterHandler);

        File fileFondo = new File("images/fondoFinal.png");
        BackgroundImage primerBackGro = new BackgroundImage(new Image(fileFondo.toURI().toString(),
                1200,2500,true,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        Button botonContinuar = new Button("Continuar");
        BotonContinuarRegistroHandler botonContinuarRegistroEH = new BotonContinuarRegistroHandler(stage,
                this, nombreIngresado, colorIngresado, razaIngresada, algoStart);
        botonContinuar.setOnAction(botonContinuarRegistroEH);

        this.getChildren().addAll(labelJugador, contHorizNombre, contVertColores, seleccionRaza, contHorzRazas,  resultadoFinal,botonContinuar);
        this.setSpacing(10);
        this.setPadding(new Insets(20) );
        this.setAlignment(Pos.TOP_CENTER);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(15);
        this.setBackground(new Background(primerBackGro) );

    }

    private VBox obtenerContVer(String nombreRaza, Label labelRaza, Button botonRaza) {
        File fileRaza = null;
        if(Objects.equals(nombreRaza, "ZERG")){
            fileRaza = new File("images/zerg.png");
            botonRaza.setText("RAZA ZERG");
        }
        else{
            fileRaza = new File("images/protoss.png");
            botonRaza.setText("RAZA PROTOSS");
        }

        Image imagenRaza = new Image(fileRaza.toURI().toString(),400, 400, true, true );
        labelRaza.setGraphic(new ImageView(imagenRaza) );
        return new VBox(labelRaza, botonRaza);
    }


}
