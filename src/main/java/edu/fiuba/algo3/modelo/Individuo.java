package edu.fiuba.algo3.modelo;

public abstract class Individuo  implements Ejecutable{
    int vida;
    Posicion posicion;

    public Individuo(){

    }

    public Posicion getPosicion() {
        return posicion;
    }
}
