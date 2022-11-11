package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class CasoDeUso1y2 {

    //Caso 1 --------------
    @Test
    public void testCriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDosYDeberiaTenerUnZangano() {
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints hp = mock(HitPoints.class);     //para la vida
        Criadero unCriadero = new Criadero(hp);   // hay 3 larvas adentro. si hp no sirve para nada criadero no tendria que tener algo con vida.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);

        assertEquals(2, unaRaza.getCantidadLarvas()); //metodos a proposito del test. eliminarlo y ver como seria el comportamiento.
        assertEquals(1, unaRaza.getCantidadZangano()); //5 assert y todas distintas naturalezas esta mal ,
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
        int cantidadLarvas = unaRaza.getCantidadLarvas();

        assertEquals(3, cantidadLarvas);
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
        HitPoints HPmock = mock(HitPoints.class);
        Extractor unExtractor = new Extractor(6,HPmock);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unExtractor.agregarZangano(new Zangano(new Posicion(10,10)));
        });
    }

    @Test
    public void testSeConstruyeUnaReservaDeReproduccionNuevaYSeLaQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        HitPoints HPmock = mock(HitPoints.class);
        ReservaDeReproduccion unaReserva = new ReservaDeReproduccion(12,HPmock);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unaReserva.evolucionarLarvas();
        });
    }

    @Test
    public void testSeConstruyeUnaGuaridaNuevaYSeLaQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        HitPoints HPmock = mock(HitPoints.class);
        Guarida unaGuarida = new Guarida(12,HPmock);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unaGuarida.evolucionarLarvas();
        });
    }

    @Test
    public void testSeConstruyeUnaEspiralNuevaYSeLaQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        HitPoints HPmock = mock(HitPoints.class);
        Espiral unaEspiral = new Espiral(10,HPmock);
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
        HitPoints HPmock = mock(HitPoints.class);
        Pilon unPilon = new Pilon(5,HPmock);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unPilon.utilizar();
        });
    }

    /*@Test
    public void testSeConstruyeUnNuevoAsimiladorYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        HitPoints HPmock = mock(HitPoints.class);
        Asimilador unAsimilador = new Asimilador(6,HPmock);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unAsimilador.extraer();
        });
    }*/

    @Test
    public void testSeConstruyeUnNuevoAccesoYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        HitPoints HPmock = mock(HitPoints.class);
        Acceso unAcceso = new Acceso(8,HPmock);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unAcceso.transportarTropas();
        });
    }

    @Test
    public void testSeConstruyeUnNuevoPuertoEstelarYSeLoQuiereUtilizarDeberiaTirarExcepcionEdificioNoOperativoError(){
        HitPoints HPmock = mock(HitPoints.class);
        PuertoEstelar unPuertoEstelar = new PuertoEstelar(10,HPmock);
        assertThrows( EdificioNoOperativoError.class, ()-> {
            unPuertoEstelar.transportarUnidades();
        });
    }
}
