package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaProtoss {

    ArrayList<EdificioProtoss> edificios;

    public void agregarEdificioProtoss(EdificioProtoss unEdificio){
        edificios.add(unEdificio);
    }

    public void eliminarEdificioProtoss(){
        edificios.remove(1);
    }

    public boolean getEnergiaEdificio(){
        return edificios.get(0).getEnergia();
    }
}
