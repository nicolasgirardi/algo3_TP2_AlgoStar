package edu.fiuba.algo3.modelo;

public abstract class Edificio {
    protected int cantTurnosParaSerOperativo;

    public Edificio(){

        cantTurnosParaSerOperativo = 0;
    }

    public void ejecutarTurno() {

    }

    public int extraer() {
        return -1;
    }

    public void tirarEdificioNoOperativoError() {
        if(cantTurnosParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
    }
}
