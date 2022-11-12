package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Extractor extends Edificio{
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private ArrayList<Zangano> zanganos;

    public Extractor(){
        super(CANTIDAD_TURNOS_OPERATIVO);
        zanganos = new ArrayList<Zangano>();

    }

    public void agregarZangano(Zangano zangano){
        verififarEdificioOperativo();
        zanganos.add(zangano);
    }
}
