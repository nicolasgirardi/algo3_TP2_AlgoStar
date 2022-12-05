package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BotonCriaderoHandler implements EventHandler<ActionEvent> {

    private  VBox vbox;
    private  Criadero criadero;

    public BotonCriaderoHandler(Criadero criadero, VBox cajaParaRellenar){
        this.vbox = cajaParaRellenar;
        this.criadero = criadero;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label labelLarvas = new Label("Cantidad Larvas es " + String.valueOf( criadero.getCantidadLarvas() ) + "\n" );
        Button unBoton = new Button("Evolucionar larva a zangano");
        vbox.getChildren().clear();
        Label labelMenu = new Label("Menu del Juego");
        labelMenu.setEffect(new DropShadow(2.0, Color.BLACK));
        labelMenu.setFont(Font.font(40));
        labelMenu.setTextFill(Color.BLACK);

        vbox.getChildren().addAll(labelMenu, labelLarvas, unBoton); // perfecto
    }
}
