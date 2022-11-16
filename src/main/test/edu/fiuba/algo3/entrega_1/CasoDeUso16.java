package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Edificio.Asimilador;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Extractor;
import edu.fiuba.algo3.modelo.Edificio.NexoMineral;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.RecursoOcupadoError;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso16 {

    @Test
    public void testSeConstruyeUnExtractorSobreUnVolcanNoSeDeberiaConstruirOtroExtractorSobreElMismoVolcan(){
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor();
        volcan.agregarEdificio(extractor);

        assertThrows( RecursoOcupadoError.class, ()-> {
            Extractor extractorDos = new Extractor();
            volcan.agregarEdificio(extractorDos);
        });
    }

    @Test
    public void testSeConstruyeUnExtractorSobreUnVolcanNoSeDeberiaConstruirUnAsimiladorSobreElVolcan(){
        Volcan volcan = new Volcan();
        Edificio extractor = new Extractor();
        volcan.agregarEdificio(extractor);

        assertThrows( RecursoOcupadoError.class, ()-> {
            Asimilador asimilador = new Asimilador();
            volcan.agregarEdificio(asimilador);
        });
    }

    @Test
    public void testSeConstruyeUnAsimiladorSobreUnVolcanNoSeDeberiaConstruirUnExtractorSobreElVolcan(){
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador();
        volcan.agregarEdificio(asimilador);

        assertThrows( RecursoOcupadoError.class, ()-> {
            Extractor extractor = new Extractor();
            volcan.agregarEdificio(extractor);
        });
    }

    @Test
    public void testUnNodoMineralTieneUnNexoNoDeberiaPoderRecibirUnZangano(){

        NodoMineral nodoMineral = new NodoMineral();
        NexoMineral nexoMineral = new NexoMineral(nodoMineral);
        Zangano zangano = new Zangano(new HPZerg(25));

        assertThrows( RecursoOcupadoError.class, ()-> {
            zangano.extraerMineral(nodoMineral);
        });

    }
    @Test
    public void testUnZanganoTrabajaSobreUnNodoMineralNoDeberiaPoderConstruirseUnNexoMineral(){

        NodoMineral nodoMineral = new NodoMineral();
        Zangano zangano = new Zangano(new HPZerg(25));
        nodoMineral.agregarZangano(zangano);

        assertThrows( RecursoOcupadoError.class, ()-> {
            NexoMineral nexoMineral = new NexoMineral(nodoMineral);
        });
    }

}
