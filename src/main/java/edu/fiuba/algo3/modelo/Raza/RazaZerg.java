package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.EstadoZangano.EstadoZangano;

public class RazaZerg extends Raza{


    public void agregarEsteEdificio(EstadoZangano estadoZangano) {
        estadoZangano.agregarseAEstaRaza(this);
    }

}
