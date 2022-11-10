package edu.fiuba.algo3.modelo;

public class Espiral extends Edificio {

    public Espiral(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void crear(){
        this.tirarEdificioNoOperativoError();
    }
}
