package edu.fiuba.algo3.modelo;

import java.util.ArrayList;


public class Linea {
    private Esquina esquinaUno;
    private Esquina esquinaDos;
    private ArrayList<Moho> moho;

    private ArrayList<Edificio> edificio;
    //private ArrayList<Moho> obstaculos;
    //private ArrayList<Edificios> sorpresas;

    public Linea(Esquina esquinaUno, Esquina esquinaDos) {
        this.esquinaUno = esquinaUno;
        this.esquinaDos = esquinaDos;
        this.moho = new ArrayList<>();
        this.edificio = new ArrayList<>();
    }

    public void agregarMoho(Moho moho) {
        this.moho.add(moho);
    }

    public void agregarNuevoEdificio(Edificio edificio) {
        if (esquinaDos.obtenerPosicionX() >= edificio.obtenerPosicion().obtenerPosicionX()){
            this.edificio.add(edificio);
        }
        //error

    }
}
