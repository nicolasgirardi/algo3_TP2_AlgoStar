package edu.fiuba.algo3.modelo;

public class Espiral extends Edificio {

    public Espiral(int cantTurnosParaSerOperativo, Celda unaCelda){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        this.posicion = unaCelda;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void crear(){
        this.tirarEdificioNoOperativoError();
    }
}
