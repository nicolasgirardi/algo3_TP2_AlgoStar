package edu.fiuba.algo3.modelo;

public class HPZerg implements HitPoints {

    private int vidaMax;
    private int vidaActual;

    public HPZerg(int Vida){
        vidaMax = Vida;
        vidaActual = Vida;
    }
    @Override
    public void recibirDaño(int daño) {
        vidaActual = vidaActual - daño;
    }

    @Override
    public void regenerar() {

        vidaActual = Math.min(vidaActual+ cura(),vidaMax );
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
        return vidaMax/10;
    }
}
