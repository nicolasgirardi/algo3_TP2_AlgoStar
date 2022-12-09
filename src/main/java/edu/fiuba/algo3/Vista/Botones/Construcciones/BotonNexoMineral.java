package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;

public class BotonNexoMineral extends BotonCeldaTablero {

    public BotonNexoMineral(BotonCeldaTablero botonCeldaTablero) {
        super(botonCeldaTablero, "images/nexo.png");
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
