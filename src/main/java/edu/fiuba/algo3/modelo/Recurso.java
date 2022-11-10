package edu.fiuba.algo3.modelo;

public abstract class Recurso {
    protected int unidades;
    protected Posicion posicion;

    public Recurso(int unidades){
        this.unidades = unidades;
    }

   public int extraer(int unidades){
       int retorno = unidades;
       /*if (this.unidades == 0){
           thorw new RecursosSinUnidadesError();
       }*/
       if (this.unidades == 0){
           return 0;
       }

       if (this.unidades < unidades){
           retorno = this.unidades;
           this.unidades = 0;
       }else{
           this.unidades -= unidades;
       }
       return retorno;
   }
}
