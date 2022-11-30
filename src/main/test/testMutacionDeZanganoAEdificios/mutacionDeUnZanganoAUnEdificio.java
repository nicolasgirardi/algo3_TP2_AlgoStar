package testMutacionDeZanganoAEdificios;

import edu.fiuba.algo3.modelo.Edificio.Zerg.*;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class mutacionDeUnZanganoAUnEdificio {
/*
    @Test
    public void testZanganoMutaEnUnCriaderoElZanganoQueCreaDeSerEquivalenteAOtroZanganoCreado(){
        //act
        RazaZerg raza = new RazaZerg(new GestionRecurso(1000), new GestionRecurso(1000));
        Zangano unZangano = new Zangano();

        //arrange
        unZangano.mutarCriadero(raza);
        Criadero criaderoNormal = new Criadero(0);
        criaderoNormal.fueAgregado(raza);
        Zangano otroZangano =  unZangano.evolucionarLarva();
        Zangano tercerZangano = criaderoNormal.evolucionarLarva();

        //assert
        assertTrue(otroZangano.equals(tercerZangano));
    }

    @Test
    public void testZanganoMutaAUnEspiralDeberiamosPoderObtenerUnMutaliscoYCompararlos(){
        //act
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(400) );
        raza.aumentarGas(new GestionRecurso(400) );
        raza.agregarEdificio(new Criadero());
        Zangano unZangano = new Zangano();
        Espiral espiralCreado = new Espiral();
        espiralCreado.fueAgregado(raza);

        //arrange
        unZangano.mutarEspiral(raza);

        for(int i = 0; i < 10 ; i++){                   //dejamos operativos los edificios.
            espiralCreado.ejecutarTurno();
            unZangano.ejecutarTurno();
        }

        Mutalisco mutaliscoUno = espiralCreado.crearMutalisco(new Larva());
        Mutalisco mutaliscoDos = unZangano.crearMutalisco();

        //asert
        assertTrue(mutaliscoUno.equals(mutaliscoDos));
    }

    @Test
    public void testZanganoMutaAUnExtractorSeAgregaUnZanganoAlVolcanDeberiaPoderExtraerGas(){
        //act
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(100) );
        raza.aumentarGas(new GestionRecurso(100) );
        Zangano unZangano = new Zangano();
        Volcan volcan = new Volcan();
        GestionRecurso resultadoEsperado = new GestionRecurso(10);

        //arrange
        unZangano.mutarExtractor(raza);
        for(int i = 0; i < 6; i++ ){            // dejo el extractor operable en 6 turnos
            unZangano.ejecutarTurno();
        }
        unZangano.agregarZangano(new Zangano(new HPZerg(25)));
        GestionRecurso cantidadGas = unZangano.extraer(volcan);

        //Assert
        assertEquals(resultadoEsperado, cantidadGas);
    }


    @Test
    public void testZanganoMutaALaReservaDeReproduccion(){
        //act
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(100) );
        raza.aumentarGas(new GestionRecurso(100) );
        Zangano unZangano = new Zangano();
        ReservaDeReproduccion reservaDeReproduccion = new ReservaDeReproduccion();

        //Arrange
        unZangano.mutarReservaReproduccion(raza);
        for(int i = 0; i < 12 ; i++){                   //dejamos operativos los edificios.
            reservaDeReproduccion.ejecutarTurno();
            unZangano.ejecutarTurno();
        }

        Zerling unZerling = unZangano.evolucionarLarvaAZerli(new Larva());
        Zerling otroZerling = reservaDeReproduccion.evolucionarLarvaAZerli(new Larva() );

        assertEquals(unZerling, otroZerling );
    }


    @Test
    public void testZanganoMutaAUnaGuaridaDeberiamosPoderObtenerUnMutaliscoYCompararlos(){

        //act
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(500) );
        raza.aumentarGas(new GestionRecurso(500) );
        Zangano unZangano = new Zangano();
        Zangano otroZangano = new Zangano();
        Guarida guarida = new Guarida();

        //arrange
        otroZangano.mutarReservaReproduccion(raza);  //para poder crear la guarida necesitamos primero la reserva
        unZangano.mutarGuarida(raza);
        for(int i = 0; i < 12 ; i++){           //dejamos operativos los edificios.
            guarida.ejecutarTurno();
            unZangano.ejecutarTurno();
        }


        Hidralisco hidraliscoUno = guarida.evolucionarLarvaAHidra(new Larva());
        Hidralisco hidraliscoDos = unZangano.evolucionarLarvaAHidra(new Larva() );

        //assert
        assertEquals(hidraliscoUno, hidraliscoDos);

    }
*/
}
