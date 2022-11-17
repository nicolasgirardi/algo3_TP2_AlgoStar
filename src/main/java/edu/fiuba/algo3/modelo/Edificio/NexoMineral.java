package edu.fiuba.algo3.modelo.Edificio;


import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;

import java.util.ArrayList;

public class NexoMineral extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 4;
    private static final int CANTIDAD_EXTRACCION = 20;
    private NodoMineral nodoMineral;

    public NexoMineral(NodoMineral nodoMineral){
        super(CANTIDAD_TURNOS_OPERATIVO) ;
        this.nodoMineral = nodoMineral;
        nodoMineral.ocuparConEdificio(this);
    }


    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public int extraer(){
        verififarEdificioOperativo();
        return nodoMineral.extraer(CANTIDAD_EXTRACCION );
    }

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 50 , 0);
    }

    @Override
    public int consumirGas(int unidadesDeGas) {
        return unidadesDeGas;
    }

    @Override
    public int consumirMineral(int unidadesDeMineral) {
        return unidadesDeMineral-50;
    }

    @Override
    public void fueAgregado(Raza raza) {
        return;
    }
}
