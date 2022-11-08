package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Extractor extends Edificio {

    ArrayList<Zangano> zanganosTrabajando;

    public Extractor(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
        if(cantTurnosParaSerOperativo < 0){

        }
    }


}
