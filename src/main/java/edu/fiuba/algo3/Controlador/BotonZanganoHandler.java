package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.Unidad.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class BotonZanganoHandler implements EventHandler<ActionEvent> {

    private Unidad zangano;
    private VBox vbox;

    public BotonZanganoHandler(Unidad unidad,VBox cajita){
        zangano = unidad;
        vbox = cajita;
    }

    public void handle(ActionEvent actionEvent){
        vbox.getChildren().clear();
        Button boton1 = new Button("Evolucionar a Criadero");
        Button boton2 = new Button("Evolucionar a Reserva de Produccion");
        Button boton3 = new Button("Evolucionar a Extractor");
        Button boton4 = new Button("Evolucionar a Guarida");
        Button boton5 = new Button("Evolucionar a Espiral");
        Button boton6 = new Button("Moverse A");
        vbox.getChildren().addAll(boton1,boton2,boton3,boton4,boton5);

    }
}