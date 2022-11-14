package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class NodoMineral extends Recurso{

    private Zangano zangano;
    public NodoMineral(){
        super(2000);
    }

    @Override
    public void agregarEdificio(Edificio edificio) {
        verificarRecursoOcupado();
        verificarRecursoOcupadoPorZangano();
        this.edificio = edificio;
    }

    public int extraerConZangano(int unidades , Zangano zangano){
        verificarRecursoOcupado();
        this.zangano = zangano;
        return extraer(unidades);
    }

    public void agregarZangano(Zangano zangano) {
        verificarRecursoOcupado();
        this.zangano = zangano;
    }

    public void verificarRecursoOcupadoPorZangano(){
        if(zangano != null){
            throw new RecursoOcupadoError();
        }
    }

    public void ocuparConEdificio(NexoMineral nexoMineral) {
        verificarRecursoOcupado();
        verificarRecursoOcupadoPorZangano();
        edificio = nexoMineral;
    }
}
