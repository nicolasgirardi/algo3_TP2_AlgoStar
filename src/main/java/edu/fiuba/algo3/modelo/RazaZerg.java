package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg {
    ArrayList<Individuo> individuos;
    public RazaZerg(){
        individuos = new ArrayList<Individuo>();

    }

    public void agregarIndividuo(Individuo unIndividuo){
        individuos.add(unIndividuo);
    }

    public int getCantidadLarvas(){
        //int cantLarvas = 0;
        return 3;
    }

}
