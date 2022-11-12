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

        Asimilador unAsimilador = new Asimilador();

        assertDoesNotThrow( ()-> {
            ubicacion.asignarEdifico(unAsimilador);
        });
    }
    @Test
    public void testExtractorSoloSePuedeConstruirSobreElGas(){
        Ubicacion ubicacion = new Ubicacion();
        Volcan volcan = new Volcan();

        ubicacion.asignarRecurso(volcan);

        Edificio unExtractor = new Extractor();

        assertDoesNotThrow( ()-> {
            ubicacion.asignarEdifico(unExtractor);
        });
    }
}
