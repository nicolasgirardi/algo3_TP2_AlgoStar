package edu.fiuba.algo3.modelo;

public class Acceso {

    private final int CANTIDAD_TURNOS_OPERATIVO = 6;

    private int turnosRestantesParaSerOperativo;


    public Acceso(){
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }


    public void transportarTropas() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
    }
}
