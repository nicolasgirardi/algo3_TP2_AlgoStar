package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Recurso.Recurso;

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
}
