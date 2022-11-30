package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Edificio.Protoss.*;
import edu.fiuba.algo3.modelo.Edificio.Zerg.*;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso2 {


    @Test
    public void EdificoCriaderoCon4TurnosParaSerOperativoSeLeMandaAEvolucionarLarvaDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        Criadero criadero = new Criadero(4);
        //Act y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            criadero.evolucionarLarva();
        });
        //criadero tiene las 3 larvas adentro y recien las suelta para que caminen cuando sea operativo.
    }

    @Test
    public void EdificoCriaderoCon4TurnosParaSerOperativoPasan2TurnosYSeLeMandaAEvolucionarLarvaDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){

        //Arrange
        Criadero criadero = new Criadero(4);

        //Act
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();

        //assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            criadero.evolucionarLarva();
        });
    }

    @Test
    public void EdificoCriaderoCon4TurnosParaSerOperativoPasan4TurnosYSeLeMandaAEvolucionarLarvaNoDeberiaLanzarExcepcion(){
        //Arrange
        Raza raza = new RazaZerg(new GestionRecurso(500), new GestionRecurso(500));
        Criadero criadero = new Criadero(4);
        raza.agregarEdificio(criadero);
        //Act
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();

        //assert
       assertDoesNotThrow(  ()->{
            criadero.evolucionarLarva();
       });
    }

    @Test
    public void EdificoReservaDeReproduccionCon12TurnosParaSerOperativoSeLeMandaEvolucionarZerlingDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange

        ReservaDeReproduccion reserva = new ReservaDeReproduccion();
        Larva larva = new Larva();
        //Act y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            reserva.evolucionarLarvaAZerli(larva);
        });
    }

    @Test
    public void EdificoReservaDeReproduccionCon12TurnosParaSerOperativoPasan5TurnosSeLeMandaEvolucionarZerlingDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange

        ReservaDeReproduccion reserva = new ReservaDeReproduccion();
        Larva larva = new Larva();
        //Act
        for(int i = 0 ; i < 5 ; i++){
            reserva.ejecutarTurno();
        }

        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            reserva.evolucionarLarvaAZerli(larva);
        });
    }


    @Test
    public void EdificoExtractorCon6TurnosParaSerOperativoSeLeAgregaUnZanganoDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        Extractor extractor = new Extractor();
        Zangano unZangano = new Zangano(new HPZerg(25));
        //Acy y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            extractor.agregarZangano(unZangano);
        });

    }

    @Test
    public void EdificoExtractorCon6TurnosParaSerOperativoSeEjecutan4TurnosSeLeAgregaUnZanganoDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        Extractor extractor = new Extractor();
        Zangano unZangano = new Zangano(new HPZerg(25));
        //Act
        for(int i = 0 ; i < 4 ; i++){
            extractor.ejecutarTurno();
        }
        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            extractor.agregarZangano(unZangano);
        });
    }

    @Test
    public void EdificoExtractorCon6TurnosParaSerOperativoSeEjecutan6TurnosSeLeAgregaUnZanganoNoDeberiaLanzarExcepcionPorqueYaEstaOperativo(){
        //Arrange
        Extractor extractor = new Extractor( );
        Zangano unZangano = new Zangano(new HPZerg(25));
        //Act
        for(int i = 0 ; i < 6 ; i++){
            extractor.ejecutarTurno();
        }
        //Assert
        assertDoesNotThrow(  ()-> {
            extractor.agregarZangano(unZangano);
        });
    }


    //guardia

    @Test
    public void EdificoGuaridaCon12TurnosParaSerOperativoSeLeMandaAEvolucionarUnaLarvaDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        Guarida guarida = new Guarida();
        Larva unaLarva = new Larva();
        //Acy y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            Hidralisco hidralisco = guarida.evolucionarLarvaAHidra(unaLarva);
        });

    }

    @Test
    public void EdificoGuaridaCon12TurnosParaSerOperativoSeEjecuta4TurnosYSeLeMandaAEvolucionarUnaLarvaDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        Guarida guarida = new Guarida();
        Larva unaLarva = new Larva();
        //Act
        for(int i = 0 ; i < 4 ; i++){
            guarida.ejecutarTurno();
        }
        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            Hidralisco hidralisco = guarida.evolucionarLarvaAHidra(unaLarva);
        });

    }

    @Test
    public void EdificoGuaridaCon12TurnosParaSerOperativoSeEjecuta12TurnosYSeLeMandaAEvolucionarUnaLarvaNoDeberiaLanzarExcepcionPorqueYaEstaOperativo(){
        //Arrange
        Guarida guarida = new Guarida();
        Larva unaLarva = new Larva();
        //Act
        for(int i = 0 ; i < 12 ; i++){
            guarida.ejecutarTurno();
        }
        //Assert
        assertDoesNotThrow(  ()-> {
            Hidralisco hidralisco = guarida.evolucionarLarvaAHidra(unaLarva);
        });
    }

    //Espiral

    @Test
    public void EdificoEspiralCon10TurnosParaSerOperativoSeLeMandaCrearMutaliscoDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        Espiral espiral = new Espiral();
        //Acy y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
           espiral.crearMutalisco();
        });

    }

    @Test
    public void EdificoEspiralCon10TurnosParaSerOperativoSeEjecuta4TurnosSeLeMandaCrearMutaliscoDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        Espiral espiral = new Espiral();
        //Act
        for(int i = 0 ; i < 4 ; i++){
            espiral.ejecutarTurno();
        }
        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            espiral.crearMutalisco();
        });

    }

    @Test
    public void EdificoEspiralCon10TurnosParaSerOperativoSeEjecuta10TurnosYSeLeMandaCrearMutaliscoNoDeberiaLanzarExcepcionPorqueYaEstaOperativo(){
        //Arrange
        Espiral espiral = new Espiral();
        RazaZerg raza = new RazaZerg();
        raza.aumentarGas(new GestionRecurso(500));
        raza.aumentarMineral(new GestionRecurso(500));
        raza.agregarEdificio(new Criadero());
        raza.agregarEdificio(espiral);
        //Act
        for(int i = 0 ; i < 10 ; i++){
            espiral.ejecutarTurno();
        }
        //Assert
        assertDoesNotThrow(  ()-> {
            espiral.crearMutalisco();
        });
    }

    @Test
    public void testEdificoNexoMineralCon4TurnosParaSerOperativoSeLeMandaRecolectarMineralDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        NodoMineral nodoMineral = new NodoMineral();
        NexoMineral nexoMineral = new NexoMineral(nodoMineral);
        //Acy y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            nexoMineral.extraer();
        });
    }

    @Test
    public void testEdificoNexoMineralCon4TurnosSeEjecuta2TurnosParaSerOperativoYSeLeMandaRecolectarMineralDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange
        NodoMineral nodoMineral = new NodoMineral();
        NexoMineral nexoMineral = new NexoMineral(nodoMineral);

        //Act
        nexoMineral.ejecutarTurno();
        nexoMineral.ejecutarTurno();

        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            nexoMineral.extraer();
        });
    }

    @Test
    public void testEdificoNexoMineralCon4TurnosParaSerOperativoSeEjecuta4TurnosYSeLeMandaRecolectarMineralNoDeberiaLanzarExcepcionPorqueYaEstaOperativo(){
        //Arrange
        NodoMineral nodoMineral = new NodoMineral();
        NexoMineral nexoMineral = new NexoMineral(nodoMineral);

        //Act
        nexoMineral.ejecutarTurno();
        nexoMineral.ejecutarTurno();
        nexoMineral.ejecutarTurno();
        nexoMineral.ejecutarTurno();

        //Assert
        assertDoesNotThrow( ()-> {
            nexoMineral.extraer();
        });
    }

    @Test
    public void testEdificioPilonCon5TurnosParaSerOperativoSeLeMandaEnergizarDeberiaLanzarExcepcion(){
        //Arrange
        Pilon pilon = new Pilon();

        //Act
        pilon.ejecutarTurno();
        pilon.ejecutarTurno();
        // Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            pilon.energizar();
        });
    }

    @Test
    public void testEdificioPilonCon5TurnosParaSerOperativoSeEjecutan2TurnosYSeLeMandaEnergizarDeberiaLanzarExcepcion(){
        //Arrange
        Pilon pilon = new Pilon();

        //Act
        pilon.ejecutarTurno();
        pilon.ejecutarTurno();
        // Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            pilon.energizar();
        });
    }
    @Test
    public void testEdificioPilonCon5TurnosParaSerOperativoSeEjecutan5TurnosYSeLeMandaEnergizarNoDeberiaLanzarExcepcion(){
        //Arrange
        Pilon pilon = new Pilon();

        //Act
        pilon.ejecutarTurno();
        pilon.ejecutarTurno();
        pilon.ejecutarTurno();
        pilon.ejecutarTurno();
        pilon.ejecutarTurno();

        // Assert
        assertDoesNotThrow( ()-> {
            pilon.energizar();
        });
    }

    @Test
    public void testEdificioAsimiladorCon6TurnosParaSerOperativoSeLeMandaPrepararCapsulaDeberiaLanzarExcepcion(){
        //Arrange
        Asimilador asimilador = new Asimilador( );

        // Act y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            asimilador.prepararCapsula();
        });

    }
    @Test
    public void testEdificioAsimiladorCon6TurnosParaSerOperativoSeEjecuta2TurnosYSeLeMandaPrepararCapsulaDeberiaLanzarExcepcion(){
        //Arrange
        Asimilador asimilador = new Asimilador( ) ;

        //Act
        asimilador.ejecutarTurno();
        asimilador.ejecutarTurno();

        // Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            asimilador.prepararCapsula();
        });

    }

    @Test
    public void testEdificioAsimiladorCon6TurnosParaSerOperativoSeEjecuta6TurnosYSeLeMandaPrepararCapsulaNoDeberiaLanzarExcepcion(){
        //Arrange
        Asimilador asimilador = new Asimilador(  );

        //Act
        asimilador.ejecutarTurno();
        asimilador.ejecutarTurno();
        asimilador.ejecutarTurno();
        asimilador.ejecutarTurno();
        asimilador.ejecutarTurno();
        asimilador.ejecutarTurno();

        // Assert
        assertDoesNotThrow(  ()-> {
            asimilador.prepararCapsula();
        });
    }

    @Test
    public void testEdificioAccesoCon8TurnosParaSerOperativoSeLoMandaATransportarTroparDeberiaLanzarExcepcion(){
        //Arrange
        Acceso acceso = new Acceso();


        // Act y  Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            acceso.transportarTropas();
        });
    }

    @Test
    public void testEdificioAccesoCon8TurnosParaSerOperativoSeEjecutan4TurnosYSeLoMandaATransportarTroparDeberiaLanzarExcepcion(){
        //Arrange
        Acceso acceso = new Acceso();


        //Act
        acceso.ejecutarTurno();
        acceso.ejecutarTurno();
        acceso.ejecutarTurno();
        acceso.ejecutarTurno();

        // Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            acceso.transportarTropas();
        });


    }

    @Test
    public void testEdificioAccesoCon8TurnosParaSerOperativoSeEjecutan8TurnosYSeLoMandaATransportarTroparNoDeberiaLanzarExcepcion(){
        //Arrange
        Acceso acceso = new Acceso();


        //Act
        for(int i = 0; i < 8 ; i++){
            acceso.ejecutarTurno();
        }

        // Assert
        assertDoesNotThrow(  ()-> {
            acceso.transportarTropas();
        });
    }

    @Test
    public void testEdificioPuertoEstelarCon10TurnosParaSerOperativoYSeLoMandaATransportarUnidadesDeberiaLanzarExcepcion(){
        //Arrange
        PuertoEstelar puertoEstelar = new PuertoEstelar();


        // Act y  Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            puertoEstelar.transportarUnidades();
        });

    }

    @Test
    public void testEdificioPuertoEstelarCon10TurnosParaSerOperativSeEjecutan4TurnosYSeLoMandaATransportarUnidadesDeberiaLanzarExcepcion(){
        //Arrange
        PuertoEstelar puertoEstelar = new PuertoEstelar();

        //Act
        puertoEstelar.ejecutarTurno();
        puertoEstelar.ejecutarTurno();
        puertoEstelar.ejecutarTurno();
        puertoEstelar.ejecutarTurno();

        // Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            puertoEstelar.transportarUnidades();
        });
    }

    @Test
    public void testEdificioPuertoEstelarCon10TurnosParaSerOperativSeEjecutan10TurnosYSeLoMandaATransportarUnidadesNoDeberiaLanzarExcepcion(){
        //Arrange
        PuertoEstelar puertoEstelar = new PuertoEstelar();

        //Act
        for(int i = 0; i < 10 ; i++){
            puertoEstelar.ejecutarTurno();
        }

        // Assert
        assertDoesNotThrow( ()-> {
            puertoEstelar.transportarUnidades();
        });
    }

}
