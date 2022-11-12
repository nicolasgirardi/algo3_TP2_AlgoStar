package edu.fiuba.algo3.tablero;

import java.util.ArrayList;

public class Ocupante {
    private ArrayList<Ocupante> ocupantes;
    private Mapa mapa;
    private Celda posicion;

    public Ocupante(Celda unaCelda) {
        
        this.mapa = new Mapa();
        this.mapa.crearMapa();
        this.ocupantes = new ArrayList<>();
        this.posicion = unaCelda;

    }

    public ArrayList<Celda> getCeldas() {
        return mapa.getCeldas();
    }


    public Celda obtenerPosicion() {
        return posicion;
    }
}
