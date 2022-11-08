package edu.fiuba.algo3.architecture.Entrega01;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso3{

    @Test
    public void UnExtractorSePuedeConstruirSobreGas() {
        Edificio edificio = new Extractor(6);
        JugadorZerg jugador = new JugadorZerg();
        Ubicacion ubicacionMock = mock(Ubicacion.class);

        assertEquals("instalacion finalizada", jugador.instalar(edificio, ubicacionMock));
    }
    @Test
    public void UnAsimiladorrSePuedeConstruirSobreGas() {
        Edificio edificio = new Pilon(6);
        JugadorZerg jugador = new JugadorZerg();
        Ubicacion ubicacionMock = mock(Ubicacion.class);

        assertEquals("instalacion finalizada", jugador.instalar(edificio, ubicacionMock));
    }

    @Test
    public void UnCriaderoNoSePuedeConstruirSobreGas() {
        Edificio edificio = new Criadero(6);
        JugadorZerg jugador = new JugadorZerg();
        Ubicacion ubicacion = new Geiser();


        assertEquals("no se puede instalar en este lugar",jugador.instalar(edificio,ubicacion));
    }
}