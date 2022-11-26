package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.*;

import java.util.ArrayList;

public class Juego {
    private Ubicacion baseJugador1;
    private Ubicacion baseJugador2;
    private Mapa mapa;

    private ArrayList<Jugador> jugadores;
    public Juego(){
        this.mapa = new Mapa(400,400);
        Coordenada coord1 = new Coordenada(0,0);
        if(mapa.buscar(coord1).distancia(mapa.buscarOpuesto(coord1)) == mapa.distanciaMaxima()) {
            baseJugador1 = mapa.buscar(coord1);
            baseJugador2 = mapa.buscarOpuesto(coord1);
            baseJugador1.darTipo(new Moho()); //necesito moho para instalar un criadero
            baseJugador1.ubicar(new Criadero()); //el criadero base
            baseJugador2.ubicar(new Pilon()); //el pilon base
        }
        else{
            throw new CoordenadaNoEsExtremoDelMapaError();
        }
        jugadores = new ArrayList<Jugador>();
    }
    public Juego(Mapa Mapa,Coordenada coor1){
        mapa = Mapa;
        if(mapa.buscar(coor1).distancia(mapa.buscarOpuesto(coor1)) == mapa.distanciaMaxima()) {
            baseJugador1 = mapa.buscar(coor1);
            baseJugador2 = mapa.buscarOpuesto(coor1);
            baseJugador1.darTipo(new Moho()); //necesito moho para instalar un criadero
            baseJugador1.ubicar(new Criadero()); //el criadero base
            baseJugador2.ubicar(new Pilon()); //el pilon base
        }
        else{
            throw new CoordenadaNoEsExtremoDelMapaError();
        }

    }

    public int distanciaEntreBases(){
        return baseJugador1.distancia(baseJugador2);
    }

    public void esElfinDeJuego(Raza unaRaza, Raza otraRaza){
        unaRaza.existenAunEdificios();
        otraRaza.existenAunEdificios();
    }

    public void agregarJugador(Jugador unJugador){
        jugadores.add(unJugador);
    }
    public boolean jugadoresCompletos(){
        return (jugadores.size() == 2);
    }

    public int cantidadJugadores(){
        return jugadores.size()+1;
    }

}
