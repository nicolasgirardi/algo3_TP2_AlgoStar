package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Celda;
import edu.fiuba.algo3.modelo.tablero.Mapa;

public class Moho {
    public Celda posicion;

    public Mapa mapa;
    public Moho(Celda unaCelda){
        this.posicion = unaCelda;
    }
    public Moho(){}

    public Celda obtenerPosicion() {
        return posicion;
    }
}
