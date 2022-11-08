package edu.fiuba.algo3.modelo;

public class Espiral {
    private int turnos;

    public Espiral(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Espiral operativa";
        else
            return "Espiral no operativa";
    }
}
