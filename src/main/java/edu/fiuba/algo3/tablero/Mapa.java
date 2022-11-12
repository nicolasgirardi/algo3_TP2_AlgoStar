package edu.fiuba.algo3.tablero;

import edu.fiuba.algo3.modelo.Larva;

import java.util.ArrayList;

public class Mapa {

    private ArrayList<Celda> celdas;
    private int dimension_x;
    private int dimension_y;

    public Mapa() {
        celdas = new ArrayList<>();
        dimension_x = 10;
        dimension_y = 10;

    }

    public void crearMapa() {
        // Me creo la matriz de esquinas
        Celda[][] celdas = new Celda[dimension_x][dimension_y];
        for (int x = 0; x < dimension_x; x++) {
            for (int y = 0; y < dimension_y; y++) {
                celdas[x][y] = new Celda(x, y);
                this.agregarCelda(celdas[x][y]);
            }
        }

    }

    private void agregarCelda(Celda celda) {
        this.celdas.add(celda);
    }

    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public Boolean posicionValida(Ocupante ocupante) {
        Celda posOcupante = ocupante.obtenerPosicion();
        return posOcupante.coordenadasValidas(0, 0, dimension_x - 1, dimension_y - 1);


    /*public void agregarEdificio(Celda celda) {
        this.celdas.add(celda);
    }

    public void agregarMoho(Celda celda) {
        this.celdas.add(celda);
    }*/


    }
}