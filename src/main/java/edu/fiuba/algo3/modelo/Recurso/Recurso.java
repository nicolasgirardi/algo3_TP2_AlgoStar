package edu.fiuba.algo3.modelo.Recurso;

import edu.fiuba.algo3.modelo.Edificio.Edificio;

public  abstract class Recurso {
    protected int unidades;
    protected Edificio edificio;

    public Recurso(int unidades){
        this.unidades = unidades;
    }

    public int extraer(int unidades){
        int retorno = unidades;

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


    public abstract void agregarEdificio(Edificio edificio);

    public void verificarRecursoOcupado(){
        if(this.edificio != null){
            throw new RecursoOcupadoError();
        }
    }


}
