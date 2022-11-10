package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.tablero.Celda;

public abstract class Edificio {
    protected int cantTurnosParaSerOperativo;
    protected HitPoints hp;

    protected static Celda posicion;


    public Edificio(){
        cantTurnosParaSerOperativo = 0;
    }

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo  --;
        this.recuperarHP();
    }

    public void tirarEdificioNoOperativoError() {
        if(cantTurnosParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
    }

    public void recibirDaño(int daño){
        hp.recibirDaño(daño);
    }

    public void recuperarHP(){
        hp.regenerar();
    }

    public int vidaActual(){
        return hp.vida();
    }

    public int escudoActual(){
        return hp.escudo();
    }

    public static Celda obtenerPosicion() {
        return posicion;
    }


}
