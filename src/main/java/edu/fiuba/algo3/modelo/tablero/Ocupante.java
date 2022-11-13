package edu.fiuba.algo3.modelo.tablero;

import java.util.ArrayList;

public class Ocupante {

    private Mapa mapa;
    private CeldaMapa posicion;

    public Ocupante(CeldaMapa unaCelda) {

        this.posicion = unaCelda;
        this.mapa = new Mapa();
        this.mapa.crearMapa();

    }

    public CeldaMapa obtenerPosicion() {
        return posicion;
    }
}
