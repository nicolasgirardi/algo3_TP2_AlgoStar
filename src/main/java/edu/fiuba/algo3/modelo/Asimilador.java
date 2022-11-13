package edu.fiuba.algo3.modelo;

public class Asimilador extends Edificio {
    private Volcan volcan;
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;

    public Asimilador(Volcan volcan){
        super(CANTIDAD_TURNOS_OPERATIVO);
        ocuparVolcan(volcan);
        this.volcan = volcan;
    }

    private void ocuparVolcan(Volcan unVolcan) {
        unVolcan.ocuparVolcan(new VolcanOcupado());
    }


    public void prepararCapsula() {
        verififarEdificioOperativo();

    }

    public int extraer() {
        return volcan.extraer(20);
    }
}
