package edu.fiuba.algo3.modelo;

public class ReservaDeReproduccion extends Edificio {

    public ReservaDeReproduccion(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void evolucionarLarvas(){
        this.tirarEdificioNoOperativoError();
    }
}
