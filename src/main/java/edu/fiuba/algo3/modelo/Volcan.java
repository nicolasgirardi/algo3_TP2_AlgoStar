package edu.fiuba.algo3.modelo;

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
