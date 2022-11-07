package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Criadero extends  Edificio {
    ArrayList<Individuo> larvas;

    public Criadero(){
        larvas = new ArrayList<Individuo>();
        larvas.add(new Individuo( new Larva() ) );
        larvas.add(new Individuo( new Larva() ) );
        larvas.add(new Individuo( new Larva() ) );
    }

    public int getCantidadLarvas() {
        return larvas.size();
    }

    public Individuo obtenerLarva() {
        return larvas.remove(0);
    }
}
