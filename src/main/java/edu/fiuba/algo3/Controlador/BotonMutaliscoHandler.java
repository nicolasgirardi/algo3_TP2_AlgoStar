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

public class BotonMutaliscoHandler implements EventHandler<ActionEvent> {

    private Mutalisco mutalisco;
    private VBox vbox;

    private RazaZerg raza;

    public BotonMutaliscoHandler(Mutalisco unidad, VBox cajita, RazaZerg unaRaza){
        mutalisco = unidad;
        vbox = cajita;
        raza = unaRaza;
    }

    public void handle(ActionEvent actionEvent){
        vbox.getChildren().clear();
        Button boton1 = new Button("Evolucionar a Guardian");
        boton1.setOnAction(new BotonEvolucionarAGuardian(mutalisco, boton1, raza));
        Button boton2 = new Button("Evolucionar a Devorador");
        boton2.setOnAction(new BotonEvolucionarADevorador(mutalisco,boton2,raza));
        Button boton3 = new Button("Atacar");
        Button boton6 = new Button("Moverse A");
        vbox.getChildren().addAll(boton1,boton2,boton3,boton6);

    }
}
