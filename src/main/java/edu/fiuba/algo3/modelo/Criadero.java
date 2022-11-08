package edu.fiuba.algo3.modelo;

public class Criadero {
    private int larvas;
    private int turnos;
    public Criadero(int turnosRestantes){
        larvas = 3;
        turnos = turnosRestantes;
    }


    public int larvasActuales() {
        return larvas;
    }

    public void engendrarZangano(){
        larvas--;
    }

    public void finDeturno() {
        if (larvas <3)
            larvas++;
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Criadero operativo";
        else
            return "Criadero no operativo";
    }
}
