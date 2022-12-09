package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.Vista.Botones.BotonTierra;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Observers.ObservadorJugadorActivo;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class BotonAcceso extends BotonCeldaTablero {

    public BotonAcceso(BotonTierra botonTierra) {
        super(botonTierra, "images/acceso.png");
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
