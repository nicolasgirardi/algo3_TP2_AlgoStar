package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Celda;
import edu.fiuba.algo3.modelo.Edificio.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Guarida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CasoDeUso13 {
    @Test
    public void SePuedeConstruirSobreElMohoQueDejoUnCriaderoDestruido(){
        Celda celdaCriadero = new Celda(0,0);
        //act
        celdaCriadero.asignarMoho(new Criadero(), celdaCriadero);

        Celda celdaAEliminar = new Celda(0,0);

        Edificio unEdificio = new Guarida();
        celdaCriadero.asignarEdificoZerg(unEdificio);

        //assert
        assertFalse(celdaCriadero.vacio());
    }
}
