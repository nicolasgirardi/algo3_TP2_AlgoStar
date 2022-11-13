package edu.fiuba.algo3.modelo;

public class PuertoEstelar extends Edificio{

    private static final int CANTIDAD_TURNOS_OPERATIVO = 10;

    public PuertoEstelar(){
    super(CANTIDAD_TURNOS_OPERATIVO);
    }

    public void transportarUnidades() {
        verififarEdificioOperativo();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

}
