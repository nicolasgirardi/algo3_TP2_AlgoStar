package edu.fiuba.algo3.criaderoTest;

import edu.fiuba.algo3.modelo.Criadero;
import edu.fiuba.algo3.modelo.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.HitPoints;
import edu.fiuba.algo3.tablero.Celda;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CriaderoTest {

    @Test
    public void testSeCreaUnCriaderoSeEvoluciona1LarvaYAlSiguienteTurnoDeberiaTener3Larvas(){
        HitPoints hp = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Criadero unCriadero = new Criadero(posicionConstruir);  // hay 3 larvas adentro.
        unCriadero.removerLarva();
        unCriadero.ejecutarTurno();
        assertEquals(3, unCriadero.getCantidadLarvas());
    }

    @Test
    public void testSeCreaUnCriaderoNoSeEvolucionaNadaYPasaAlSiguienteTurnoDeberiaSeguirTeniendo3Larvas(){
        HitPoints hp = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Criadero unCriadero = new Criadero(hp,posicionConstruir);  // hay 3 larvas adentro.
        unCriadero.ejecutarTurno();
        assertEquals(3, unCriadero.getCantidadLarvas());
    }

    @Test
    public void testSeCreaUnCriaderoSeEvolucionDosLarvasDeberiamosTener2LarvasDespuesDelTurno(){
        HitPoints hp = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Criadero unCriadero = new Criadero(hp,posicionConstruir);  // hay 3 larvas adentro.
        unCriadero.removerLarva();
        unCriadero.removerLarva();
        unCriadero.ejecutarTurno();
        assertEquals(2, unCriadero.getCantidadLarvas());
    }

    @Test
    public void testSeConstruyeUnCriaderoNuevoNoEsElInicialDeberiaTardar4TurnosParaQueQuedeOperativo(){
        //Arrange
        HitPoints hp = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Criadero unCriadero = new Criadero(4,hp,posicionConstruir);

        //Act
        unCriadero.ejecutarTurno(); // canntTurnos = 3
        unCriadero.ejecutarTurno(); // cantTUrnos = 2
        unCriadero.ejecutarTurno(); //cantTUrnos = 1
        unCriadero.ejecutarTurno(); //cantTurnos == 0

        //Assert
        assertEquals(3, unCriadero.getCantidadLarvas());
    }

    @Test
    public void testSeConstruyeUnCriaderoNuevoYSeLeQuierePedirLaCantidadLarvasYLanzaExcepcionEdificioNoOperativoError(){
        //Arrange
        HitPoints hp = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Criadero unCriadero = new Criadero(4,hp,posicionConstruir);
        //Act
        unCriadero.ejecutarTurno(); // canntTurnos = 3
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unCriadero.getCantidadLarvas();
        });
    }

}
