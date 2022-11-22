package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Juego.FinDePartida;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.Poblacion;
import edu.fiuba.algo3.modelo.tablero.*;

import java.util.ArrayList;

public abstract class Raza {

    protected GestionRecurso mineral;
    protected GestionRecurso gas;
    protected GestionRecurso suministro;
    protected Poblacion poblacion;
    protected ArrayList<Edificio> edificios;

    protected ArrayList<Unidad> unidades;

    protected int cantReservas;

    protected int cantAccesos;
    public Raza(){
        gas = new GestionRecurso(0);
        mineral = new GestionRecurso(200);
        poblacion = new Poblacion(200);
        edificios = new ArrayList<Edificio>();
        unidades = new ArrayList<Unidad>();
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

    public void agregarUnidad(Unidad unidad){
        //unidad.verificarSiPuedeSerCreado(poblacion);
        unidad.aumentarPoblacion(this);
        unidades.add(unidad);

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

    public void verficarConsumoSuministros(int cantSuministroConsumiro){
        if(!this.mineral.puedeConsumir(cantSuministroConsumiro)) {
            throw new RecursosInsuficientesError();
        }
    }


    public void aumentarCapacidad(int unaPoblacion) {
        poblacion.aumentarCapacidad(unaPoblacion);
    }

    public void disminuirCapacidad(int unaPoblacion) {
        poblacion.disminuirCapacidad(unaPoblacion);
    }

    public void aumentarPoblacion(int costoPoblacion) {
        poblacion.aumentarPoblacion(costoPoblacion);
    }

    public void disminuirPoblacion(int costoPoblacion) {
        poblacion.disminuirPoblacion(costoPoblacion);
    }
    public int capacidadReal(){
        return poblacion.capacidadReal();
    }

    public void destruirEdificio(Edificio unEdificio){
        edificios.remove(unEdificio);
        unEdificio.disminuirCapacidad(this);
        if (edificios.size()==0)
            throw new FinDePartida();
    }

    public void matarUnidad(Unidad unaUnidad){
        unidades.remove(unaUnidad);
        unaUnidad.disminuirPoblacion(this);
    }
    public abstract void construirBase(Ubicacion unaUbicacion,Mapa mapa);
}
