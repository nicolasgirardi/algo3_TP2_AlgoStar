package edu.fiuba.algo3.modelo;

public class Acceso extends Edificio{

    public Acceso(int cantTurnosParaSerOperativo,HitPoints HP){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp = HP;
    }

    public void ejecutarTurno() {

        cantTurnosParaSerOperativo--;
        hp.regenerar();
    }

    public void transportarTropas(){
        this.verificarEdificioEsOperativo();
    }
}
