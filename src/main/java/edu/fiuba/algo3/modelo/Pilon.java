package edu.fiuba.algo3.modelo;

public class Pilon {

    private final int CANTIDAD_TURNOS_OPERATIVO = 5;

    private int turnosRestantesParaSerOperativo;

    public Pilon(){
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
    }
    public void energizar() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw  new EdificioNoOperativoError();
        }

    }


    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }
}
