package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Edificio;

import java.util.ArrayList;

public class Ocupante {

    private Mapa mapa;
    private Celda posicion;

    public Ocupante(Celda unaCelda) {

        this.posicion = unaCelda;
        this.mapa = new Mapa();
        this.mapa.crearMapa();


    }

    public ArrayList<Celda> getCeldas() {
        return mapa.getCeldas();
    }


    public Celda obtenerPosicion() {
        return posicion;
    }
}
