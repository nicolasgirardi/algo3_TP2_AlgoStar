package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Mapa {
    private ArrayList<Linea> cuadras;
    private ArrayList<Esquina> esquinas;
    private int dimension_x;
    private int dimension_y;



    public Mapa() {
        cuadras = new ArrayList<>();
        esquinas = new ArrayList<>();
        dimension_x = 10;
        dimension_y = 10;

    }

    public void agregarCuadra(Linea cuadra) {
        this.cuadras.add(cuadra);

    }
}
