package edu.fiuba.algo3.modelo;

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
