package edu.fiuba.algo3.modelo;

public class PuertoEstelar {

    private final int CANTIDAD_TURNOS_OPERATIVO = 10;

    private int turnosRestantesParaSerOperativo;

    public PuertoEstelar(){
    turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }


    public void transportarUnidades() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
    }

}
