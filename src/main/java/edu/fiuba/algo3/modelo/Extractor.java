package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Extractor extends Edificio {

    ArrayList<Zangano> zanganosTrabajando;
    private Volcan volcan;
    private final int CANTIDAD_TURNOS_OPERATIVO = 6;

    public Extractor(int cantTurnosParaSerOperativo,HitPoints HP){

        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp=HP;
    }

    public  Extractor(Volcan volcan, HitPoints HP){
        this.cantTurnosParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
        this.volcan = volcan;
        hp = HP;
        zanganosTrabajando = new ArrayList<Zangano>();
    }

    public int getCantidadZanganos() {
        tirarEdificioNoOperativoError();
        return zanganosTrabajando.size();
    }


    /*public int extraer() {
        cantTurnosParaSerOperativo--;
        int gasTotal = 0;
        if(cantTurnosParaSerOperativo < 0 && zanganosTrabajando.size() > 0) {
            for (Zangano zangano: zanganosTrabajando){
                gasTotal += zangano.extraerGas();
            }
        }
        return gasTotal;
    }*/

    public void agregarZangano(Zangano nuevoZangano){
        tirarEdificioNoOperativoError();
        tirarMaximaCantidadDeZanganosError();
        nuevoZangano.setTrabajo(new TrabajoGas(volcan));
        zanganosTrabajando.add(nuevoZangano);
    }

    public void tirarMaximaCantidadDeZanganosError(){
        if( zanganosTrabajando.size() == 3 ){
            throw new EdificioNoOperativoError();
        }
    }
}
