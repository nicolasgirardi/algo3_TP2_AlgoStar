package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.RecursoOcupadoError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso8 {

    //Verificar que sino se tienen los recursos no se pueden construir los edificios (Para cada
    //edificio para cada raza).

    @Test
    public void testRazaZergQuiereConstruirseUnCriaderoPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg(); //comienza sin recursos
        Criadero criadero = new Criadero();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(criadero);
        });
    }

    @Test
    public void testRazaZergQuiereConstruirseUnaReservaDeReproduccionPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg();//comienza sin recursos
        ReservaDeReproduccion reserva = new ReservaDeReproduccion();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(reserva);
        });
    }

    @Test
    public void testRazaZergQuiereConstruirseUnExtractorPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg();//comienza sin recursos
        Extractor extractor = new Extractor();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(extractor);
        });
    }
    @Test
    public void testRazaZergQuiereConstruirseUnaGuaridaPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg(); //comienza sin recursos
        Guarida guarida = new Guarida();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(guarida);
        });
    }
    @Test
    public void testRazaZergQuiereConstruirseUnEspiralPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaZerg razaZerg = new RazaZerg();//comienza sin recursos
        Espiral espiral = new Espiral();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaZerg.agregarEdificio(espiral);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnNexoMineralPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();    //comienza sin recursos
        NexoMineral nexoMineral = new NexoMineral();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaProtoss.agregarEdificio(nexoMineral);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnPilonPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();    //comienza sin recursos
        Pilon pilon = new Pilon();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaProtoss.agregarEdificio(pilon);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnAsimiladorPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();    //comienza sin recursos
        Asimilador asimilador = new Asimilador();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaProtoss.agregarEdificio(asimilador);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnAccesoPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();    //comienza sin recursos
        Acceso acceso = new Acceso();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaProtoss.agregarEdificio(acceso);
        });
    }

    @Test
    public void testRazaProtossQuiereConstruirseUnPuertoEstelarPeroComoNoTieneLosRecursosNoDeberiaPoder(){

        //Arrange
        RazaProtoss razaProtoss = new RazaProtoss();    //comienza sin recursos
        PuertoEstelar puertoEstelar = new PuertoEstelar();

        //Act y assert
        assertThrows( RecursosInsuficientesError.class, ()-> {
            razaProtoss.agregarEdificio(puertoEstelar);
        });
    }

}
