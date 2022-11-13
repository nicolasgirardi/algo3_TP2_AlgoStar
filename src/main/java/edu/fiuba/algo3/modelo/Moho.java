package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.tablero.CeldaMapa;
import edu.fiuba.algo3.modelo.tablero.Mapa;

public class Moho {
    public CeldaMapa posicion;
    public Mapa mapa;
    public Moho(CeldaMapa unaCelda){
        this.posicion = unaCelda;
    }

    public CeldaMapa obtenerPosicion() {
        return posicion;
    }
}
