package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Ataque.Ataque;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;

public interface Atacable {
    public void recibirAtaque(Ataque ataque);
    public Ubicacion ubicacion();
}
