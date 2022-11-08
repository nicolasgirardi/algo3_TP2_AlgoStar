package edu.fiuba.algo3.criaderoTest;

import edu.fiuba.algo3.modelo.Criadero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
