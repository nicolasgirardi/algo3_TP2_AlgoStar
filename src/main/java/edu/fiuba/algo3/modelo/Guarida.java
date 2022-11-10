package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.tablero.Celda;

public class Guarida extends Edificio {

    public Guarida(int cantTurnosParaSerOperativo, Celda unaCelda){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        this.posicion = unaCelda;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void evolucionarLarvas(){
        this.tirarEdificioNoOperativoError();
    }
}
