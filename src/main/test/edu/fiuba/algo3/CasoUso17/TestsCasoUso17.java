package edu.fiuba.algo3.CasoUso17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsCasoUso17 {

    @Test
    public void SiSeIntentaConstruirUnaGuaridaSinReservaDeProduccionDeberiaSaltarExcepcion()

    {

        Jugador jugador = new JugadorZerg();

        assertThrows(FaltaEdificio.class, jugador.construirGuarida);

    }

    @Test
    public void SiSeIntentaConstruirUnaEspiralSinGuaridaDeberiaSaltarExcepcion()

    {

        Jugador jugador = new JugadorZerg();

        assertThrows(FaltaEdificio.class, jugador.construirEspiral);

    }

    @Test
    public void SiSeIntentaConstruirUnPuertoEstelarSinAccesoDeberiaSaltarExcepcion()

    {

        Jugador jugador = new JugadorProtos();

        assertThrows(FaltaEdificio.class, jugador.puertoEstelar);

    }

}