package edu.fiuba.algo3.modelo;

public class ReservaDeProduccion {

    private int turnos;

    public ReservaDeProduccion(int turnosRestantes){
        turnos = turnosRestantes;
    }

    public void finDeturno() {
       if (turnos > 0)
            turnos--;
    }

    public String estado() {
        if(turnos == 0)
            return "Reserva operativa";
        else
            return "Reserva no operativa";
    }
}
