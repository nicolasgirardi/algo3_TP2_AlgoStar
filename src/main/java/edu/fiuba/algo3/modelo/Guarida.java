package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Guarida {
    private final int CANTIDAD_TURNOS_OPERATIVO = 12;

    private int turnosRestantesParaSerOperativo;

    private ArrayList<Larva> larvas;

    public Guarida(){
        larvas = new ArrayList<Larva>();
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
    }


    public Hidralisco evolucionar(Larva unaLarva) {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
        return unaLarva.evolucionar(this);
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }
}
