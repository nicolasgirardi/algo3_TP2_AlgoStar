package edu.fiuba.algo3.tablero;

public class Celda {
    private int posicion_x;
    private int posicion_y;
    public Celda(int x, int y) {

        this.posicion_x = x;
        this.posicion_y = y;
    }

    public boolean coordenadasValidas(int minimo_x, int minimo_y, int maximo_x, int maximo_y) {
        return posicion_x >= minimo_x && posicion_x <= maximo_x &&
                posicion_y >= minimo_y && posicion_y <= maximo_y;
    }






}
