package edu.fiuba.algo3.modelo;

public class TrabajoMineral extends TrabajoZangano {
    private final int UNIDADES_EXTRACCION = 10;
    public TrabajoMineral(NodoMineral nodoMineral) {
        super(nodoMineral);
    }

    @Override
    public void extraer(RazaRecursos razaRecursos) {
        int mineral = recurso.extraer(UNIDADES_EXTRACCION);
        razaRecursos.aumentarMineral(mineral);
    }
}
