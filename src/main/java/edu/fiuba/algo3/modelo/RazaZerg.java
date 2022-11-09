package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg {
    ArrayList<Individuo> individuos;
    ArrayList<Edificio> edificios;

    ArrayList<Edificio> edificiosExtractores;
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

    public void agregarNuevoEdificioExtractor(Extractor unExtractor) {

        edificiosExtractores.add(unExtractor);
    }

    public void evolucionarUnZangano(Criadero unCriadero) {

        Zangano unZangano = unCriadero.removerLarva() ;
        individuos.add( unZangano );
    }

    public int getCantidadZangano() {

        return individuos.size();
    }

    public void ejecutarTurno() {

        for(Individuo individuo: individuos){
            individuo.ejecutarTurno();
        }

        for(Edificio edificio: edificios){
            edificio.ejecutarTurno();
        }
    }
}
