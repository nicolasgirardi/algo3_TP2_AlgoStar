package edu.fiuba.algo3.modelo;

public class Extractor {

    private int turnos;

    public Extractor(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Extractor operativo";
        else
            return "Extractor no operativo";
    }
}
