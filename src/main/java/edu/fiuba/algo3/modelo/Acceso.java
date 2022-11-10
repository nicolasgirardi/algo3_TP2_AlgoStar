package edu.fiuba.algo3.modelo;

public class Acceso extends Edificio{

    public Acceso(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void transportarTropas(){
        this.tirarEdificioNoOperativoError();
    }
}
