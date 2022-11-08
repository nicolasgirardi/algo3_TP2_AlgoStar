package edu.fiuba.algo3.modelo;

public class NexoMineral {

    private int turnos;

    public NexoMineral(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Nexo Mineral operativo";
        else
            return "Nexo Mineral no operativo";
    }
}
