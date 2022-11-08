package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.Criadero;
import edu.fiuba.algo3.modelo.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Larva;
import edu.fiuba.algo3.modelo.RazaZerg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class entrega0Test {

    //Caso 1 --------------
    @Test
    public void testCriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDosYDeberiaTenerUnZangano() {
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);

        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsaUnaParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener3Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(3, unaRaza.getCantidadLarvas());

    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsa2ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener2Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsa3ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener1Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(1, unaRaza.getCantidadLarvas());
    }


    //Caso 2 --------------

    @Test
    public void testSeCreaUnCriaderoEnCuatroTurnosEstaOperativo(){
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero(4);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.ejecutarTurno();
        unaRaza.ejecutarTurno();
        unaRaza.ejecutarTurno();
        unaRaza.ejecutarTurno();
        assertEquals(3, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testSeCreaUnCriaderoYEnElSegundoTurnoSeLePideLaCantidadDeLarvasDeberiaLanzarUnEdificioNoOperativoError(){
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero(4);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.ejecutarTurno();
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unCriadero.getCantidadLarvas();
        });
    }


}
