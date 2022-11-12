package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class NexoMineral extends Edificio{
    private static final int CANTIDAD_TURNOS_OPERATIVO = 4;

    public NexoMineral(){
        super(CANTIDAD_TURNOS_OPERATIVO) ;
    }


    public Mineral recolectarMineral() {
        verififarEdificioOperativo();
        return new Mineral();
    }
}
