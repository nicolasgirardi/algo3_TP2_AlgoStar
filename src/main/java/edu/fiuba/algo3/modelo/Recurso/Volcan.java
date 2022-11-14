package edu.fiuba.algo3.modelo.Recurso;

import edu.fiuba.algo3.modelo.Edificio.Edificio;

public class Volcan extends Recurso{

    public Volcan() {
        super(5000);
        edificio = null;
    }

    public void agregarEdificio(Edificio edificio) {
        verificarRecursoOcupado();
        this.edificio = edificio;
    }

}
