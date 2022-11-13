package edu.fiuba.algo3.modelo.tablero;



import edu.fiuba.algo3.modelo.Edificio;
import edu.fiuba.algo3.modelo.Moho;

import java.util.ArrayList;

public class CeldaOcupada{
    public Moho moho;
    public Celda posicion;


    public CeldaOcupada(Moho unMoho, Celda unaCelda) {
        this.moho = unMoho;
        this.posicion = unaCelda;
    }

}
