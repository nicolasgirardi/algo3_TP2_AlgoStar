package edu.fiuba.algo3.modelo.Edificio.Zerg;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelMohoError;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.ExtractorCantidadMaximaDeZanganosError;
import edu.fiuba.algo3.modelo.EstadoZangano.EstadoZangano;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Tierra;

import java.util.ArrayList;

public class Extractor extends Edificio implements EstadoZangano {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private ArrayList<Zangano> zanganos;

    public Extractor(){
        super(CANTIDAD_TURNOS_OPERATIVO,new HPZerg(750),100,0);
        zanganos = new ArrayList<Zangano>();
    }

    public void agregarZangano(Zangano zangano){

        verificarExtractorCantidadMaximaDeZanganos();
        verififarEdificioOperativo();
        zanganos.add(zangano);
    }

    public GestionRecurso extraer(Recurso recurso){
        verififarEdificioOperativo();
        GestionRecurso gasAcumulado = new GestionRecurso();
        for(Zangano zangano: zanganos){
            gasAcumulado.aumentar( zangano.extraer(recurso) );
        }
        return gasAcumulado;
    }

    @Override
    public Hidralisco evolucionarLarvaAHidra(Larva larva) {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public void evolucionarLarvaAZerli(Larva larva) {
        throw new NoDeberiaEjecutarEsteMetodoError();
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
        this.raza = raza;
        return;
    }

    @Override
    public void instalar(Tierra tierra) {
        throw  new ConstruccionFueraDelMohoError();
    }

    @Override
    public void instalar(Moho moho) {
        return;
    }


    @Override
    public void evolucionarLarva() {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public void agregarseAEstaRaza(RazaZerg razaZerg) {
        razaZerg.agregarEdificio(this);
    }

    @Override
    public Mutalisco crearMutalisco() {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

}
