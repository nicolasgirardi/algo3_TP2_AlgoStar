package edu.fiuba.algo3.tablero;

import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Moho;
import edu.fiuba.algo3.tablero.Celda;

import java.util.ArrayList;


public class Linea {
    private Celda celdaUno;
    private Celda celdaDos;
    private ArrayList<Moho> moho;

    private ArrayList<Edificio> edificio;
    //private ArrayList<Moho> obstaculos;
    //private ArrayList<Edificios> sorpresas;

    public Linea(Celda celdaUno, Celda celdaDos) {
        this.celdaUno = celdaUno;
        this.celdaDos = celdaDos;
        this.moho = new ArrayList<>();
        this.edificio = new ArrayList<>();
    }

    public void agregarMoho(Moho moho) {
        this.moho.add(moho);
    }

    public void agregarNuevoEdificio(Edificio edificio) {
        if (celdaDos.obtenerPosicionX() >= edificio.obtenerPosicion().obtenerPosicionX()){
            this.edificio.add(edificio);
        }else {
            throw new EdificioNoOperativoError();

        }
        //error

    }
}
