package edu.fiuba.algo3.modelo;

public class Espiral {

    private final int CANTIDAD_TURNOS_OPERATIVO = 10;

    private int turnosRestantesParaSerOperativo;

    public Espiral() {
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
    }

    public Mutalisco crearMutalisco() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
        return new Mutalisco();

    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }
}
