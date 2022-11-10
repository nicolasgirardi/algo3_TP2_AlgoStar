package edu.fiuba.algo3.modelo;

public class PuertoEstelar extends Edificio{

    public PuertoEstelar(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void transportarUnidades(){
        this.tirarEdificioNoOperativoError();
    }
}
