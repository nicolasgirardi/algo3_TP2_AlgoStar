package edu.fiuba.algo3.modelo;

public class Espiral extends Edificio {

    public Espiral(int cantTurnosParaSerOperativo,HitPoints HP){

        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp= HP;
    }

    public void ejecutarTurno() {

        cantTurnosParaSerOperativo--;
        hp.regenerar();
    }

    public void crear(){
        this.tirarEdificioNoOperativoError();
    }
}
