package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg {
    ArrayList<Individuo> individuos;
    ArrayList<Edificio> edificios;
    ArrayList<Extractor> edificiosExtractores;

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

    public void agregarNuevoEdificio(Edificio unEdificio) {

        edificios.add(unEdificio);
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

        for(Extractor extractor: edificiosExtractores){
            extractor.extraer();
        }
    }
}
