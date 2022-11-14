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


    @Test //ACA
    public void testNexoMineralNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new NexoMineral( new NodoMineral() );

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }
    @Test
    public void testPilonNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new Pilon();

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }
    @Test
    public void testAccesoNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new Acceso();

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }
    @Test
    public void testPuertoEstelarNoSePuedeConstruirSobreElGas(){
        Volcan volcan = new Volcan();
        Edificio unEdificio = new PuertoEstelar();

        assertThrows( ConstruccionIncorrectaError.class, ()-> {
            unEdificio.construirEdificioEn(volcan);
        });
    }


}
