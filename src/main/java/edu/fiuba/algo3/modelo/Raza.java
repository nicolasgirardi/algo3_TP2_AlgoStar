package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public abstract class Raza {
    protected RazaRecursos razaRecursos;

    public Raza(){
        razaRecursos = new RazaRecursos();
    }

    public abstract void ejecutarTurno();

    public int getCantidadGas() {
        return razaRecursos.obtenerCantidadGas();
    }

    public int getCantidadMineral() {
        return razaRecursos.obtenerCantidadMineral();
    }

}
