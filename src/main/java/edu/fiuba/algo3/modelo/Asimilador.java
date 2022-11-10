package edu.fiuba.algo3.modelo;

public class Asimilador extends EdificioProtoss{

    public Asimilador(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void procesarGas(){
        this.tirarEdificioNoOperativoError();
    }
}
