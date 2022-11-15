package edu.fiuba.algo3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        stage.setTitle("El nombre de la ventana Inicial -**");
        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);

        //Creo un layout
        StackPane layout = new StackPane(); //indica la disposicion de en que seran ubicados los elementos.

        //creo un boton
        Button boton = new Button();
        boton.setText("Presiona Aqui para ir a la siguiente escena");

        boton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                 System.out.println("Me han clickeado\n");

            }
        });

        boton.setOnAction(e->{
            System.out.println("Me ha clickeado\n");
            System.out.println("putamadre\n");
        });




        //Creo un label.
        Label unLabel = new Label();
        unLabel.setText("Estamos seteando un texto a un label");

        //creo un textField:
        TextField cuadroDeTexto = new TextField();
        cuadroDeTexto.setText("Hay un texto aca jajaja");

        TextArea textoArea = new TextArea();
        textoArea.setPrefColumnCount(0);
        textoArea.setPrefRowCount(0);

        layout.getChildren().add(boton); //agrego al layout el boton
        layout.getChildren().add(cuadroDeTexto); //agrego al layout el textField
        layout.getChildren().add(textoArea);

        Scene escena = new Scene(layout, 800, 800); //es el contenedor en el cual se colocan los elementos visuales.
        // el layour debemos asociarlo siempre a una escena.
        //pero por mas que lo ponga a una escena yo tengo que asociarla al stage
        stage.setScene(scene);
        stage.setScene(escena);



        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}