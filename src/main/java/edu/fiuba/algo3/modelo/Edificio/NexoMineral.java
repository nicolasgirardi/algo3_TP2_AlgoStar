package edu.fiuba.algo3.modelo.Edificio;


import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

import java.util.ArrayList;

public class NexoMineral extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 4;
    private static final int CANTIDAD_EXTRACCION = 20;
    private NodoMineral nodoMineral;

    public NexoMineral(NodoMineral nodoMineral){
        super(CANTIDAD_TURNOS_OPERATIVO,50,0) ;
        this.nodoMineral = nodoMineral;
        nodoMineral.ocuparConEdificio(this);
    }


    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public GestionRecurso extraer(){
        verififarEdificioOperativo();
        return nodoMineral.extraer(CANTIDAD_EXTRACCION);
    }

    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral,GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }

    @Override
    public void fueAgregado(Raza raza) {
        return;
    }
}
