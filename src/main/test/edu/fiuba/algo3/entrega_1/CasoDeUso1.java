package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Criadero;
import edu.fiuba.algo3.modelo.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CasoDeUso1 {

    @Test
    public void testCriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDos(){
        //arrange
        Criadero criaderoBajoPrueba = new Criadero();
        Criadero criaderoNormal = new Criadero();

        //act
        Zangano zangano = criaderoBajoPrueba.evolucionarLarva();

        //assert
        assertFalse(criaderoBajoPrueba.equals(criaderoNormal));
    }

    @Test
    public void testCriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDosYDeberiaTenerUnZangano(){
        //arrange
        Criadero criaderoBajoPrueba = new Criadero();
        Criadero criaderoNormal = new Criadero();

        //act
        Zangano zangano = criaderoBajoPrueba.evolucionarLarva();
        criaderoBajoPrueba.ejecutarTurnoRegenerar();

        //assert
        assertTrue(  criaderoBajoPrueba.equals(criaderoNormal) );
    }
    @Test
    public void testCriaderoSeIniciaCon3larvasSeEvolucionanLasTresLarvasYNoDeberiaSerIgualAUnCriaderoSinEvolucionarLarvas(){
        Criadero criaderoBajoPrueba = new Criadero();
        Criadero criaderoNormal = new Criadero();

        //act
        Zangano zanganoUno = criaderoBajoPrueba.evolucionarLarva();
        Zangano zanganoDos = criaderoBajoPrueba.evolucionarLarva();
        Zangano zanganoTres = criaderoBajoPrueba.evolucionarLarva();
        criaderoBajoPrueba.ejecutarTurnoRegenerar();

        //assert
        assertFalse(  criaderoBajoPrueba.equals(criaderoNormal) );
    }



}
