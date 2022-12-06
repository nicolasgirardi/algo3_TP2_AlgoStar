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

public class BotonUnidadesGenericaHandler implements EventHandler<ActionEvent> {

    private Unidad unidad;
    private VBox vbox;

    private RazaZerg raza;

    public BotonUnidadesGenericaHandler(Unidad unaUnidad, VBox cajita, RazaZerg unaRaza){
        unidad = unaUnidad;
        vbox = cajita;
        raza = unaRaza;
    }

    public void handle(ActionEvent actionEvent){
        vbox.getChildren().clear();
        Button boton1 = new Button("Atacar A");
        Button boton6 = new Button("Moverse A");
        vbox.getChildren().addAll(boton1,boton6);

    }


}
