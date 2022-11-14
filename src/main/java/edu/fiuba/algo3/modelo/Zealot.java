package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Unidad.Mutalisco;

public class Zealot {

    public void atacarUnidad(Mutalisco mutalisco) {
        throw new NoSePuedeAtacarALaUnidadError();
    }

    public void atacarUnidad(Guardian guardian) {
        throw new NoSePuedeAtacarALaUnidadError();

    }

    public void atacarUnidad(Scout scout) {
        throw new NoSePuedeAtacarALaUnidadError();
    }
}
