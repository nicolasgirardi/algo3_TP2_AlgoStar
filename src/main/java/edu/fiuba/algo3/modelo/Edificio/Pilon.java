package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;

import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;

import java.util.ArrayList;

public class Pilon extends Edificio {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 5;

    public Pilon(){
        super(CANTIDAD_TURNOS_OPERATIVO,100,0);
    }

    public Pilon(HitPoints hp ){
        super(hp);
    }

    public void energizar() {
        verififarEdificioOperativo();
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

    public void enRango(Ubicacion unaUbicacion){
        if(distancia(unaUbicacion)>3){
            throw new ConstruccionFueraDelRangoPilonError();
        }
    }
    public void enRango(Ubicacion unaUbicacion,ArrayList<Pilon> lista){
        boolean enRango = false;
        int i = 0;
        while(!enRango && i < lista.size()){
            if(lista.get(0).distancia(unaUbicacion)<=3){
                enRango=true;
            }
            i++;
        }
        if(!enRango){
            throw new ConstruccionFueraDelRangoPilonError();
        }
    }
}

