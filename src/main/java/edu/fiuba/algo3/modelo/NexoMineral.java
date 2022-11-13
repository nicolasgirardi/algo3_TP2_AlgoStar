package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class NexoMineral extends Edificio{
    private static final int CANTIDAD_TURNOS_OPERATIVO = 4;
    private static final int CANTIDAD_EXTRACCION = 20;
    private NodoMineral nodoMineral;

    public NexoMineral(NodoMineral nodoMineral){
        super(CANTIDAD_TURNOS_OPERATIVO) ;
        this.nodoMineral = nodoMineral;
    }

    //Estoy haciendo este segundo constructor para caso 3, pero creo que despues tengo que refac
    //torizar como con volcan para que quede solo 1 constructor.
    public NexoMineral(){
        super(CANTIDAD_TURNOS_OPERATIVO) ;
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public Mineral recolectarMineral() {
        verififarEdificioOperativo();
        return new Mineral();
    }

    public int extraer(){
        verififarEdificioOperativo();
        return nodoMineral.extraer(CANTIDAD_EXTRACCION );
    }
}
