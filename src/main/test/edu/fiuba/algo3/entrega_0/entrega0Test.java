package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.tablero.Celda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class entrega0Test {

    //Caso 1 --------------
    @Test
    public void testCriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDosYDeberiaTenerUnZangano() {
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);

        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsaUnaParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener3Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(3, unaRaza.getCantidadLarvas());

    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsa2ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener2Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(2, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testCriaderoSeIniciaCon3LarvasSeUsa3ParaEvolucionaAZanganoYPasaUnTurnoDeberiaTener1Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);
        unaRaza.ejecutarTurno();
        assertEquals(1, unaRaza.getCantidadLarvas());
    }


    //Caso 2 --------------

    @Test
    public void testSeCreaUnCriaderoEnCuatroTurnosEstaOperativo(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(4,hp);
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.ejecutarTurno();
        unaRaza.ejecutarTurno();
        unaRaza.ejecutarTurno();
        unaRaza.ejecutarTurno();
        assertEquals(3, unaRaza.getCantidadLarvas());
    }

    @Test
    public void testSeCreaUnCriaderoYEnElSegundoTurnoSeLePideLaCantidadDeLarvasDeberiaLanzarUnEdificioNoOperativoError(){
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(4,hp);
        unaRaza.agregarNuevoEdificio(unCriadero);
        unCriadero.ejecutarTurno();
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unCriadero.getCantidadLarvas();
        });
    }

    @Test
    public void testSeConstruyeUnExtractorNuevoYSeLeQuiereAgregarUnZanganoDeberiaTirarExcepcionEdificioNoOperativoError(){
        Celda posicionConstruir = new Celda(2, 0);
        Extractor unExtractor = new Extractor(6,posicionConstruir);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unExtractor.agregarZangano(new Zangano(new Posicion()));
        });
    }

    @Test
    public void testSeConstruyeUnaReservaDeReproduccionNuevaYSeLaQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        Celda posicionConstruir = new Celda(5, 3);
        ReservaDeReproduccion unaReserva = new ReservaDeReproduccion(12, posicionConstruir);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unaReserva.evolucionarLarvas();
        });
    }

    @Test
    public void testSeConstruyeUnaGuaridaNuevaYSeLaQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        Celda posicionConstruir = new Celda(7, 9);
        Guarida unaGuarida = new Guarida(12, posicionConstruir);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unaGuarida.evolucionarLarvas();
        });
    }

    @Test
    public void testSeConstruyeUnaEspiralNuevaYSeLaQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        Celda posicionConstruir = new Celda(2, 0);
        Espiral unaEspiral = new Espiral(10, posicionConstruir);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unaEspiral.crear();
        });
    }

    @Test
    public void testSeConstruyeUnaNexoMineralNuevoYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){

        NexoMineral unNexoMineral = new NexoMineral(4);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unNexoMineral.recolectar();
        });
    }

    @Test
    public void testSeConstruyeUnNuevoPilonYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){

        Pilon unPilon = new Pilon(5);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unPilon.utilizar();
        });
    }

    @Test
    public void testSeConstruyeUnNuevoAsimiladorYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){

        Asimilador unAsimilador = new Asimilador(6);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unAsimilador.procesarGas();
        });
    }

    @Test
    public void testSeConstruyeUnNuevoAccesoYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){

        Acceso unAcceso = new Acceso(8);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unAcceso.transportarTropas();
        });
    }

    @Test
    public void testSeConstruyeUnNuevoPuertoEstelarYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){

        PuertoEstelar unPuertoEstelar = new PuertoEstelar(10);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unPuertoEstelar.transportarUnidades();
        });
    }
}
