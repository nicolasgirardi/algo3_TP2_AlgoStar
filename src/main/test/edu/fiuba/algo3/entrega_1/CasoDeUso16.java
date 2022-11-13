package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso16 {

    @Test
    public void testSeConstruyeUnExtractorSobreUnVolcanNoSePuedeConstruirOtroExtractorSobreElMismoVolcan(){
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor(volcan);

        assertThrows( VolcanOcupadoError.class, ()-> {
            Extractor extractorDos = new Extractor(volcan);
        });
    }

    @Test
    public void testSeConstruyeUnExtractorSobreUnVolcanNoSePuedeConstruirUnAsimiladorSobreElVolcan(){
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor(volcan);

        assertThrows( VolcanOcupadoError.class, ()-> {
            Asimilador asimilador = new Asimilador(volcan);
        });
    }

    @Test
    public void testSeConstruyeUnAsimiladorSobreUnVolcanNoSePuedeConstruirUnExtractorSobreElVolcan(){
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador(volcan);

        assertThrows( VolcanOcupadoError.class, ()-> {
            Extractor extractor = new Extractor(volcan);
        });
    }

/*    @Test
    public void testUnZanganoTrabajaSobreUnNodoMineralNoPuedeConstruirseUnNexoMineral(){
        Zangano zangano = new Zangano();
        NodoMineral nodoMineral = new NodoMineral();
        zangano.extraer(nodoMineral);
    }*/


}
