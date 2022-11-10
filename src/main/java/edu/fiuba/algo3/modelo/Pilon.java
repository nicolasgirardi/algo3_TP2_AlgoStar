package edu.fiuba.algo3.modelo;

public class Pilon extends Edificio{

    public Pilon(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
    }

    public void utilizar(){
        this.tirarEdificioNoOperativoError();
    }
}
