package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Extractor extends Edificio{
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private ArrayList<Zangano> zanganos;

    public Extractor(){
        super(CANTIDAD_TURNOS_OPERATIVO);
        zanganos = new ArrayList<Zangano>();
    }


    public void agregarZangano(Zangano zangano){

        verificarExtractorCantidadMaximaDeZanganos();
        verififarEdificioOperativo();
        zanganos.add(zangano);
    }

    public int extraer(Volcan volcan){
        verififarEdificioOperativo();
        int gasAcumulado = 0;
        for(Zangano zangano: zanganos){
            gasAcumulado += zangano.extraer(volcan);
        }
        return gasAcumulado;
    }

    private void verificarExtractorCantidadMaximaDeZanganos(){
        if(zanganos.size() == 3 ){
            throw new ExtractorCantidadMaximaDeZanganosError();
        }
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
        return unidadesDeMineral -100 ;
    }
}
