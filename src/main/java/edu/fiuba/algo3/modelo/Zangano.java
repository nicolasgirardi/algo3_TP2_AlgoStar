package edu.fiuba.algo3.modelo;

public class Zangano {

    public int extraer(Recurso recurso){
        return recurso.extraer(10);
    }

    public int extraerMineral(NodoMineral nodoMineral){
        return  nodoMineral.extraerConZangano(10, this);
    }
}
