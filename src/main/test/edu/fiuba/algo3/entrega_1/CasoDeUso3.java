package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso3 {

    @Test
    public void testAsimiladorSoloSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Asimilador();

        assertDoesNotThrow( ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testExtractorSoloSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Extractor();

        assertDoesNotThrow( ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testCriaderoNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Criadero();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testReservaDeProduccionNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new ReservaDeReproduccion();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testGuaridaNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Guarida();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testEspiralNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Espiral();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testNexoMineralNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new NexoMineral();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testPilonNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Pilon();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testAccesoNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new Acceso();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
    @Test
    public void testPuertoEstelarNoSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unEdificio = new PuertoEstelar();

        assertThrows( EdificioIncorrecto.class, ()-> {
            ubicacion.asignarEdifico(unEdificio);
        });
    }
}
