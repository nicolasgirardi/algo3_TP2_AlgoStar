package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Unidad.Larva;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Unidad.Zerling;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

import java.util.ArrayList;

public class ReservaDeReproduccion extends Edificio {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 12;


    public ReservaDeReproduccion(){
        super(CANTIDAD_TURNOS_OPERATIVO,150,0);
    }


    public Zerling evolucionarLarva(Larva larva) {
        verififarEdificioOperativo();
        return larva.evolucionar(this);

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
        raza.fueAgregadoReserva();
    }

}
