package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

import java.util.ArrayList;

public class PuertoEstelar extends Edificio {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 10;

    public PuertoEstelar(){
    super(CANTIDAD_TURNOS_OPERATIVO,150,150);
    }

    public void transportarUnidades() {
        verififarEdificioOperativo();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral, GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }

    @Override
    public void fueAgregado(Raza raza) {
        if( ! raza.existePuerto() ){
            throw new CorrelativaDeConstruccionIncumplidaError();
        }

    }

}
