package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Unidad.Mutalisco;

public class Guardian {
    public void atacarUnidad(Mutalisco mutalisco) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }

    public void atacarUnidad(Guardian guardianDos) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }

    public void atacarUnidad(Scout scout) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }
}
