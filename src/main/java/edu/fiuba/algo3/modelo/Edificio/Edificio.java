package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;

import java.util.ArrayList;

public abstract class Edificio {
    private int turnosRestantesParaSerOperativo;
    private HitPoints hp;

    public Edificio(int turnosRestantesParaSerOperativo){
        this.turnosRestantesParaSerOperativo = turnosRestantesParaSerOperativo;
    }
    public Edificio(int turnosRestantesParaSerOperativo,HitPoints HP){
        this.turnosRestantesParaSerOperativo = turnosRestantesParaSerOperativo;
        this.hp = HP;
    }

    public void verififarEdificioOperativo() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw  new EdificioNoOperativoError();
        }
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }

    public abstract void construirEdificioEn(Recurso recurso);

    public void verificarSiPuedeSerConstruidoSegunRecursos(int mineral, int gas, int mineralNecesario, int gasNecesario){
        if(gas < gasNecesario || mineral < mineralNecesario){
            throw new RecursosInsuficientesError();
        }
    }

    public abstract void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas);

    public abstract int consumirGas(int unidadesDeGas);

    public abstract int consumirMineral(int unidadesDeMineral);


    public void asignarHP(HitPoints HP){
        hp = HP;
    }
    public void recibirDaño(int daño){
        hp.recibirDaño(daño);
    }
    public int vidaActual(){
        return hp.vida();
    }
    public void regeneracionFinDeTurno(){
        hp.regenerar();
    }

}
