package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Raza.RazaZerg;
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

    private Zangano zangano;
    private VBox vbox;

    private RazaZerg raza;

    public BotonZanganoHandler(Zangano unidad, VBox cajita, RazaZerg unaRaza){
        zangano = unidad;
        vbox = cajita;
        raza = unaRaza;
    }

    public void handle(ActionEvent actionEvent){
        vbox.getChildren().clear();
        Button boton1 = new Button("Mutar a Criadero");
        boton1.setOnAction(new BotonEvolucionarACriaderoHandler(zangano, boton1, raza));
        Button boton2 = new Button("Evolucionar a Reserva de Produccion");
        boton2.setOnAction(new BotonEvolucionarAReservaHandler(zangano,boton2,raza));
        Button boton3 = new Button("Evolucionar a Extractor");
        boton2.setOnAction(new BotonEvolucionarAExtractorHandler(zangano,boton2,raza));
        Button boton4 = new Button("Evolucionar a Guarida");
        boton2.setOnAction(new BotonEvolucionarAGuaridaHandler(zangano,boton2,raza));
        Button boton5 = new Button("Evolucionar a Espiral");
        boton2.setOnAction(new BotonEvolucionarAEspiralHandler(zangano,boton2,raza));
        Button boton6 = new Button("Moverse A");
        vbox.getChildren().addAll(boton1,boton2,boton3,boton4,boton5,boton6);

    }
}
