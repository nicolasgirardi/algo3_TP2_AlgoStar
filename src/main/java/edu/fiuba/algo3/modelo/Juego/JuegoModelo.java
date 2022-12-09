package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Observers.ObservadorJugadorActivo;
import edu.fiuba.algo3.modelo.Observers.ObservadorRazaRecursos;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.*;

import java.util.ArrayList;
import java.util.List;

public class JuegoModelo{
    private Ubicacion baseZerg;
    private Ubicacion baseProtoss;
    private Mapa mapa;
    private Jugador jugador1;
    private Jugador jugador2;
    private int contadorJugadores;

    private Jugador jugadorActivo;

    private List<ObservadorJugadorActivo> observadoresJugadorActivo;

    public JuegoModelo() {
        Base base = new Base();
        this.mapa = base.getMapa();
        Coordenada coordenadaCero = new Coordenada(0, 0);
        if (mapa.buscar(coordenadaCero).distancia(mapa.buscarOpuesto(coordenadaCero)) == mapa.distanciaMaxima()) {
            baseZerg = mapa.buscar(coordenadaCero);
            baseProtoss = mapa.buscarOpuesto(coordenadaCero);
            baseZerg.darTipo(new Moho()); //necesito moho para instalar un criadero
            baseZerg.ubicar(new Criadero()); //el criadero base
            baseProtoss.ubicar(new Pilon(), mapa); //el pilon base
        } else {
            throw new CoordenadaNoEsExtremoDelMapaError();
        }
        jugador1 = null;
        jugador2 = null;
        contadorJugadores = 0;
        mapa.inicializarMapa( );
        observadoresJugadorActivo = new ArrayList<>();
    }

    public JuegoModelo(Mapa Mapa, Coordenada coor1) {
        mapa = Mapa;
        if (mapa.buscar(coor1).distancia(mapa.buscarOpuesto(coor1)) == mapa.distanciaMaxima()) {
            baseZerg = mapa.buscar(coor1);
            baseProtoss = mapa.buscarOpuesto(coor1);
            baseZerg.darTipo(new Moho()); //necesito moho para instalar un criadero
            baseZerg.ubicar(new Criadero()); //el criadero base
            baseProtoss.ubicar(new Pilon()); //el pilon base
        } else {
            throw new CoordenadaNoEsExtremoDelMapaError();
        }
        jugadorActivo = jugador1;
        observadoresJugadorActivo = new ArrayList<>();

    }

    public int distanciaEntreBases() {
        return baseZerg.distancia(baseProtoss);
    }

    public void esElfinDeJuego(Raza unaRaza, Raza otraRaza) {
        unaRaza.existenAunEdificios();
        otraRaza.existenAunEdificios();
    }

    public void agregarJugador(Jugador unJugador) {
        if (jugador1 == null) {
            jugador1 = unJugador;
            jugador1.getRaza().agregarEdificioInicial(baseZerg.getEdificio());
            jugadorActivo = jugador1;
        } else {
            unJugador.compatibleCon(jugador1);
            jugador2 = unJugador;
            jugador2.getRaza().agregarEdificioInicial(baseProtoss.getEdificio());
        }
        contadorJugadores++;
    }

    public boolean jugadoresCompletos() {
        return (jugador2 != null && jugador1 != null);
    }

    public int cantidadJugadores() {
        return contadorJugadores + 1;
    }

    public  int dimensionTablero(){
        return mapa.getDimension();
    }

    public Ubicacion buscar(Coordenada coordenada) {
        return mapa.buscar(coordenada);
    }

    public Jugador getJugador1(){
        return jugador1;
    }
    public Jugador getJugador2(){
        return jugador2;
    }

    public Mapa getMapa(){
        return mapa;
    }

    public Jugador getJugadorActivo(){
        return jugadorActivo;
    }

    public void terminarTurno(){

        if(jugadorActivo.equals(jugador1)){
            jugadorActivo = jugador2;
        }
        else{
            jugadorActivo = jugador1;
        }
        notificarSobreJugadorActivo();

    }

    public void subscribirseRazaActiva(ObservadorRazaRecursos o){
        jugadorActivo.getRaza().agregarObservador(o);
    }
    public void desubscribirseRazaActiva(ObservadorRazaRecursos o){
        jugadorActivo.getRaza().eliminarObservador(o);
    }

    public void notificarSobreJugadorActivo(){
        observadoresJugadorActivo.forEach(o -> o.actualizar(jugadorActivo));
    }
    public void subscribirseJugadorActivo(ObservadorJugadorActivo o){
        observadoresJugadorActivo.add(o);
    }
    public void desubscribirseJugadorActivo(ObservadorJugadorActivo o){
        observadoresJugadorActivo.remove(o);
    }
}

