package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.Criadero;
import edu.fiuba.algo3.modelo.Larva;
import edu.fiuba.algo3.modelo.RazaZerg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class entrega0Test {

    //Caso 1 --------------
    @Test
    public void CriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDosYDeberiaTenerUnZangano() {
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);

        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void CriaderoSeIniciaCon3LarvasSeUsaUnaParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener3Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(3, unaRaza.getCantidadLarvas());

    }

    @Test
    public void CriaderoSeIniciaCon3LarvasSeUsa2ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener2Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero();  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void CriaderoSeIniciaCon3LarvasSeUsa3ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener1Larvas(){
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


}
