package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CasoDeUso17 {

    @Test
    public void testRazaZergQuiereConstruirUnaGuaridaNoDeberiaPoderSiNoTieneReservaDeReproduccion(){

        //Arrange
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(500));
        raza.aumentarGas(new GestionRecurso(500));


        //Act y Assert
        assertThrows(CorrelativaDeConstruccionIncumplidaError.class, ()-> {
            raza.agregarEdificio(new Guarida());
        });

    }

    @Test
    public void testRazaZergQuiereConstruirUnaGuaridaSiDeberiaPoderSiTieneReservaDeReproduccion(){

        //Arrange
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(500));
        raza.aumentarGas(new GestionRecurso(500));
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
        raza.aumentarMineral(new GestionRecurso(500));
        raza.aumentarGas(new GestionRecurso(500));

        //Act y Assert
        assertThrows( CorrelativaDeConstruccionIncumplidaError.class, ()-> {
            raza.agregarEdificio(new PuertoEstelar());
        });

    }

    @Test
    public void testRazaProtossQuiereConstruirUnPuertoEstelarSiDeberiaPoderSiTieneAcceso(){
        //Arrange
        RazaProtoss raza = new RazaProtoss();
        raza.aumentarMineral(new GestionRecurso(500));
        raza.aumentarGas(new GestionRecurso(500));

        raza.agregarEdificio(new Acceso());

        //Act y Assert
        assertDoesNotThrow(  ()-> {
            raza.agregarEdificio(new PuertoEstelar());
        });

    }

}

