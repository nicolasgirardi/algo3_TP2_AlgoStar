package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg extends Raza{

    private ArrayList<Individuo> individuos;
    private ArrayList<Edificio> edificios;

    public RazaZerg(){
        super();
        individuos = new ArrayList<Individuo>();
        edificios = new ArrayList<Edificio>();
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

    public void agregarNuevoEdificio(Edificio unEdificio) {

        edificios.add(unEdificio);
    }


    public Zangano evolucionarUnZangano(Criadero unCriadero) {

        Zangano unZangano = unCriadero.removerLarva() ;
        individuos.add( unZangano );
        return unZangano;
    }

    public int getCantidadZangano() {

        return individuos.size();
    }

    public void ejecutarTurno() {

        for(Individuo individuo: individuos){
            individuo.ejecutarTurno(this.razaRecursos);
        }

        for(Edificio edificio: edificios){
            edificio.ejecutarTurno();
        }
        /*
        for(Extractor extractor: edificiosExtractores){
           int aux = extractor.extraer();
        }*/
    }


}
