package edu.fiuba.algo3.modelo;

public class ReservaDeReproduccion extends Edificio {

    public ReservaDeReproduccion(int cantTurnosParaSerOperativo, Esquina unaEsquina){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        this.posicion = unaEsquina;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void evolucionarLarvas(){
        this.tirarEdificioNoOperativoError();
    }
}
