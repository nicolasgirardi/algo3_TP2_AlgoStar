package edu.fiuba.algo3.modelo;

public class Moho {
    protected Esquina posicion_anterior;
    protected Esquina posicion;


    public Esquina obtenerPosicionAnterior() {
        return posicion_anterior;
    }

    public Moho(Esquina unaEsquina) {
        this.posicion = unaEsquina;
    }

    public void mover(Direccion unaDireccion) {
        posicion_anterior = posicion;
        posicion = unaDireccion.obtenerSiguiente(posicion);

    }

    public Esquina obtenerPosicion() {
        return posicion;
    }
}
