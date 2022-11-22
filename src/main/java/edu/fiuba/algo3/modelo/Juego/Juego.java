package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.*;

import java.util.ArrayList;

public class Juego {
    private Ubicacion baseJugador1;
    private Ubicacion baseJugador2;
    private Jugador jugador1;
    private Jugador jugador2;

    private Mapa mapa;

    public Juego(Mapa Mapa,Coordenada coor1){
        mapa = Mapa;
        if(mapa.buscar(coor1).distancia(mapa.buscarOpuesto(coor1)) == mapa.distanciaMaxima()) {
            baseJugador1 = mapa.buscar(coor1);
            baseJugador2 = mapa.buscarOpuesto(coor1);
            //baseJugador1.darTipo(new Moho()); //necesito moho para instalar un criadero
            //baseJugador1.ubicar(new Criadero()); //el criadero base
            //baseJugador2.ubicar(new Pilon()); //el pilon base
        }
        else{
            throw new CoordenadaNoEsExtremoDelMapaError();
        }

    }


    public int distanciaEntreBases(){
        return baseJugador1.distancia(baseJugador2);
    }
    public void empezarJuego(Jugador unJugador,Jugador otroJugador){
        jugador1 = unJugador;
        jugador2 = unJugador;
        jugador1.asignarBase(baseJugador1,mapa);
        jugador2.asignarBase(baseJugador2,mapa);
    }
}
