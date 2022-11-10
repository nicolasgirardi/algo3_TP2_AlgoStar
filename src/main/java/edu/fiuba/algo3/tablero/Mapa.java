package edu.fiuba.algo3.tablero;

import java.util.ArrayList;

public class Mapa {
    private ArrayList<Linea> lineas;
    private ArrayList<Celda> celdas;
    private int dimension_x;
    private int dimension_y;



    public Mapa() {
        lineas = new ArrayList<>();
        celdas = new ArrayList<>();
        dimension_x = 10;
        dimension_y = 10;

    }

    public void agregarLinea(Linea linea) {
        this.lineas.add(linea);

    }
}
