package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CasoDeUso7 {

    @Test
    public void testUnExtractorConDosZanganosEn1TurnosDeberiaRecolectarLoEstimado() {

        //Arrange
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints HPmock = mock(HitPoints.class);
        HitPoints hp = mock(HitPoints.class);
        HitPoints hpExtractor = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor(volcan,hpExtractor);
        unaRaza.agregarNuevoEdificio(extractor);

        for(int i = 0; i < 10; i++ ){
            unaRaza.ejecutarTurno();
        }
        for(int i = 0; i < 2; i++ ){
            Zangano zangano = unaRaza.evolucionarUnZangano(unCriadero);
            extractor.agregarZangano(zangano);
        }

        //Act
        unaRaza.ejecutarTurno();
        int cantidadGas = unaRaza.getCantidadGas();

        //Assert
        assertEquals(20 , cantidadGas );
    }

    @Test
    public void testUnExtractorConDosZanganosEn10TurnosDeberiaRecolectarLoEstimado() {

        //Arrange
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints HPmock = mock(HitPoints.class);
        HitPoints hp = mock(HitPoints.class);
        HitPoints hpExtractor = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor(volcan,hpExtractor);
        unaRaza.agregarNuevoEdificio(extractor);

        for(int i = 0; i < 10; i++ ){
            unaRaza.ejecutarTurno();
        }
        for(int i = 0; i < 2; i++ ){
            Zangano zangano = unaRaza.evolucionarUnZangano(unCriadero);
            extractor.agregarZangano(zangano);
        }

        //Act
        for(int i = 0; i < 10; i++){
            unaRaza.ejecutarTurno();
        }
        int cantidadGas = unaRaza.getCantidadGas();

        //Assert
        assertEquals(200 , cantidadGas );
    }

    @Test
    public void testUnZanganoTrabajandoEnUnMineralEnUnTurnoDeberiaRecolectarLoEstimado(){
        //Arrange
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints HPmock = mock(HitPoints.class);
        HitPoints hp = mock(HitPoints.class);
        HitPoints hpExtractor = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        Zangano zangano = unaRaza.evolucionarUnZangano(unCriadero);
        NodoMineral nodoMineral = new NodoMineral();
        zangano.setTrabajo(new TrabajoMineral(nodoMineral));

        //Act
        unaRaza.ejecutarTurno();
        int cantidadMineral = unaRaza.getCantidadMineral();

        //Assert
        assertEquals(10,cantidadMineral);
    }

    @Test
    public void testUnZanganoTrabajandoEnUnMineralEnDosTurnosDeberiaRecolectarLoEstimado(){
        //Arrange
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints HPmock = mock(HitPoints.class);
        HitPoints hp = mock(HitPoints.class);
        HitPoints hpExtractor = mock(HitPoints.class);
        Criadero unCriadero = new Criadero(hp);  // hay 3 larvas adentro.
        Zangano zangano = unaRaza.evolucionarUnZangano(unCriadero);
        NodoMineral nodoMineral = new NodoMineral();
        zangano.setTrabajo(new TrabajoMineral(nodoMineral));

        //Act
        unaRaza.ejecutarTurno();
        unaRaza.ejecutarTurno();
        int cantidadMineral = unaRaza.getCantidadMineral();

        //Assert
        assertEquals(20,cantidadMineral);
    }
}
