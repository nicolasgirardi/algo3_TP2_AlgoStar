package edu.fiuba.algo3.modelo;

public class Pilon extends Edificio{

    public Pilon(int cantTurnosParaSerOperativo,HitPoints HP){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp = HP;
    }

    public void ejecutarTurno() {

        cantTurnosParaSerOperativo--;
        hp.regenerar();
    }

    public void utilizar(){
        this.tirarEdificioNoOperativoError();
    }
}
