package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class NexoMineral extends Edificio{
    private static final int CANTIDAD_TURNOS_OPERATIVO = 4;
    private static final int CANTIDAD_EXTRACCION = 20;
    private NodoMineral nodoMineral;

    public NexoMineral(NodoMineral nodoMineral){
        super(CANTIDAD_TURNOS_OPERATIVO) ;
        this.nodoMineral = nodoMineral;
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        recurso.agregarEdificio(this);
    }

    public Mineral recolectarMineral() {
        verififarEdificioOperativo();
        return new Mineral();
    }

    public int extraer(){
        verififarEdificioOperativo();
        return nodoMineral.extraer(CANTIDAD_EXTRACCION );
    }
}
