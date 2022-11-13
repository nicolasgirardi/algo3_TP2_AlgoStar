package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Moho;

public class CeldaMapa {
    private int posicion_x;
    private int posicion_y;

    private Moho moho;

    public CeldaMapa(int x, int y) {
        this.posicion_x = x;
        this.posicion_y = y;


    }

    public boolean coordenadasValidas(int minimo_x, int minimo_y, int maximo_x, int maximo_y) {
        return posicion_x >= minimo_x && posicion_x <= maximo_x &&
                posicion_y >= minimo_y && posicion_y <= maximo_y;
    }


    public Boolean estaOcupado(Moho moho) {
        if (moho.obtenerPosicion().posicion_x == posicion_x ) {
            return true;
        }
        return false;
    }

}
