package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso3 {

    @Test
    public void testAsimiladorSoloSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Asimilador();

        assertDoesNotThrow( ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testExtractorSoloSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Extractor();

        assertDoesNotThrow( ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testCriaderoNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Criadero();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testReservaDeProduccionNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new ReservaDeReproduccion();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testGuaridaNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Guarida();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testEspiralNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Espiral();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testNexoMineralNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new NexoMineral();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testPilonNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Pilon();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testAccesoNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Acceso();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testPuertoEstelarNoSePuedeConstruirSobreElGas(){
        Celda ubicacion = new Celda();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new PuertoEstelar();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
}
