package edu.fiuba.algo3.modelo;

public class Asimilador {

    private int turnos;

    public Asimilador(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Asimilador operativo";
        else
            return "Asimilador no operativo";
    }
}
