package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Guardian;
import edu.fiuba.algo3.modelo.NoPuedeAtacarUnidadDeAireError;
import edu.fiuba.algo3.modelo.Scout;

public class Zerling implements Unidad{
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
