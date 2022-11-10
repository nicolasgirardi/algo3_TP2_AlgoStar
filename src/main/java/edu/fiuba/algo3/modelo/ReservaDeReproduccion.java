package edu.fiuba.algo3.modelo;

public class ReservaDeReproduccion extends Edificio {

    public ReservaDeReproduccion(int cantTurnosParaSerOperativo, HitPoints HP){
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
