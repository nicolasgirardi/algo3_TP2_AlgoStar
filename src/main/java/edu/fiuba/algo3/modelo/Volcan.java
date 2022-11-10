package edu.fiuba.algo3.modelo;

public class Volcan extends Recurso{
    public Volcan(){
        super(5000);
    }
    public Volcan(Posicion unaPosicion){
        super(5000);
        posicion = unaPosicion;
    }

    public boolean TieneMismaPosicion(Posicion posicion) {
        return this.posicion.esIgual(posicion);
    }

    public void asignarPosicion(Posicion posicion) {
        posicion = this.posicion;
    }
}
