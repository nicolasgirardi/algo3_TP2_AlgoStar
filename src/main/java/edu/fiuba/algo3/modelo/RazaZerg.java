package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class RazaZerg extends Raza{


    private RazaRecursos razaRecursos;
    private ArrayList<Individuo>    individuos;
    private ArrayList<Edificio> edificios;
    private ArrayList<Edificio> edificiosExtractores;


    public RazaZerg(){
        super();
        individuos = new ArrayList<Individuo>();
        edificios = new ArrayList<Edificio>();
        edificiosExtractores = new ArrayList<Edificio>();
        razaRecursos = new RazaRecursos();
    }

    public void agregarIndividuo(Individuo unIndividuo){

    }
    public void eliminarIndividuo(Individuo unIndividuo){individuos.remove(unIndividuo);}

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

        Zangano unZangano = unCriadero.evolucionarLarva() ;
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

        for(Edificio edificio: edificiosExtractores){
            edificio.ejecutarTurno();
        }
    }

    public int getCantidadGas() {
        return razaRecursos.obtenerCantidadGas();
    }

    public int getCantidadMineral() {
        return razaRecursos.obtenerCantidadMineral();
    }

    public void construirUnExtractor(Volcan volcan, HitPoints hpExtractor) {

        for (Individuo individuo : individuos) {
            if (individuo.getClass() == Zangano.class && ((Zangano) individuo).tieneMismaPosicion(volcan)) {
                Zangano zangano = (Zangano) individuo;
                Extractor unExtractor = new Extractor(volcan,hpExtractor);
                edificiosExtractores.add(unExtractor);
                individuos.remove(individuo);
                return;
            }
        }

    }

    public void agregarZanganoExtractor(Zangano otroZangano, Volcan volcan) {
        for(Edificio edificioActual : edificiosExtractores){
            if(edificioActual.getClass() == Extractor.class  ){
                Extractor extractor =  (Extractor) edificioActual;
                extractor.agregarZangano(otroZangano);
                return;
            }
        }
    }

    /* public int getCantidadMineral(){
        return cantidadMineral;
    }*/

    /* public Zangano obtenerZangano() {
        return individuos.get(0);

    } */

}
