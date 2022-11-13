package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Extractor extends Edificio{
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private ArrayList<Zangano> zanganos;
    private Volcan volcan;

    public Extractor(Volcan unVolcan){
        super(CANTIDAD_TURNOS_OPERATIVO);
        ocuparVolcan(unVolcan);
        this.volcan = unVolcan;
        zanganos = new ArrayList<Zangano>();
    }

    private void ocuparVolcan(Volcan unVolcan) {
        unVolcan.ocuparVolcan(new VolcanOcupado());
    }

    public void agregarZangano(Zangano zangano){

        verificarExtractorCantidadMaximaDeZanganos();
        verififarEdificioOperativo();
        zanganos.add(zangano);
    }

    public int extraer(){
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
}
