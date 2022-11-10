package edu.fiuba.algo3.modelo;

public class Direccion {
    protected Mapa mapa;

    public Direccion(Mapa mapa) {this.mapa = mapa;}

    /*public void mover(Celda celda) {
        esquina.actualizar(5, 5);
    }*/


    public Celda obtenerSiguiente(Celda unaCelda) {
        return unaCelda.obtenerSiguiente(5, 5);
    }
}
