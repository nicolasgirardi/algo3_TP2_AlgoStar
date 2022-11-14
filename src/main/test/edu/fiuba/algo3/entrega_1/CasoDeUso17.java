package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
/*
public class CasoDeUso17 {

    @Test
    public void testRazaZergQuiereConstruirUnaGuaridaNoDeberiaPoderSiNoTieneReservaDeReproduccion(){

        //Arrange
        RazaZerg raza = new RazaZerg();

        //Act y Assert
        assertThrows( CorrelativaDeConstruccionIncumplidaError.class, ()-> {
            raza.agregarEdificio(new Guarida());
        });

    }

    @Test
    public void testRazaZergQuiereConstruirUnaGuaridaSiDeberiaPoderSiTieneReservaDeReproduccion(){

        //Arrange
        RazaZerg raza = new RazaZerg();
        raza.agregarEdificio(new ReservaDeReproduccion());

        //Act y Assert
        assertDoesNotThrow(  ()-> {
            raza.agregarEdificio(new Guarida());
        });

    }

    @Test
    public void testRazaProtossQuiereConstruirUnPuertoEstelarNoDeberiaPoderSiNoTieneAcceso(){

        //Arrange
        RazaZerg raza = new RazaZerg();
        raza.agregarEdificio(new ReservaDeReproduccion());

        //Act y Assert
        assertThrows( CorrelativaDeConstruccionIncumplidaError.class, ()-> {
            raza.agregarEdificio(new PuertoEstelar());
        });

    }

    @Test
    public void testRazaProtossQuiereConstruirUnPuertoEstelarSiDeberiaPoderSiTieneAcceso(){

        //Arrange
        RazaZerg raza = new RazaZerg();
        raza.agregarEdificio(new ReservaDeReproduccion());

        //Act y Assert
        assertDoesNotThrow(  ()-> {
            raza.agregarEdificio(new PuertoEstelar());
        });

    }
}*/

