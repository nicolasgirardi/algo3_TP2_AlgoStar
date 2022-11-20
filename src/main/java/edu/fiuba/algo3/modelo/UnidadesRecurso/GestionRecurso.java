package edu.fiuba.algo3.modelo.UnidadesRecurso;

public class GestionRecurso {
    private UnidadesRecurso unidadesRecurso;

    public GestionRecurso(){
        this.unidadesRecurso = new UnidadesRecurso(0);
    }

    public void consumir(int cantidad){
        unidadesRecurso.extraer(cantidad);
    }
    public  boolean puedeConsumir(int cantidad){
        return unidadesRecurso.puedeExtraer(cantidad);
    }

    public void auemntar(UnidadesRecurso unidadesRecurso){
        unidadesRecurso.aumentar(unidadesRecurso);
    }
}
