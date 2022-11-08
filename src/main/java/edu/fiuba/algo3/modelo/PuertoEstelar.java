package edu.fiuba.algo3.modelo;

public class PuertoEstelar {

    private int turnos;

    public PuertoEstelar(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Puerto Estelar operativo";
        else
            return "Puerto Estelar no operativo";
    }
}
