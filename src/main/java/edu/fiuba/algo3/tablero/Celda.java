package edu.fiuba.algo3.tablero;

public class Celda {
    private int posicion_x;
    private int posicion_y;

    public Celda(int x, int y) {
        this.posicion_x = x;
        this.posicion_y = y;
    }

    /*public void actualizar(int incremento_x, int incremento_y) {
        this.posicion_x += incremento_x;
        this.posicion_y += incremento_y;
    }no uso esta clase
    */
    public void actualizar() {
        this.posicion_x += 1;
        this.posicion_y += 1;
    }

    public Celda obtenerSiguiente(int incremento_x, int incremento_y) {
        return new Celda(posicion_x + incremento_x, posicion_y + incremento_y);
    }
    public int obtenerPosicionX() {
        return posicion_x;
    }
    public int obtenerPosicionY() {
        return posicion_y;
    }
}
