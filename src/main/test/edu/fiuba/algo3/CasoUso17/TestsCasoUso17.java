package edu.fiuba.algo3.CasoUso17;

import edu.fiuba.algo3.modelo.FaltaEdificio;
import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.JugadorZerg;
import org.mockito.Mockito;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsCasoUso17 {

    @Test
    public void SiSeIntentaConstruirUnaGuaridaSinReservaDeProduccionDeberiaSaltarExcepcion()

    {

        Jugador jugador = new JugadorZerg();

        try {
            jugador.construirGuarida;
        }
        catch(FaltaEdificio f){}

        assertThrows()

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