package edu.fiuba.algo3.modelo;

public class Asimilador extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;

    public Asimilador(){
        super(CANTIDAD_TURNOS_OPERATIVO);
    }


    public void prepararCapsula() {
        verififarEdificioOperativo();

    }

    public int extraer(Volcan volcan) {
        return volcan.extraer(20);
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        recurso.agregarEdificio(this);
    }
}
