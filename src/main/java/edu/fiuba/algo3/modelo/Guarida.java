package edu.fiuba.algo3.modelo;

public class Guarida {

    private int turnos;

    public Guarida(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
        if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Guarida operativa";
        else
            return "Guarida no operativa";
    }
}
