package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Linea {
    private Esquina esquinaUno;
    private Esquina esquinaDos;
    private ArrayList<Moho> moho;
    //private ArrayList<Moho> obstaculos;
    //private ArrayList<Edificios> sorpresas;

    public Linea(Esquina esquinaUno, Esquina esquinaDos) {
        this.esquinaUno = esquinaUno;
        this.esquinaDos = esquinaDos;
        this.moho = new ArrayList<>();
        //this.edificios = new ArrayList<>();
    }

    public void agregarMoho(Moho moho) {
        this.moho.add(moho);
    }
}
