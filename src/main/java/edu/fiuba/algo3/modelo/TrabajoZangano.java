package edu.fiuba.algo3.modelo;

public abstract class TrabajoZangano {
    protected Recurso recurso;
    public TrabajoZangano(){}
    public TrabajoZangano(Recurso recurso){
        this.recurso = recurso;
    }
    public abstract void extraer( RazaRecursos razaRecursos );
}
