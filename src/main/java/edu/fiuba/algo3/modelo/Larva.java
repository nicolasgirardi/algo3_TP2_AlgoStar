package edu.fiuba.algo3.modelo;

public class Larva {
    public Zangano evolucionar() {
        return new Zangano();
    }

    public Zerling evolucionar(ReservaDeReproduccion reserva) {
        return new Zerling();
    }

    public Hidralisco evolucionar(Guarida guarida) {
        return new Hidralisco();
    }
}
