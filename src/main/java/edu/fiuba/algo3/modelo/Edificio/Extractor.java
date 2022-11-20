package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.UnidadesRecurso;

import java.util.ArrayList;

public class Extractor extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private ArrayList<Zangano> zanganos;

    public Extractor(){
        super(CANTIDAD_TURNOS_OPERATIVO,100,0);
        zanganos = new ArrayList<Zangano>();
    }


    public void agregarZangano(Zangano zangano){

        verificarExtractorCantidadMaximaDeZanganos();
        verififarEdificioOperativo();
        zanganos.add(zangano);
    }

    public GestionRecurso extraer(Volcan volcan){
        verififarEdificioOperativo();
        GestionRecurso gasAcumulado = new GestionRecurso();
        for(Zangano zangano: zanganos){
            gasAcumulado.aumentar( zangano.extraer(volcan) );
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


    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral,GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }


    @Override
    public void fueAgregado(Raza raza) {
        return;
    }

}
