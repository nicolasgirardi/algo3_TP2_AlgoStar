package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.tablero.Celda;

import java.util.ArrayList;

public class Criadero extends  Edificio {
    ArrayList<Larva> larvas;

    public Criadero(Celda unaCelda){
        posicion = unaCelda;
        cantTurnosParaSerOperativo = 0;
        larvas = new ArrayList<Larva>();
        cargarTodaslasLarvas();
    }
    public Criadero(HitPoints HP, Celda unaCelda) {
        posicion = unaCelda;
        cantTurnosParaSerOperativo = 0;
        larvas = new ArrayList<Larva>();
        hp = HP;
        cargarTodaslasLarvas();
    }
    public Criadero(int cantTurnosParaSerOperativo,HitPoints HP, Celda unaCelda){
        posicion = unaCelda;
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        larvas = new ArrayList<Larva>();
        hp = HP;
    }

    public int getCantidadLarvas() {
        this.tirarEdificioNoOperativoError();
        return larvas.size();
    }

    public Zangano removerLarva() {
        this.tirarEdificioNoOperativoError();
        Larva larvaAuxiliar = larvas.get(0);
        larvas.remove(0);
        return larvaAuxiliar.evolucionar();
    }

    @Override
    public void ejecutarTurno() {
        cantTurnosParaSerOperativo--;
        if(cantTurnosParaSerOperativo < 0 ){
            if(larvas.size() < 3){
                larvas.add( new Larva() );
            }
        }
        if(cantTurnosParaSerOperativo == 0 ){
            cargarTodaslasLarvas();
        }
        this.recuperarHP();
    }

    private  void cargarTodaslasLarvas(){
        larvas.add( new Larva() );
        larvas.add( new Larva() );
        larvas.add( new Larva() );
    }

}
