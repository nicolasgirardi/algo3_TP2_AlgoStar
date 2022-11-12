package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Extractor {
    private final int CANTIDAD_TURNOS_OPERATIVO = 6;

    private int turnosRestantesParaSerOperativo;

    private ArrayList<Zangano> zanganos;

    public Extractor(){
        zanganos = new ArrayList<Zangano>();
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
    }

    public void agregarZangano(Zangano zangano){
        if(turnosRestantesParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
        zanganos.add(zangano);
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }
}
