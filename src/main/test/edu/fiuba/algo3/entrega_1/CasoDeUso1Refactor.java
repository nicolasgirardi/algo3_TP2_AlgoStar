package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Criadero;
import edu.fiuba.algo3.modelo.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso1Refactor {

    @Test
    public void testCriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDosYDeberiaTenerUnZangano(){

        Criadero criaderoBajoPrueba = new Criadero();
        Criadero criaderoNormal = new Criadero();
        Zangano zangano = criaderoBajoPrueba.evolucionarLarva();

        assertFalse(criaderoBajoPrueba.equals(criaderoNormal));

        criaderoBajoPrueba.ejecutarTurnoRegenerar();

        assertTrue(  criaderoBajoPrueba.equals(criaderoNormal) );
    }


}
