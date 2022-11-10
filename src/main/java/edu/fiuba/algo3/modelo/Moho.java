package edu.fiuba.algo3.modelo;

public class Moho {
    protected Esquina posicion_anterior;
    protected Esquina posicion;
    public int cantTurnosParaCrecer;


    public Esquina obtenerPosicionAnterior() {
        return posicion_anterior;
    }

    public Moho(Esquina unaEsquina) {
        this.posicion = unaEsquina;
        this.cantTurnosParaCrecer = 2;

    }

    public void mover(Direccion unaDireccion) {
        posicion_anterior = posicion;
        posicion = unaDireccion.obtenerSiguiente(posicion);

    }

    public Esquina obtenerPosicion() {
        return posicion;
    }

    /*public void ejecutarTurno(Mapa mapa) {

        cantTurnosParaCrece++;

        if(cantTurnosParaCrecer%2 == 0){
            mover(new Direccion(mapa));
        }
    }*/


}
