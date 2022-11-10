package edu.fiuba.algo3.modelo;

public class Guarida extends Edificio {

    public Guarida(int cantTurnosParaSerOperativo, Esquina unaEsquina){
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
