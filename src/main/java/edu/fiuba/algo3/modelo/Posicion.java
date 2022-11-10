package edu.fiuba.algo3.modelo;

public class Posicion {
    int posicionX;
    int posicionY;

    public Posicion(int posicionX, int posicionY){
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public boolean esIgual(Posicion otraPosicion){
        return ( (posicionX == otraPosicion.getPosicionX()) && (posicionY == otraPosicion.getPosicionY()) ) ;

    }

    private int  getPosicionX(){
        return posicionX;
    }


    private int  getPosicionY(){
        return posicionY;
    }


}
