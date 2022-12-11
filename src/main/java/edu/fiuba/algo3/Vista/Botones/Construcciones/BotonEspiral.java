package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.modelo.Juego.Jugador;

public class BotonEspiral extends BotonCeldaTablero {

    public BotonEspiral(BotonCeldaTablero botonACopiar){
        super(botonACopiar, "images/espiral.png");
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
