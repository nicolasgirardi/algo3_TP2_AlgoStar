package edu.fiuba.algo3.modelo;

public class Asimilador {

    private final int CANTIDAD_TURNOS_OPERATIVO = 6;

    private int turnosRestantesParaSerOperativo;

    public Asimilador(){
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }


    public void prepararCapsula() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }

    }
}
