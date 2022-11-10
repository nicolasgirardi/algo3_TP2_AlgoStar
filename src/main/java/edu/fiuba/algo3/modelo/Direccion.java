package edu.fiuba.algo3.modelo;

public class Direccion {
    protected Mapa mapa;

    public Direccion(Mapa mapa) {this.mapa = mapa;}

    /*public void mover(Esquina esquina) {
        esquina.actualizar(5, 5);
    }*/


    public Esquina obtenerSiguiente(Esquina unaEsquina) {
        return unaEsquina.obtenerSiguiente(5, 5);
    }
}
