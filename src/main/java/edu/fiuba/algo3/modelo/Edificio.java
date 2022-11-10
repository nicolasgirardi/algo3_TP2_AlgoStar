package edu.fiuba.algo3.modelo;

public abstract class Edificio {
    protected int cantTurnosParaSerOperativo;
    protected HitPoints hp;

    public Edificio(){

        cantTurnosParaSerOperativo = 0;
    }

    public abstract void ejecutarTurno();

    public  void ejecutarTurno(RazaRecursos razaRecursos ){
        // usa la raza Proto, sus edificios
    };
    protected void verificarEdificioEsOperativo() {
        if(cantTurnosParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
    }

    public void recibirDaño(int daño){
        hp.recibirDaño(daño);
    }

    public void recuperarHP(){
        hp.regenerar();
    }

    public int vidaActual(){
        return hp.vida();
    }

    public int escudoActual(){
        return hp.escudo();
    }

}
