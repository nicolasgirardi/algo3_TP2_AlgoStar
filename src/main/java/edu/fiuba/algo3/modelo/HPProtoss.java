package edu.fiuba.algo3.modelo;

public class HPProtoss implements HitPoints {

    private int vidaMax;
    private int escudoMax;
    private int vidaActual;
    private int escudoActual;

    public HPProtoss(int Vida,int Escudo){
        vidaMax = Vida;
        escudoMax = Escudo;
        vidaActual = Vida;
        escudoActual = Escudo;
    }
    @Override
    public void recibirDaño(int daño) {
       vidaActual = Math.min(vidaActual,escudoActual+vidaActual-daño);
       escudoActual = Math.max(escudoActual-daño,0);

    }

    @Override
    public void regenerar() {
        escudoActual = Math.min(escudoMax,escudoActual+cura());
    }

    @Override
    public int vida() {
        return vidaActual;
    }

    @Override
    public int escudo() {
        return 0;
    }
    private int cura(){
        return escudoMax/4;
    }
}