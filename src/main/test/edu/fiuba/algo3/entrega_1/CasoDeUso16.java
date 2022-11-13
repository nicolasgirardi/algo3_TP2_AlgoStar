package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso16 {

    @Test
    public void testSeConstruyeUnExtractorSobreUnVolcanNoSePuedeConstruirOtroExtractorSobreElMismoVolcan(){
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor();
        volcan.agregarEdificio(extractor);

        assertThrows( RecursoOcupadoError.class, ()-> {
            Extractor extractorDos = new Extractor();
            volcan.agregarEdificio(extractorDos);
        });
    }

    @Test
    public void testSeConstruyeUnExtractorSobreUnVolcanNoSePuedeConstruirUnAsimiladorSobreElVolcan(){
        Volcan volcan = new Volcan();
        Edificio extractor = new Extractor();
        volcan.agregarEdificio(extractor);

        assertThrows( RecursoOcupadoError.class, ()-> {
            Asimilador asimilador = new Asimilador();
            volcan.agregarEdificio(asimilador);
        });
    }

    @Test
    public void testSeConstruyeUnAsimiladorSobreUnVolcanNoSePuedeConstruirUnExtractorSobreElVolcan(){
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador();
        volcan.agregarEdificio(asimilador);

        assertThrows( RecursoOcupadoError.class, ()-> {
            Extractor extractor = new Extractor();
            volcan.agregarEdificio(extractor);
        });
    }

/*    @Test
    public void testUnZanganoTrabajaSobreUnNodoMineralNoPuedeConstruirseUnNexoMineral(){
        Zangano zangano = new Zangano();
        NodoMineral nodoMineral = new NodoMineral();
        zangano.extraer(nodoMineral);
    }*/


}
