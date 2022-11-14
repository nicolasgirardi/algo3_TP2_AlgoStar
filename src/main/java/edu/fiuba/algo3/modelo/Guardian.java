package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Unidad.Mutalisco;

public class Guardian {
    public void atacarUnidad(Mutalisco mutalisco) {
        throw new NoSePuedeAtacarALaUnidadError();
    }

    public void atacarUnidad(Guardian guardianDos) {
        throw new NoSePuedeAtacarALaUnidadError();
    }

    public void atacarUnidad(Scout scout) {
        throw new NoSePuedeAtacarALaUnidadError();
    }
}
