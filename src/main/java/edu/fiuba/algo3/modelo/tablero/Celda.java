package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Edificio;


import java.util.ArrayList;

public class Celda {
    private int posicion_x;
    private int posicion_y;

    //private ArrayList<Ocupante> ocupantes;
    private Edificio edificio;

    public Celda(int x, int y) {
        this.posicion_x = x;
        this.posicion_y = y;


    }

    public boolean coordenadasValidas(int minimo_x, int minimo_y, int maximo_x, int maximo_y) {
        return posicion_x >= minimo_x && posicion_x <= maximo_x &&
                posicion_y >= minimo_y && posicion_y <= maximo_y;
    }


    /*public Celda aplicarMoho(int incremento1, int incremento2) {
        return new Celda(posicion_x + incremento1, posicion_y + incremento2,);
    }*/

    public Boolean tieneMoho(){
        return true;
    }
}
