package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaProtoss extends Raza{

    ArrayList<Edificio> edificios;

    public RazaProtoss(){
        edificios = new ArrayList<Edificio>();
    }

    public void agregarNuevoEdificio(Edificio unEdificio) {
        edificios.add(unEdificio);
    }
    @Override
    public void ejecutarTurno() {
        edificios.forEach((e ) -> {e.ejecutarTurno(super.razaRecursos);});
    }
}
