package edu.fiuba.algo3.modelo;

public class Esquina {
    private int posicion_x;
    private int posicion_y;

    public Esquina(int x, int y) {
        this.posicion_x = x;
        this.posicion_y = y;
    }

    public void actualizar(int incremento_x, int incremento_y) {
        this.posicion_x += incremento_x;
        this.posicion_y += incremento_y;
    }

    public Esquina obtenerSiguiente(int incremento_x, int incremento_y) {
        return new Esquina(posicion_x + incremento_x, posicion_y + incremento_y);
    }
    public int obtenerPosicionX() {
        return posicion_x;
    }
    public int obtenerPosicionY() {
        return posicion_y;
    }
}
