package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso3 {

    @Test
    public void testAsimiladorSoloSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new Asimilador();

        assertDoesNotThrow( ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testExtractorSoloSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new Extractor(new Volcan());

        assertDoesNotThrow( ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testCriaderoNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new Criadero();

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testReservaDeProduccionNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new ReservaDeReproduccion();

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testGuaridaNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new Guarida();

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testEspiralNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();

        celda.asignarRecurso(volcan);

        Edificio unEdificio = new Espiral();

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testNexoMineralNoSePuedeConstruirSobreElGas(){
        Celda celda = new Celda();
        Volcan volcan = new Volcan();
        NodoMineral nodoMineral = new NodoMineral();
        celda.asignarRecurso(volcan);

        Edificio unEdificio = new NexoMineral(nodoMineral);

        assertThrows( EdificioIncorrectoError.class, ()-> {
            celda.asignarEdifico(unEdificio);
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
}
