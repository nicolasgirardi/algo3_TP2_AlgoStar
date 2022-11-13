package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Guarida extends Edificio{
    private static final int CANTIDAD_TURNOS_OPERATIVO = 12;
    private ArrayList<Larva> larvas;

    public Guarida(){
        super(CANTIDAD_TURNOS_OPERATIVO);
        larvas = new ArrayList<Larva>();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }


    public Hidralisco evolucionar(Larva unaLarva) {
        verififarEdificioOperativo();
        return unaLarva.evolucionar(this);
    }
}
