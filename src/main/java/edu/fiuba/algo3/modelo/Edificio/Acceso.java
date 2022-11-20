package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

import java.util.ArrayList;

public class Acceso extends Edificio {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private static final int COSTO_GAS = 0;
    private static final int COSTO_MINERAL = 150;


    public Acceso(){
        super(CANTIDAD_TURNOS_OPERATIVO, COSTO_MINERAL, COSTO_GAS);
    }


    public void transportarTropas() {
        verififarEdificioOperativo();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral,GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }

    @Override
    public void fueAgregado(Raza raza) {
        raza.fueAgregadoAcceso();
    }

    public void energizado(ArrayList<Pilon> lista){
        lista.get(0).enRango(ubicacion(),lista);
    }

}
