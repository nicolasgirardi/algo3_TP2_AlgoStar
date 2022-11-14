package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaProtoss {
    private int unidadesDeMineral;
    private int unidadesDeGas;
    private ArrayList<Edificio> edificios;

    public RazaProtoss(){
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
