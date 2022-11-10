package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.tablero.Celda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CasoDeUso15 {

    @Test
    public void RazaZergDejaDeConseguirGasCuandoDelVolcanCuandoSeQuedaSinUnidadesDeGas(){
        //Arrange
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints HPmock = mock(HitPoints.class);
        HitPoints hp = mock(HitPoints.class);
        HitPoints hpExtractor = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Criadero unCriadero = new Criadero(hp,posicionConstruir);  // hay 3 larvas adentro.
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor(volcan,hpExtractor);
        unaRaza.agregarNuevoEdificio(extractor);

        // dejo el Extrractor operrable en 6 turnos
        for(int i = 0; i <10; i++ ){
            unaRaza.ejecutarTurno();
        }



        for(int i = 0; i <3; i++ ){
            Zangano zangano = unaRaza.evolucionarUnZangano(unCriadero);
            extractor.agregarZangano(zangano);
        }
        int maximaCantidadGasExtraible = 5000;
        int cantidadDeTurnosParaSacarTodoElGas = 167;


        //Act
        for(int i = 0; i <=cantidadDeTurnosParaSacarTodoElGas ; i++ ){
            unaRaza.ejecutarTurno();
        }
        unaRaza.ejecutarTurno();
        int cantidadGas = unaRaza.getCantidadGas();
        //Assert

        assertEquals(true, cantidadGas == maximaCantidadGasExtraible);

    }

    @Test
    public void RazaZergDejaDeConseguirMineralCuandoDelNodoMineralCuandoSeQuedaSinUnidadesDeMineral(){
        //Arrange
        RazaZerg unaRaza  = new RazaZerg();
        HitPoints HPmock = mock(HitPoints.class);
        HitPoints hp = mock(HitPoints.class);
        HitPoints hpExtractor = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Criadero unCriadero = new Criadero(hp,posicionConstruir);  // hay 3 larvas adentro.
        Zangano zangano = unaRaza.evolucionarUnZangano(unCriadero);
        NodoMineral nodoMineral = new NodoMineral();
        zangano.setTrabajo(new TrabajoMineral(nodoMineral));




        int maximaCantidadGasExtraible = 2000;
        int cantidadDeTurnosParaSacarTodoElGas = 200;


        //Act
        for(int i = 0; i <=cantidadDeTurnosParaSacarTodoElGas + 10 ; i++ ){
            unaRaza.ejecutarTurno();
        }
        unaRaza.ejecutarTurno();
        int cantidadMineral = unaRaza.getCantidadMineral();
        //Assert

        assertEquals(true, cantidadMineral == maximaCantidadGasExtraible);

    }
}
