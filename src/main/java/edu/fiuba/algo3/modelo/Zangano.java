package edu.fiuba.algo3.modelo;


public class Zangano extends Individuo {
    private TrabajoZangano trabajoZangano;

    public Zangano(Posicion posInicial){
        trabajoZangano = new Nada();
        posicion = posInicial;
    }

    public Zangano(){

    }
    private void extraer(RazaRecursos razaRecursos){
        trabajoZangano.extraer(razaRecursos);
    }

    @Override
    public void ejecutarTurno(RazaRecursos razaRecursos) {
        extraer(razaRecursos);
    }


    public void setTrabajo(TrabajoZangano trabajoZangano){
        this.trabajoZangano = trabajoZangano;
    }

    public void caminarAPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean tieneMismaPosicion(Volcan volcan) {
        return volcan.TieneMismaPosicion(posicion);
    }

}
