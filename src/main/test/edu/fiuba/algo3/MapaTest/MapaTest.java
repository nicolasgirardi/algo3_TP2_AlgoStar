package edu.fiuba.algo3.MapaTest;

import edu.fiuba.algo3.tablero.Celda;
import edu.fiuba.algo3.tablero.Mapa;
import edu.fiuba.algo3.tablero.Ocupante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapaTest {
    @Test
    public void Test01InicioElMapaCon10PosicionesPocicionDeOcupanteCorrecta(){
        //arrange
        Mapa mapa = new Mapa();
        Celda celda = new Celda(3,7);

        //act
        Ocupante ocupante = new Ocupante(celda);

        //assert
        assertTrue( mapa.posicionValida(ocupante) );
    }
    @Test
    public void Test02InicioElMapaCon10PosicionesPocicionDeOcupanteIncorrecta(){
        //arrange
        Mapa mapa = new Mapa();
        Celda celda = new Celda(35,78);

        //act
        Ocupante ocupante = new Ocupante(celda);

        //assert
        assertFalse( mapa.posicionValida(ocupante) );
    }
}
