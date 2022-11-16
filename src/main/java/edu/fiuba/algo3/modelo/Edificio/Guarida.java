package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Unidad.Hidralisco;
import edu.fiuba.algo3.modelo.Unidad.Larva;
import edu.fiuba.algo3.modelo.Recurso.Recurso;

import java.util.ArrayList;

public class Guarida extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 12;

    public Guarida(){
        super(CANTIDAD_TURNOS_OPERATIVO);
    }
    public Guarida(HitPoints hp){
        super(hp);
    }


    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }


    public Hidralisco evolucionar(Larva unaLarva) {
        verififarEdificioOperativo();
        return unaLarva.evolucionar(this);
    }

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 200 , 100);
    }

    @Override
    public int consumirGas(int unidadesDeGas) {
        return unidadesDeGas-100;
    }

    @Override
    public int consumirMineral(int unidadesDeMineral) {
        return unidadesDeMineral-200;
    }

    @Override
    public void fueAgregado(Raza raza) {
        if( ! raza.existeReserva() ){
            throw new CorrelativaDeConstruccionIncumplidaError();
        }
    }

}
