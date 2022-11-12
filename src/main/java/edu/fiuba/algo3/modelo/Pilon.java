package edu.fiuba.algo3.modelo;

public class Pilon extends Edificio{

    private static final int CANTIDAD_TURNOS_OPERATIVO = 5;

    public Pilon(){
        super(CANTIDAD_TURNOS_OPERATIVO);
    }
    public void energizar() {
        verififarEdificioOperativo();
    }
}
