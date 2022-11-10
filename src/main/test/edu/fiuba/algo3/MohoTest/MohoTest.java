package edu.fiuba.algo3.MohoTest;
import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.tablero.Celda;
import edu.fiuba.algo3.tablero.Direccion;
import edu.fiuba.algo3.tablero.Linea;
import edu.fiuba.algo3.tablero.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MohoTest {
    @Test
    public void test01SeCreaElMohoConUnaExpansionDe5(){
        Mapa mapa = new Mapa();
        Celda posicionCriadero = new Celda(1,0);
        Celda celda1 = new Celda(1,0);
        Celda celda2 = new Celda(5,5); //longitus a sumar al moho
        Moho moho = new Moho(celda1);
        Linea linea1 = new Linea(celda1, celda2);
        //mapa.agregarLinea(linea1);
        moho.mover(new Direccion(mapa));
        mapa.agregarLinea(linea1);
        //dsp de dos turnos el moho se desplaza
       //moho.ejecutarTurno(mapa);


        assertEquals(6, moho.obtenerPosicion().obtenerPosicionX());
        assertEquals(5, moho.obtenerPosicion().obtenerPosicionY());
    }
    @Test
    public void test02ConstruirAdentroDelMoho(){
        Mapa mapa = new Mapa();
        Celda posicionConstruir = new Celda(5, 0); //le pongo celda
        Celda celda1 = new Celda(1,0);//longitud inicial moho
        Celda celda2 = new Celda(5,5);//longitud a sumar al moho
        Linea linea1 = new Linea(celda1, celda2);
        linea1.agregarNuevoEdificio(new ReservaDeReproduccion(2,posicionConstruir));

        mapa.agregarLinea(linea1);

        assertEquals(5, ReservaDeReproduccion.obtenerPosicion().obtenerPosicionX());
    }

    @Test
    public void test03ConstruirAfueraDelMoho(){
        Mapa mapa = new Mapa();
        Celda posicionConstruir = new Celda(8, 0); //le pongo celda
        Celda celda1 = new Celda(1,0);//longitud inicial moho
        Celda celda2 = new Celda(5,5);//longitud a sumar al moho
        Linea linea1 = new Linea(celda1, celda2);

        assertThrows( EdificioNoOperativoError.class, ()-> {
            linea1.agregarNuevoEdificio(new ReservaDeReproduccion(2,posicionConstruir));
        });
    }


}
