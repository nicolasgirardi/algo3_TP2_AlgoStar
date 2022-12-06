package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class BotonCriaderoHandler implements EventHandler<ActionEvent> {

    private  VBox vbox;
    private  Criadero criadero;
    private Jugador jugador;
    private GridPane gridPane;
    private Mapa mapa;
    private int tamanio;

    public BotonCriaderoHandler(Criadero criadero, VBox cajaParaRellenar, Jugador jugador, GridPane gridPane, Mapa mapa, int tamanio){
        this.vbox = cajaParaRellenar;
        this.criadero = criadero;
        this.jugador = jugador;
        this.gridPane = gridPane;
        this.mapa = mapa;
        this.tamanio = tamanio;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label labelLarvas = new Label("Cantidad de larvas: " + String.valueOf( criadero.getCantidadLarvas() ) + "\n" );
        Button unBoton = new Button("Evolucionar larva a zangano");
        unBoton.setOnAction(new BotonEvolucionarAZanganoHandler(criadero, jugador, gridPane, mapa, tamanio, labelLarvas));
        vbox.getChildren().clear();
        vbox.getChildren().addAll(labelLarvas, unBoton);
    }
}
