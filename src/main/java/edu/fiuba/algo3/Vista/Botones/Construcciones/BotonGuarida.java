package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.modelo.Juego.Jugador;

public class BotonGuarida extends BotonCeldaTablero {

    public BotonGuarida(BotonCeldaTablero botonACopiar){
        super(botonACopiar, "images/guarida.png");
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
