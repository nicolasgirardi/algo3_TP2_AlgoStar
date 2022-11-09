package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class entrega0Test {

    //Caso 1 --------------
    @Test
    public void testCriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDosYDeberiaTenerUnZangano() {
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);

        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsaUnaParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener3Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(3, unaRaza.getCantidadLarvas());

    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsa2ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener2Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsa3ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener1Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
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
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(4,hp);  // hay 3 larvas adentro.
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
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(4,hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unCriadero.ejecutarTurno();
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unCriadero.getCantidadLarvas();
        });
    }

    /*@Test
    public void testSeConstruyeUnExtractorNuevoYSeLeQuiereAgregarUnZanganoYLanzaExcepcionEdificioNoOperativoError(){
        RazaZerg unaRaza  = new RazaZerg();
        Extractor unExtractor = new Extractor(6);
        unaRaza.agregarNuevoEdificioExtractor( unExtractor );
        unaRaza.ejecutarTurno();
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unExtractor.agregarZangano(new Zangano(new Posicion()));
        });
    }*/

}
