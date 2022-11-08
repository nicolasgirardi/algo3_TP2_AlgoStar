package edu.fiuba.algo3.modelo;

public class Pilon implements Edificio{

    private int turnos;

    public Pilon(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Pilon operativo";
        else
            return "Pilon no operativo";
    }
}
