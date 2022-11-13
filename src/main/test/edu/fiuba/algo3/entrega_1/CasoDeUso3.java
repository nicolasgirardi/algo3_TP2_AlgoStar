package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso3 {

    @Test
    public void testAsimiladorSoloSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new Asimilador();

        assertDoesNotThrow( ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }

    @Test
    public void testExtractorSoloSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();

        Edificio unEdificio = new Extractor();

        assertDoesNotThrow( ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }
    @Test
    public void testCriaderoNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();


        Edificio unEdificio = new Criadero();

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }

    @Test
    public void testReservaDeProduccionNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new ReservaDeReproduccion();

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });

    }
    @Test
    public void testGuaridaNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new Guarida();

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }

    @Test
    public void testEspiralNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new Espiral();

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }

    /*
    @Test
    public void testNexoMineralNoSePuedeConstruirSobreElGas(){
        NodoMineral nodoMineral = new NodoMineral();
        Edificio unEdificio = new NexoMineral(nodoMineral);

        assertThrows( EdificioIncorrectoError.class, ()-> {
            unEdificio.construirEdificioEn(nodoMineral);
        });
    }
    @Test
    public void testPilonNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new Pilon();

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testAccesoNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new Acceso();

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testPuertoEstelarNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new PuertoEstelar();

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }


 */
}
