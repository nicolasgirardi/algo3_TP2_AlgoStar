package edu.fiuba.algo3.modelo;

public class Espiral extends Edificio {

    public Espiral(int cantTurnosParaSerOperativo, Esquina unaEsquina){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        this.posicion = unaEsquina;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void crear(){
        this.tirarEdificioNoOperativoError();
    }
}
