package edu.fiuba.algo3.modelo.UnidadesRecurso;

public class UnidadesRecurso {
    private int cantidad;

    public UnidadesRecurso(int cantidad){
        this.cantidad = cantidad;
    }
    public boolean puedeExtraer(int cantidad){
        return this.cantidad >= cantidad;
    }

    public UnidadesRecurso extraer(int cantidad){
        if(!puedeExtraer(cantidad))
            throw  new CantidadInsuficienteError();
        this.cantidad -= cantidad;
        return new UnidadesRecurso(cantidad);
    }

    public UnidadesRecurso extraerTodo(){
        UnidadesRecurso retorno = new UnidadesRecurso(cantidad);
        cantidad = 0;
        return retorno;
    }

    public void aumentar(UnidadesRecurso unidadesRecurso){
        cantidad += unidadesRecurso.cantidad;
        unidadesRecurso.cantidad = 0;
    }
}
