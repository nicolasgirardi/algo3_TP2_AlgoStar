package edu.fiuba.algo3.modelo;

public class ReservaDeReproduccion extends Edificio {

    public ReservaDeReproduccion(int cantTurnosParaSerOperativo, Celda unaCelda){
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
