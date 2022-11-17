package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;

import java.util.ArrayList;

public abstract class Raza {

    private int unidadesDeMineral;
    private int unidadesDeGas;
    private ArrayList<Edificio> edificios;

    int cantReservas;

    int cantAccesos;
    public Raza(){
        unidadesDeGas = 0;
        unidadesDeMineral = 200;
        edificios = new ArrayList<Edificio>();
        cantAccesos = 0;
        cantReservas = 0;
    }

    public void agregarEdificio(Edificio edificio){
        edificio.verificarSiPuedeSerConstruido(unidadesDeMineral, unidadesDeGas);
        edificio.fueAgregado(this);
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

    public boolean existeReserva() {
        return (cantReservas > 0) ;
    }

    public void fueAgregadoReserva() {
        cantReservas++;
    }


    public void fueAgregadoAcceso() {
        cantAccesos++;
    }


    public boolean existePuerto() {
        return (cantAccesos>0);
    }
}
