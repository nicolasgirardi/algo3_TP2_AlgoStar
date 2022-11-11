package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class CasoDeUso3 {
    @Test
    public void VerificarQueExtracttorePuedaConstruirSobreElGas(){
        //arrange
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        HitPoints hpExtractor = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(0, hp, new Posicion(10,20) );  // hay 3 larvas adentro.
        Volcan volcan = new Volcan(new Posicion(10,10));
        Zangano zangano = unaRaza.evolucionarUnZangano(unCriadero);
        zangano.caminarAPosicion(new Posicion(10,10));
        unaRaza.construirUnExtractor(volcan, hpExtractor);//zangano muta y tenes el edificio. viene otro zangano y trabaja.
        // new larva   / larva.evolucionar.
        // luego al zangano  -> zangano.mutarEdificio().
        // new zangano  -> zangano.trabajar(edificio).
        //
        //
        for(int i = 0; i <6; i++ ){
            unaRaza.ejecutarTurno();
        }

        Zangano otroZangano = unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.agregarZanganoExtractor(otroZangano,volcan);

        unaRaza.ejecutarTurno();
        int cantidadGas = unaRaza.getCantidadGas();

        assertEquals(10,cantidadGas);
    }
}
