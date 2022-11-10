package edu.fiuba.algo3.modelo;

public class Guarida extends Edificio {

    public Guarida(int cantTurnosParaSerOperativo,HitPoints HP){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp = HP;
    }

    public void ejecutarTurno() {

        cantTurnosParaSerOperativo--;
        hp.regenerar();
    }

    public void evolucionarLarvas(){
        this.verificarEdificioEsOperativo();
    }
}
