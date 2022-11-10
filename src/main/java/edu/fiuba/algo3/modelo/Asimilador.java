package edu.fiuba.algo3.modelo;

public class Asimilador extends Edificio{

    public Asimilador(int cantTurnosParaSerOperativo,HitPoints HP){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp=HP;
    }

    public void ejecutarTurno() {

        cantTurnosParaSerOperativo--;
        hp.regenerar();
    }

    public void procesarGas(){
        this.tirarEdificioNoOperativoError();
    }
}
