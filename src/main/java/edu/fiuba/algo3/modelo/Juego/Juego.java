package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.modelo.Edificio.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Pilon;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;

public class Juego {
    private Ubicacion baseJugador1;
    private Ubicacion baseJugador2;
    private Mapa mapa;

    public Juego(Mapa Mapa,Coordenada coor1,Coordenada coor2){
        mapa = Mapa;
        baseJugador1 = mapa.buscar(coor1);
        baseJugador2 = mapa.buscar(coor2);
        baseJugador1.darTipo(new Moho()); //necesito moho para instalar un criadero
        baseJugador1.ubicar(new Criadero()); //el criadero base
        baseJugador2.ubicar(new Pilon()); //el pilon base

    }

    public int distanciaEntreBases(){
        return baseJugador1.distancia(baseJugador2);
    }
}
