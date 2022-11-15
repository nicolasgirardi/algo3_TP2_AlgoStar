package edu.fiuba.algo3.entrega_2;

import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso24 {

    @Test
    public void  testUnJugadorArrancaEnEl0y0EntoncesElJugadorRivalDeberiaArrancarEnEl100y100(){
        Mapa unMapa = new Mapa(100,100);
        Ubicacion ubicacionOpuesta = unMapa.obtenerOpuesto(new Coordenada(0,0) );

        Ubicacion ubicacionEsperada = new Ubicacion(new Coordenada(99, 99 ) );

        assertEquals(ubicacionEsperada,ubicacionOpuesta);
    }


    @Test
    public void  testUnJugadorArrancaEnEl50y0EntoncesElJugadorRivalDeberiaArrancarEnEl50y100(){
        Mapa unMapa = new Mapa(100,100);
        Ubicacion ubicacionOpuesta = unMapa.obtenerOpuesto(new Coordenada(50,0) );

        Ubicacion ubicacionEsperada = new Ubicacion(new Coordenada(50, 99 ) );


        assertEquals(ubicacionEsperada,ubicacionOpuesta);

    }

    @Test
    public void  testUnJugadorArrancaEnEl100y0EntoncesElJugadorRivalDeberiaArrancarEnEl0y100(){
        Mapa unMapa = new Mapa(100,100);
        Ubicacion ubicacionOpuesta = unMapa.obtenerOpuesto(new Coordenada(99,0) );

        Ubicacion ubicacionEsperada = new Ubicacion(new Coordenada(0, 99 ) );

        assertEquals(ubicacionEsperada,ubicacionOpuesta);
    }

    @Test
    public void  testUnJugadorArrancaEnEl100y40EntoncesElJugadorRivalDeberiaArrancarEnEl0y40(){
        Mapa unMapa = new Mapa(100,100);
        Ubicacion ubicacionOpuesta = unMapa.obtenerOpuesto(new Coordenada(99,40) );

        Ubicacion ubicacionEsperada = new Ubicacion(new Coordenada(0, 60 ) );

        assertEquals(ubicacionEsperada,ubicacionOpuesta);
    }

    @Test
    public void  testUnJugadorArrancaEnEl100y100EntoncesElJugadorRivalDeberiaArrancarEnEl0y0(){
        Mapa unMapa = new Mapa(100,100);
        Ubicacion ubicacionOpuesta = unMapa.obtenerOpuesto(new Coordenada(0,0) );

        Ubicacion ubicacionEsperada = new Ubicacion(new Coordenada(99, 99 ) );

        assertEquals(ubicacionEsperada,ubicacionOpuesta);
    }




}
