package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Recurso.Volcan;

import java.util.ArrayList;

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

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 100 , 0);
    }

    @Override
    public int consumirGas(int unidadesDeGas) {
        return unidadesDeGas;
    }

    @Override
    public int consumirMineral(int unidadesDeMineral) {
        return (unidadesDeMineral-100);
    }

    @Override
    public void verificarCorrelativas(ArrayList<Edificio> edificios) {
        return;
    }

    @Override
    protected boolean esNecesarioParaConstruirGuarida() {
        return false;
    }

    @Override
    protected boolean esNecesarioParaPuertoEstelar() {
        return false;
    }
}
