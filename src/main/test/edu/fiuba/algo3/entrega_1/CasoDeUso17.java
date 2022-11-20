package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Edificio.Protoss.PuertoEstelar;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Edificio.Zerg.ReservaDeReproduccion;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CasoDeUso17 {

    @Test
    public void testRazaZergQuiereConstruirUnaGuaridaNoDeberiaPoderSiNoTieneReservaDeReproduccion(){

        //Arrange
        RazaZerg raza = new RazaZerg();
        raza.aumentarRecursos(500,500);
        //Act y Assert
        assertThrows(CorrelativaDeConstruccionIncumplidaError.class, ()-> {
            raza.agregarEdificio(new Guarida());
        });

    }

    @Test
    public void testRazaZergQuiereConstruirUnaGuaridaSiDeberiaPoderSiTieneReservaDeReproduccion(){

        //Arrange
        RazaZerg raza = new RazaZerg();
        raza.aumentarRecursos(500,500);
        raza.agregarEdificio(new ReservaDeReproduccion());

        //Act y Assert
        assertDoesNotThrow(  ()-> {
            raza.agregarEdificio(new Guarida());
        });

    }
    @Test
    public void testRazaProtossQuiereConstruirUnPuertoEstelarNoDeberiaPoderSiNoTieneAcceso(){

        //Arrange
        RazaProtoss raza = new RazaProtoss();
        raza.aumentarRecursos(500,500);

        //Act y Assert
        assertThrows( CorrelativaDeConstruccionIncumplidaError.class, ()-> {
            raza.agregarEdificio(new PuertoEstelar());
        });

    }

    @Test
    public void testRazaProtossQuiereConstruirUnPuertoEstelarSiDeberiaPoderSiTieneAcceso(){
        //Arrange
        RazaProtoss raza = new RazaProtoss();
        raza.aumentarRecursos(500,500);

        raza.agregarEdificio(new Acceso());

        //Act y Assert
        assertDoesNotThrow(  ()-> {
            raza.agregarEdificio(new PuertoEstelar());
        });

    }

}

