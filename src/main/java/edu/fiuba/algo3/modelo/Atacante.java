package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.tablero.Ubicacion;

public interface Atacante {
    public void atacar(Atacable atacable);
    public Ubicacion ubicacion();
}
