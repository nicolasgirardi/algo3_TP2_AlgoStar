package testAuxiliares;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Base;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBaseMapa {

    @Test
    public void testSeCreaUnaBaseConFactor1YLasDimencionesDelMapaDeberianSer10x10YYDeberiaHaberEnTotal2Bases() {

        //Average
        Base base = new Base(1);
        Mapa mapa = base.getMapa();
        mapa.inicializarMapa();

        //Act
        boolean resultado = mapa.buscar(new Coordenada(0,0)).existeEdificio();
        boolean resultado2 = mapa.buscar(new Coordenada(2,0)).existeRecurso();
        boolean resultado3 = mapa.buscar(new Coordenada(0,2)).existeRecurso();
        boolean resultado4 = mapa.buscar(new Coordenada(2,2)).existeRecurso();

        boolean resultado5 = mapa.buscar(new Coordenada(10,10)).existeEdificio();
        boolean resultado6 = mapa.buscar(new Coordenada(8,10)).existeRecurso();
        boolean resultado7 = mapa.buscar(new Coordenada(10,8)).existeRecurso();
        boolean resultado8 = mapa.buscar(new Coordenada(8,8)).existeRecurso();

        //Assert
        assertEquals(true, resultado);
        assertEquals(true, resultado2);
        assertEquals(true, resultado3);
        assertEquals(true, resultado4);
        assertEquals(true, resultado5);
        assertEquals(true, resultado6);
        assertEquals(true, resultado7);
        assertEquals(true, resultado8);
    }

    @Test
    public void testSeCreaUnaBaseConFactor2YLasDimencionesDelMapaDeberianSer15x15YYDeberiaHaberEnTotal4Bases() {

        //Average
        Base base = new Base(2);
        Mapa mapa = base.getMapa();
        mapa.inicializarMapa();

        //Act
        boolean resultado0 = mapa.buscar(new Coordenada(0,0)).existeEdificio();
        boolean resultado1 = mapa.buscar(new Coordenada(0,13)).existeRecurso();
        boolean resultado2 = mapa.buscar(new Coordenada(2,15)).existeRecurso();
        boolean resultado3 = mapa.buscar(new Coordenada(0,15)).existeRecurso();

        boolean resultado4 = mapa.buscar(new Coordenada(13,0)).existeRecurso();
        boolean resultado5 = mapa.buscar(new Coordenada(15,2)).existeRecurso();
        boolean resultado6 = mapa.buscar(new Coordenada(15,0)).existeRecurso();
        boolean resultado7 = mapa.buscar(new Coordenada(15,15)).existeEdificio();

        boolean resultado8 = mapa.buscar(new Coordenada(0,0)).existeEdificio();
        boolean resultado9 = mapa.buscar(new Coordenada(2,0)).existeRecurso();
        boolean resultado10 = mapa.buscar(new Coordenada(0,2)).existeRecurso();
        boolean resultado11 = mapa.buscar(new Coordenada(2,2)).existeRecurso();

        boolean resultado12 = mapa.buscar(new Coordenada(15,15)).existeEdificio();
        boolean resultado13 = mapa.buscar(new Coordenada(13,15)).existeRecurso();
        boolean resultado14 = mapa.buscar(new Coordenada(15,13)).existeRecurso();
        boolean resultado15 = mapa.buscar(new Coordenada(13,13)).existeRecurso();

        //Assert
        assertEquals(true, resultado0);
        assertEquals(true, resultado1);
        assertEquals(true, resultado2);
        assertEquals(true, resultado3);
        assertEquals(true, resultado4);
        assertEquals(true, resultado5);
        assertEquals(true, resultado6);
        assertEquals(true, resultado7);

        assertEquals(true, resultado8);
        assertEquals(true, resultado9);
        assertEquals(true, resultado10);
        assertEquals(true, resultado11);
        assertEquals(true, resultado12);

        assertEquals(true, resultado13);
        assertEquals(true, resultado14);
        assertEquals(true, resultado15);
    }

    @Test
    public void testSeCreaUnaBaseConFactor3YLasDimencionesDelMapaDeberianSer18x18YYDeberiaHaberEnTotal4Bases() {

        //Average
        Base base = new Base(3);
        Mapa mapa = base.getMapa();
        mapa.inicializarMapa();

        //Act
        boolean resultado0 = mapa.buscar(new Coordenada(0,0)).existeEdificio();
        boolean resultado1 = mapa.buscar(new Coordenada(7,0)).existeRecurso();
        boolean resultado2 = mapa.buscar(new Coordenada(11,0)).existeRecurso();
        boolean resultado3 = mapa.buscar(new Coordenada(9,2)).existeRecurso();

        boolean resultado4 = mapa.buscar(new Coordenada(7,18)).existeRecurso();
        boolean resultado5 = mapa.buscar(new Coordenada(11,18)).existeRecurso();
        boolean resultado6 = mapa.buscar(new Coordenada(9,16)).existeRecurso();
        boolean resultado7 = mapa.buscar(new Coordenada(18,18)).existeEdificio();

        boolean resultado8 = mapa.buscar(new Coordenada(0,13)).existeRecurso();
        boolean resultado9 = mapa.buscar(new Coordenada(2,15)).existeRecurso();
        boolean resultado10 = mapa.buscar(new Coordenada(0,15)).existeRecurso();

        boolean resultado11 = mapa.buscar(new Coordenada(13,0)).existeRecurso();
        boolean resultado12 = mapa.buscar(new Coordenada(15,2)).existeRecurso();
        boolean resultado13 = mapa.buscar(new Coordenada(15,0)).existeRecurso();

        boolean resultado14 = mapa.buscar(new Coordenada(0,0)).existeEdificio();
        boolean resultado15 = mapa.buscar(new Coordenada(2,0)).existeRecurso();
        boolean resultado16 = mapa.buscar(new Coordenada(0,2)).existeRecurso();
        boolean resultado17 = mapa.buscar(new Coordenada(2,2)).existeRecurso();

        boolean resultado18 = mapa.buscar(new Coordenada(18, 18)).existeEdificio();
        boolean resultado19 = mapa.buscar(new Coordenada(16,18)).existeRecurso();
        boolean resultado20 = mapa.buscar(new Coordenada(18,16)).existeRecurso();
        boolean resultado21 = mapa.buscar(new Coordenada(16,16)).existeRecurso();


        //Assert
        assertEquals(true, resultado0);
        assertEquals(true, resultado1);
        assertEquals(true, resultado2);
        assertEquals(true, resultado3);
        assertEquals(true, resultado4);
        assertEquals(true, resultado5);
        assertEquals(true, resultado6);
        assertEquals(true, resultado7);
        assertEquals(true, resultado8);
        assertEquals(true, resultado9);
        assertEquals(true, resultado10);
        assertEquals(true, resultado11);
        assertEquals(true, resultado12);
        assertEquals(true, resultado13);
        assertEquals(true, resultado14);
        assertEquals(true, resultado15);
        assertEquals(true, resultado16);
        assertEquals(true, resultado17);
        assertEquals(true, resultado18);
        assertEquals(true, resultado19);
        assertEquals(true, resultado20);
        assertEquals(true, resultado21);

    }

}
