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
}
