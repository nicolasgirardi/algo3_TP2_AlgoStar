package edu.fiuba.algo3.modelo.tablero;

import java.util.ArrayList;

public class Mapa {

    private ArrayList<CeldaMapa> celdas;
    private int dimension_x;
    private int dimension_y;

    public Mapa() {

        celdas = new ArrayList<>();
        dimension_x = 10;
        dimension_y = 10;

    }

    public void crearMapa() {
        // Me creo la matriz de esquinas
        CeldaMapa[][] celdas = new CeldaMapa[dimension_x][dimension_y];
        for (int x = 0; x < dimension_x; x++) {
            for (int y = 0; y < dimension_y; y++) {
                celdas[x][y] = new CeldaVacia(x,y);
                this.agregarCelda(celdas[x][y]);
            }
        }
    }

    private void agregarCelda(CeldaMapa celda) {
        this.celdas.add(celda);
    }

    public ArrayList<CeldaMapa> getCeldas() {
        return celdas;
    }

    public Boolean posicionValida(Ocupante ocupante) {
        CeldaMapa posOcupante = ocupante.obtenerPosicion();
        return posOcupante.coordenadasValidas(0, 0, dimension_x - 1, dimension_y - 1);

    }
}