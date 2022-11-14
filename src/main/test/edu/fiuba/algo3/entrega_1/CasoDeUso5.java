package edu.fiuba.algo3.entrega_1;


import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Edificio.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso5 {
    @Test
    public void testNoSePuedeConstruirFueraDelMoho(){
        //Mapa mapa = new Mapa();

        Celda celdaCriadero = new Celda(0,0);
        //act
        celdaCriadero.asignarMoho(new Criadero());

        Celda celdaEdificio = new Celda(8,8);

        Edificio unEdificio = new Guarida();
        //assert

        assertThrows( ConstruccionFueraDelMohoError.class, ()-> {
            celdaEdificio.asignarEdificoZerg(unEdificio);
        });

    }
    @Test
    public void testNoSePuedeConstruirFueraDelRangoDelPilon(){
        //Mapa mapa = new Mapa();

        Celda celdaPilon = new Celda(0,0);

        celdaPilon.asignarRangoPilon(new Pilon());
        //act

        Celda celdaEdificio = new Celda(5,5);
        Edificio unEdificio = new PuertoEstelar();

        //assert
        assertThrows( ConstruccionFueraDelRangoPilonError.class, ()-> {
            celdaEdificio.asignarEdificoProtos(unEdificio);
        });

    }
}
