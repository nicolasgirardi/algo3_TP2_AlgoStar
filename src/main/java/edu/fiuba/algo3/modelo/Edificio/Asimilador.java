package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

import java.util.ArrayList;

public class Asimilador extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;

    public Asimilador(){
        super(CANTIDAD_TURNOS_OPERATIVO,100,0);
    }


    public void prepararCapsula() {
        verififarEdificioOperativo();

    }

    public GestionRecurso extraer(Volcan volcan) {
        return volcan.extraer(20);
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
