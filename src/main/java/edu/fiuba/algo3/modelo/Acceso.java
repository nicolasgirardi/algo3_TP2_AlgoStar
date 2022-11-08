package edu.fiuba.algo3.modelo;

public class Acceso {

    private int turnos;

    public Acceso(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Acceso operativo";
        else
            return "Acceso no operativo";
    }
}
