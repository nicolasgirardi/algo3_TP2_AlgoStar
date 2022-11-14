package edu.fiuba.algo3.modelo;

public abstract class Edificio {
    private int turnosRestantesParaSerOperativo;

    public Edificio(int turnosRestantesParaSerOperativo){
        this.turnosRestantesParaSerOperativo = turnosRestantesParaSerOperativo;
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
}
