package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Criadero extends  Edificio {
    ArrayList<Individuo> larvas;

    public Criadero(){
        cantTurnosParaSerOperativo = 0;
        larvas = new ArrayList<Individuo>();
        cargarTodaslasLarvas();
    }
    public Criadero(int cantTurnosParaSerOperativo){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        larvas = new ArrayList<Individuo>();
    }

    public int getCantidadLarvas() {
        if(cantTurnosParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
        return larvas.size();
    }

    public Individuo removerLarva() {

        return larvas.remove(0);
    }


    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
        if(cantTurnosParaSerOperativo < 0 ){
            if(larvas.size() < 3){
                larvas.add( new Individuo(new Larva()) );
            }
        }
        if( cantTurnosParaSerOperativo  == 0  ){
            cargarTodaslasLarvas();
        }
    }

    private  void cargarTodaslasLarvas(){
        larvas.add( new Individuo(new Larva()) );
        larvas.add( new Individuo(new Larva()) );
        larvas.add( new Individuo(new Larva()) );
    }

}
