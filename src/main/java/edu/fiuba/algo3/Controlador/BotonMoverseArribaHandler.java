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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.*;
import javafx.scene.text.Text;

public class BotonMoverseArribaHandler implements EventHandler<ActionEvent> {

    private Unidad unidad;
    private Button boton;

    private Text texto;


    public BotonMoverseArribaHandler(Unidad unaUnidad, Button unBoton, Text unTexto) {
        unidad = unaUnidad;
        boton = unBoton;
        texto = unTexto;
    }

    public void handle(ActionEvent actionEvent) {
        try {
            unidad.moverseArriba();
            texto.setText("Se puede mover usando las flechas del teclado");
        } catch (Throwable e) {
            texto.setText("La unidad no puede moverse a ese lugar");
        }
    }
}
