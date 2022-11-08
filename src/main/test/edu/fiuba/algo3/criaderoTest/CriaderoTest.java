package edu.fiuba.algo3.criaderoTest;

import edu.fiuba.algo3.modelo.Criadero;
import edu.fiuba.algo3.modelo.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Extractor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CriaderoTest {

    @Test
    public void testSeCreaUnCriaderoSeEvoluciona1LarvaYAlSiguienteTurnoDeberiaTener3Larvas(){
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unCriadero.removerLarva();
        unCriadero.ejecutarTurno();
        assertEquals(3, unCriadero.getCantidadLarvas());
    }

    @Test
    public void testSeCreaUnCriaderoNoSeEvolucionaNadaYPasaAlSiguienteTurnoDeberiaSeguirTeniendo3Larvas(){
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unCriadero.ejecutarTurno();
        assertEquals(3, unCriadero.getCantidadLarvas());
    }

    @Test
    public void testSeCreaUnCriaderoSeEvolucionDosLarvasDeberiamosTener2LarvasDespuesDelTurno(){
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unCriadero.removerLarva();
        unCriadero.removerLarva();
        unCriadero.ejecutarTurno();
        assertEquals(2, unCriadero.getCantidadLarvas());
    }

    @Test
    public void testSeConstruyeUnCriaderoNuevoNoEsElInicialDeberiaTardar4TurnosParaQueQuedeOperativo(){
        //Arrange
        Criadero unCriadero = new Criadero(4);

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
        Criadero unCriadero = new Criadero(4);
        //Act
        unCriadero.ejecutarTurno(); // canntTurnos = 3
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unCriadero.getCantidadLarvas();
        });
    }

    @Test
    public void testSeConstruyeUnExtractorNuevoYSeLeQuierePedirUnaAccionYLanzaExcepcionEdificioNoOperativoError(){
        //Arrange
        Extractor unExtractor = new Extractor(4);
        //Act
        unExtractor.ejecutarTurno(); // canntTurnos = 3
        assertThrows( EdificioNoOperativoError.class, ()-> {

        });
    }




}
