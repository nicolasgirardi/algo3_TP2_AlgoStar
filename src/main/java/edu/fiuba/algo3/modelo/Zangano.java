package edu.fiuba.algo3.modelo;

public class Zangano extends Individuo {
    private TrabajoZangano trabajoZangano;

    public Zangano(Posicion posInicial){
        trabajoZangano = new Nada();
        posicion = posInicial;
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

}
