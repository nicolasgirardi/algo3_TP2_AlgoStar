package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
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

    private Jugador jugador1;

    private Jugador jugador2;

    private int contadorJugadores;

    public Juego() {
        this.mapa = new Mapa(400, 400);
        Coordenada coord1 = new Coordenada(0, 0);
        if (mapa.buscar(coord1).distancia(mapa.buscarOpuesto(coord1)) == mapa.distanciaMaxima()) {
            baseJugador1 = mapa.buscar(coord1);
            baseJugador2 = mapa.buscarOpuesto(coord1);
            baseJugador1.darTipo(new Moho()); //necesito moho para instalar un criadero
            baseJugador1.ubicar(new Criadero()); //el criadero base
            baseJugador2.ubicar(new Pilon()); //el pilon base
        } else {
            throw new CoordenadaNoEsExtremoDelMapaError();
        }
        jugador1 = null;
        jugador2 = null;
        contadorJugadores = 0;
        inicializar_mapaM();
    }

    public Juego(Mapa Mapa, Coordenada coor1) {
        mapa = Mapa;
        if (mapa.buscar(coor1).distancia(mapa.buscarOpuesto(coor1)) == mapa.distanciaMaxima()) {
            baseJugador1 = mapa.buscar(coor1);
            baseJugador2 = mapa.buscarOpuesto(coor1);
            baseJugador1.darTipo(new Moho()); //necesito moho para instalar un criadero
            baseJugador1.ubicar(new Criadero()); //el criadero base
            baseJugador2.ubicar(new Pilon()); //el pilon base
        } else {
            throw new CoordenadaNoEsExtremoDelMapaError();
        }
    }

    public int distanciaEntreBases() {
        return baseJugador1.distancia(baseJugador2);
    }

    public void esElfinDeJuego(Raza unaRaza, Raza otraRaza) {
        unaRaza.existenAunEdificios();
        otraRaza.existenAunEdificios();
    }

    public void agregarJugador(Jugador unJugador) {
        if (jugador1 == null) {
            jugador1 = unJugador;
        } else {
            unJugador.compatibleCon(jugador1);
            jugador2 = unJugador;
        }
        contadorJugadores++;
    }

    public boolean jugadoresCompletos() {
        return (jugador2 != null && jugador1 != null);
    }

    public int cantidadJugadores() {
        return contadorJugadores + 1;
    }

    private void inicializar_mapaXL() {
        mapa.buscar(new Coordenada(1, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(2, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(4, 4)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(6, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(3, 3)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(399, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(398, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(396, 4)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(394, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(397, 3)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(399, 398)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(398, 398)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(396, 396)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(394, 398)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(397, 397)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(1, 398)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(2, 398)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(4, 396)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(6, 398)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(3, 397)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(1, 202)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(2, 202)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(4, 204)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(6, 202)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(3, 203)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(399, 202)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(398, 202)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(396, 204)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(394, 202)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(397, 203)).ubicarRecurso(new Volcan());
        int random;
        for (int i = 10; i < 390; i++) {
            for (int j = 10; j < 390; j++) {
                random = (int) (Math.random() * 100) + 1;
                if (random <= 5)
                    mapa.buscar(new Coordenada(i, j)).ubicarRecurso(new NodoMineral());
                if (5 < random && random <= 7)
                    mapa.buscar(new Coordenada(i, j)).ubicarRecurso(new Volcan());
                if (7 < random && random <= 17)
                    mapa.buscar(new Coordenada(i, j)).darTipo(new Especial());
            }
        }
    }
    private void inicializar_mapaM() {
        mapa.buscar(new Coordenada(1, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(2, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(4, 4)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(6, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(3, 3)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(39, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(38, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(36, 4)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(34, 2)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(37, 3)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(39, 38)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(38, 38)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(36, 36)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(34, 38)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(37, 37)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(1, 38)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(2, 38)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(4, 36)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(6, 38)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(3, 37)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(1, 22)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(2, 22)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(4, 24)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(6, 22)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(3, 23)).ubicarRecurso(new Volcan());

        mapa.buscar(new Coordenada(39, 22)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(38, 22)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(36, 24)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(34, 22)).ubicarRecurso(new NodoMineral());
        mapa.buscar(new Coordenada(37, 23)).ubicarRecurso(new Volcan());
        int random;
        for (int i = 8; i < 33; i++) {
            for (int j = 8; j < 33; j++) {
                random = (int) (Math.random() * 100) + 1;
                if (random <= 5)
                    mapa.buscar(new Coordenada(i, j)).ubicarRecurso(new NodoMineral());
                if (5 < random && random <= 7)
                    mapa.buscar(new Coordenada(i, j)).ubicarRecurso(new Volcan());
                if (7 < random && random <= 17)
                    mapa.buscar(new Coordenada(i, j)).darTipo(new Especial());
            }
        }
    }
}

