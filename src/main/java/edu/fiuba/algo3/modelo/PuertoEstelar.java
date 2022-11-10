package edu.fiuba.algo3.modelo;

public class PuertoEstelar extends Edificio{

    public PuertoEstelar(int cantTurnosParaSerOperativo,HitPoints HP){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp = HP;
    }

    public void ejecutarTurno() {

        cantTurnosParaSerOperativo--;
        hp.regenerar();
    }

    public void transportarUnidades(){
        this.tirarEdificioNoOperativoError();
    }
}
