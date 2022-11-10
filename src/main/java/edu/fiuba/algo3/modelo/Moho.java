package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.tablero.Celda;
import edu.fiuba.algo3.tablero.Direccion;

public class Moho {
    protected Celda posicion_anterior;
    protected Celda posicion;
    public int cantTurnosParaCrecer;


    public Celda obtenerPosicionAnterior() {
        return posicion_anterior;
    }

    public Moho(Celda unaCelda) {
        this.posicion = unaCelda;
        this.cantTurnosParaCrecer = 2;

    }

    public void mover(Direccion unaDireccion) {
        posicion_anterior = posicion;
        posicion = unaDireccion.obtenerSiguiente(posicion);

    }

    public Celda obtenerPosicion() {
        return posicion;
    }

    /*public void ejecutarTurno(Mapa mapa) {

        cantTurnosParaCrece++;

        if(cantTurnosParaCrecer%2 == 0){
            mover(new Direccion(mapa));
        }
    }*/


}
