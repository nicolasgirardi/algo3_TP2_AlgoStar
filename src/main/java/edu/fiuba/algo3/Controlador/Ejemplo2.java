package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ejemplo2 {

    public Ejemplo2(){

    }
    public void ejecutar(Stage stage){

        stage.setTitle("AlgoStar");

        Label labelIngreseNombre = new Label();
        labelIngreseNombre.setText("Nombre: ");

        TextField campoNombre = new TextField();
        campoNombre.setPromptText("Ingrese Su Nombre Aqui");

        Button botonEnviarNombre = new Button();
        botonEnviarNombre.setText("Enviar");

        HBox contHorizNombre = new HBox(labelIngreseNombre, campoNombre, botonEnviarNombre);
        contHorizNombre.setSpacing(30);

        Label labelColor = new Label();
        labelColor.setText("Seleccione un color: ");

        Button botonColorRojo = new Button();
        botonColorRojo.setText("Rojo");

        Button botonColorAzul = new Button();
        botonColorAzul.setText("Azul");

        HBox contHorzColores = new HBox(labelColor, botonColorRojo, botonColorAzul );
        contHorzColores.setSpacing(30);

        Label seleccionRaza = new Label();
        seleccionRaza.setText("Seleccione su raza");

        Button botonZerg = new Button();
        botonZerg.setText("Raza Zerg");

        Button botonProtoss = new Button();
        botonProtoss.setText("Raza Protoss");

        HBox contHorzRazas = new HBox(botonZerg, botonProtoss);
        contHorzRazas.setSpacing(30);
        contHorzRazas.setPadding(new Insets(10) );

        Label nombreIngresado = new Label();
        nombreIngresado.setText("");

        Label colorIngresado = new Label();
        colorIngresado.setText("");

        Label razaIngresada = new Label();
        razaIngresada.setText("");

        HBox resultadoFinal = new HBox(nombreIngresado, colorIngresado, razaIngresada);
        resultadoFinal.setSpacing(15);


        VBox contendPrincipal = new VBox(contHorizNombre, contHorzColores, seleccionRaza, contHorzRazas, resultadoFinal );
        contendPrincipal.setSpacing(10);
        contendPrincipal.setPadding(new Insets(20) );


        BotonEnviar2EventHandler botonEnviar2EventHandler = new BotonEnviar2EventHandler(campoNombre, nombreIngresado);
        botonEnviarNombre.setOnAction(botonEnviar2EventHandler);

        BotonColorEventHandler botonColorEventHandlerRojo = new BotonColorEventHandler( Color.rgb(255,0,0) , colorIngresado);
        botonColorRojo.setOnAction(botonColorEventHandlerRojo);

        BotonColorEventHandler botonColorEventHandlerAzul = new BotonColorEventHandler( Color.rgb(0,0,255) , colorIngresado);
        botonColorAzul.setOnAction(botonColorEventHandlerAzul);

        BotonRazaEventHandler botonRazaEventHandlerZerg = new BotonRazaEventHandler(razaIngresada,"ZERG");
        botonZerg.setOnAction(botonRazaEventHandlerZerg);

        BotonRazaEventHandler botonRazaEventHandlerProt = new BotonRazaEventHandler(razaIngresada,"PROTOSS");
        botonProtoss.setOnAction(botonRazaEventHandlerProt);

        TextoEnterEventHandler textoEnterEventHandler = new TextoEnterEventHandler(botonEnviarNombre);
        campoNombre.setOnKeyPressed(textoEnterEventHandler);

        Scene escena = new Scene(contendPrincipal, 900, 900);

        stage.setScene(escena);

        stage.show();

    }


}
