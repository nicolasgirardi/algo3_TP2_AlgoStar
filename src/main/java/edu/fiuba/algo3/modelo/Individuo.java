package edu.fiuba.algo3.modelo;

public class Individuo {
    int vida;
    TipoEvolucion evolucionActual;

    public Individuo(TipoEvolucion unTipo){
        evolucionActual = unTipo;
    }

    public void evolucionar(TipoEvolucion unTipo) {
        evolucionActual = unTipo;
    }
}
