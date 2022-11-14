package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;

import java.util.ArrayList;

public abstract class Raza {

    private int unidadesDeMineral;
    private int unidadesDeGas;
    private ArrayList<Edificio> edificios;

    public Raza(){
        unidadesDeGas = 0;
        unidadesDeMineral = 200;
        edificios = new ArrayList<Edificio>();
    }

    public void agregarEdificio(Edificio edificio){
        edificio.verificarSiPuedeSerConstruido(unidadesDeMineral, unidadesDeGas);
        edificio.verificarCorrelativas(edificios);
        unidadesDeGas = edificio.consumirGas(unidadesDeGas);
        unidadesDeMineral = edificio.consumirMineral(unidadesDeMineral);
        edificios.add(edificio);
    }

    public void aumentarRecursos(int unidadesDeMineral, int unidadesDeGas ){
        this.unidadesDeGas += unidadesDeGas;
        this.unidadesDeMineral += unidadesDeMineral;
    }

    public void verficarConsumoRecurso(int cantMineralConsumir, int cantGasConsumir){
        if( this.unidadesDeMineral < cantMineralConsumir || this.unidadesDeGas < cantGasConsumir ) {
            throw new RecursosInsuficientesError();
        }

    }
}
