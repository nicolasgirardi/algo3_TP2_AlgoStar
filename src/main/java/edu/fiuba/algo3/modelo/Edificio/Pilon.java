package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;

import java.util.ArrayList;

public class Pilon extends Edificio {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 5;

    public Pilon(){
        super(CANTIDAD_TURNOS_OPERATIVO);
    }
    public void energizar() {
        verififarEdificioOperativo();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
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
        return unidadesDeMineral-100;
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
    public void enRango(Ubicacion unaUbicacion){
        if(distancia(unaUbicacion)>3){
            throw new ConstruccionFueraDelRangoPilonError();
        }
    }
}
