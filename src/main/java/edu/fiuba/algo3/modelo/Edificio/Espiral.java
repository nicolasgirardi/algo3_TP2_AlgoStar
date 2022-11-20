package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

import java.util.ArrayList;

public class Espiral extends Edificio {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 10;


    public Espiral() {
        super(CANTIDAD_TURNOS_OPERATIVO,150,100);
    }

    public Mutalisco crearMutalisco() {
        verififarEdificioOperativo();
        return new Mutalisco(new HPZerg(120));
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
        return;
    }

}
