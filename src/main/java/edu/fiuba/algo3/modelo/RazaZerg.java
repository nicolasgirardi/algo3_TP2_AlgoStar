package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg {
    ArrayList<Individuo> individuos;
    ArrayList<Edificio> edificios;
    public RazaZerg(){
        individuos = new ArrayList<Individuo>();
        edificios = new ArrayList<Edificio>();
    }

    public void agregarIndividuo(Individuo unIndividuo){

    }

    public int getCantidadLarvas(){
        int larvas = 0;
        for(Edificio unEdif : edificios){
            if( unEdif.getClass() == Criadero.class){
                 larvas = ( (Criadero) unEdif).getCantidadLarvas();
            }
        }
        return larvas;
    }

    public void evolucionarLarvaAZangano() {

    }

    public void agregarNuevoEdificio(Criadero unCriadero) {
        edificios.add(unCriadero);
    }

    public void evolucionarUnZangano(Criadero unCriadero) {
        Individuo unIndivduo = unCriadero.obtenerLarva();
        unIndivduo.evolucionar(new Zangano());
        individuos.add( unIndivduo );

    }

    public int getCantidadZangano() {
        return individuos.size();
    }
}
