package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg {

    private int unidadesDeMineral;
    private int unidadesDeGas;
    private ArrayList<Edificio> edificios;

    public RazaZerg(){
        unidadesDeGas = 0;
        unidadesDeMineral = 0;
    }

    public void agregarEdificio(Edificio edificio){
        edificio.verificarSiPuedeSerConstruido(unidadesDeMineral, unidadesDeGas);
        edificios.add(edificio);
    }
}
