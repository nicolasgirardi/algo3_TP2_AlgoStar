package edu.fiuba.algo3.modelo.tablero;

import java.util.HashMap;

public class Base {
    private  Integer factor;
    private HashMap<Integer,Mapa> mapas;

    public Base() {
        factor = (int) (Math.random()*3) + 1;
        inicializarHasMap();
    }

    public Base(int factor) {
        this.factor = factor;
        inicializarHasMap();
    }

    private void inicializarHasMap(){
        mapas = new HashMap<>();
        mapas.put(1,new Mapa(10,10));
        mapas.put(2,new Mapa(15,15));
        mapas.put(3,new Mapa(18,18));
    }


    public Mapa getMapa(){
        return mapas.get(factor);
    }
}
