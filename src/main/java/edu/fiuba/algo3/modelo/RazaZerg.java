package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg {

    private RazaRecursos razaRecursos;
    private ArrayList<Individuo> individuos;
    private ArrayList<Edificio> edificios;

    private ArrayList<Edificio> edificiosExtractores;


    public RazaZerg(){
        individuos = new ArrayList<Individuo>();
        edificios = new ArrayList<Edificio>();
        razaRecursos = new RazaRecursos();
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

    public void agregarNuevoEdificio(Edificio unCriadero) {

        edificios.add(unCriadero);
    }

    public void agregarNuevoEdificioExtractor(Extractor unExtractor) {

        edificiosExtractores.add(unExtractor);
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
    }

    public int getCantidadGas() {
        return razaRecursos.obtenerCantidadGas();
    }

    public int getCantidadMineral() {
        return razaRecursos.obtenerCantidadMineral();
    }

    /* public int getCantidadMineral(){
        return cantidadMineral;
    }*/

    /* public Zangano obtenerZangano() {
        return individuos.get(0);

    } */

}
