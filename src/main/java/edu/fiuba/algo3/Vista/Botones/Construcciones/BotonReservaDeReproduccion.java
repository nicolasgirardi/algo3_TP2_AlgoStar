package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.modelo.Juego.Jugador;

public class BotonReservaDeReproduccion extends BotonCeldaTablero {

    public BotonReservaDeReproduccion(BotonCeldaTablero botonACopiar){
        super(botonACopiar, "images/espiral.png");
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
