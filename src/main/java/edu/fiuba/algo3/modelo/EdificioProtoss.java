package edu.fiuba.algo3.modelo;

public abstract class EdificioProtoss {

    protected Posicion posicion;
    protected int cantTurnosParaSerOperativo;
    protected HitPoints hp;
    protected boolean energizado;

    public void ejecutarTurno() {
        cantTurnosParaSerOperativo  --;
        this.recuperarHP();
    }

    public void setearEnergia(Pilon unPilon){
        if(unPilon.posicionEnRango(this.posicion)){
            energizado = true;
        }
    }

    public boolean posicionEnRango(Posicion unaPosicion){
        return true;
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

    public void tirarEdificioNoOperativoError() {
        if(cantTurnosParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
    }

    public boolean getEnergia(){
        return this.energizado;
    }
}
