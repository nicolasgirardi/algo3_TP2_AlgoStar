package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.Edificio;

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
        unidadesDeGas = edificio.consumirGas(unidadesDeGas);
        unidadesDeMineral = edificio.consumirMineral(unidadesDeMineral);
        edificios.add(edificio);
    }
}
