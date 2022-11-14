package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;

public class Zangano implements Unidad{

    public int extraer(Recurso recurso){
        return recurso.extraer(10);
    }

    public int extraerMineral(NodoMineral nodoMineral){
        return  nodoMineral.extraerConZangano(10, this);
    }
}
