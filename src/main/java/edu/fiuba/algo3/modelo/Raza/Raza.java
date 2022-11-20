package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

import java.util.ArrayList;

public abstract class Raza {

    private GestionRecurso mineral;
    private GestionRecurso gas;
    private ArrayList<Edificio> edificios;

    int cantReservas;

    int cantAccesos;
    public Raza(){
        gas = new GestionRecurso(0);
        mineral = new GestionRecurso(200);
        edificios = new ArrayList<Edificio>();
        cantAccesos = 0;
        cantReservas = 0;
    }

    public void agregarEdificio(Edificio edificio){
        edificio.verificarSiPuedeSerConstruido(mineral, gas);
        edificio.fueAgregado(this);
        edificio.consumirGas(gas);
        edificio.consumirMineral(mineral);
        edificios.add(edificio);
    }

    public void aumentarGas(GestionRecurso gas ){
        this.gas.aumentar(gas);
    }
    public void aumentarMineral(GestionRecurso mineral ){
        this.mineral.aumentar(mineral);
    }

    public void verficarConsumoRecurso(int cantMineralConsumir, int cantGasConsumir){
        if( !this.mineral.puedeConsumir(cantMineralConsumir) || !this.gas.puedeConsumir(cantGasConsumir)) {
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
