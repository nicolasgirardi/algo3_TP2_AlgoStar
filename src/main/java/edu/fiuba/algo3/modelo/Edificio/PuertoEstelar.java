package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Recurso.Recurso;

import java.util.ArrayList;

public class PuertoEstelar extends Edificio {

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

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 150 , 150);
    }

    @Override
    public int consumirGas(int unidadesDeGas) {
        return unidadesDeGas - 150;
    }

    @Override
    public int consumirMineral(int unidadesDeMineral) {
        return unidadesDeMineral - 150 ;
    }

    @Override
    public void verificarCorrelativas(ArrayList<Edificio> edificios) {
        for(Edificio edificioAct : edificios){
            if(edificioAct.esNecesarioParaPuertoEstelar() ){
                return;
            }
        }
        throw new CorrelativaDeConstruccionIncumplidaError();
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
