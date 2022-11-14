package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Unidad.Mutalisco;

public class Zealot {

    public void atacarUnidad(Mutalisco mutalisco) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }

    public void atacarUnidad(Guardian guardian) {
        throw new NoPuedeAtacarUnidadDeAireError();

    }

    public void atacarUnidad(Scout scout) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }
}
