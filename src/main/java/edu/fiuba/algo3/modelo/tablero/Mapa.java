package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Celda;
import edu.fiuba.algo3.modelo.Edificio.Pilon;
import edu.fiuba.algo3.modelo.Moho;

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
        for (int x = 0; x < dimension_x; x++) {
            for (int y = 0; y < dimension_y; y++) {
                Celda celda = new Celda(x,y);
                this.agregarCelda(celda);
            }
        }
    }

    private void agregarCelda(Celda celda) {
        this.celdas.add(celda);
    }

    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public Boolean posicionValida(Moho moho) {
        Celda posCelda = moho.obtenerPosicion();
        return posCelda.coordenadasValidas(0, 0, dimension_x - 1, dimension_y - 1);

    }
}