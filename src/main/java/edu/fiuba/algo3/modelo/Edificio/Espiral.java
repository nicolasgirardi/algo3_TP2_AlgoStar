package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Recurso.Recurso;

import java.util.ArrayList;

public class Espiral extends Edificio {

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

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 150 , 100);
    }

    @Override
    public int consumirGas(int unidadesDeGas) {
        return unidadesDeGas-100;
    }

    @Override
    public int consumirMineral(int unidadesDeMineral) {
        return unidadesDeMineral-150;
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
