package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class NexoMineral {

    private final int CANTIDAD_TURNOS_OPERATIVO = 4;

    private int turnosRestantesParaSerOperativo;


    public NexoMineral(){
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO ;
    }


    public Mineral recolectarMineral() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw  new EdificioNoOperativoError();
        }
        return new Mineral();
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }
}
