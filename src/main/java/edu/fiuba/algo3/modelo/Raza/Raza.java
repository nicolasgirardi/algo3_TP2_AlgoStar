package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.Poblacion;

import java.util.ArrayList;

public abstract class Raza {

    private GestionRecurso mineral;
    private GestionRecurso gas;
    private Poblacion poblacion;
    protected ArrayList<Edificio> edificios;
    private ArrayList<Unidad> unidades;
    int cantReservas;
    int cantAccesos;

    public Raza(){
        gas = new GestionRecurso(0);
        mineral = new GestionRecurso(200);
        poblacion = new Poblacion(200);
        edificios = new ArrayList<Edificio>();
        unidades = new ArrayList<Unidad>();
        cantAccesos = 0;
        cantReservas = 0;
    }
    public Raza(GestionRecurso mineral, GestionRecurso gas){
        this.mineral = mineral;
        this.gas = gas;
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
        unidad.verificarConsumoRecurso(mineral,gas);
        unidad.consumirGas(gas);
        unidad.consumirMineral(mineral);
        unidad.aumentarPoblacion(this);
        unidades.add(unidad);
    }

    public void aumentarGas(GestionRecurso gas ){
        this.gas.aumentar(gas);
    }
    public void aumentarMineral(GestionRecurso mineral ){
        this.mineral.aumentar(mineral);
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
    }

    public void matarUnidad(Unidad unaUnidad){
        unidades.remove(unaUnidad);
        unaUnidad.disminuirPoblacion(this);
    }


    public abstract void existenAunEdificios();
}
