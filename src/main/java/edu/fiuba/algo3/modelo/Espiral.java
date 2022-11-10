package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.tablero.Celda;

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
