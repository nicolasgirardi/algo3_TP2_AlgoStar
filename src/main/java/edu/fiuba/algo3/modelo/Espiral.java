package edu.fiuba.algo3.modelo;

public class Espiral extends Edificio{

    private static final int CANTIDAD_TURNOS_OPERATIVO = 10;

    private int turnosRestantesParaSerOperativo;

    public Espiral() {
        super(CANTIDAD_TURNOS_OPERATIVO);
    }

    public Mutalisco crearMutalisco() {
        verififarEdificioOperativo();
        return new Mutalisco();

    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

}
