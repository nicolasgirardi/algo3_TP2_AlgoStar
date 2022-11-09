package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Extractor extends Edificio {

    ArrayList<Zangano> zanganosTrabajando;

    public Extractor(int cantTurnosParaSerOperativo){

        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public int getCantidadZanganos() {
        tirarEdificioNoOperativoError();
        return zanganosTrabajando.size();
    }


    public int extraer() {
        cantTurnosParaSerOperativo--;
        int gasTotal = 0;
        if(cantTurnosParaSerOperativo < 0) {
            for (Zangano zangano: zanganosTrabajando){
                gasTotal += zangano.extraerGas();
            }
        }
        return gasTotal;
    }

    public void agregarZangano(Zangano nuevoZangano){
        tirarEdificioNoOperativoError();
        tirarMaximaCantidadDeZanganosError();
        zanganosTrabajando.add(nuevoZangano);
    }

    public void tirarMaximaCantidadDeZanganosError(){
        if( zanganosTrabajando.size() == 3 ){
            throw new EdificioNoOperativoError();
        }
    }
}
