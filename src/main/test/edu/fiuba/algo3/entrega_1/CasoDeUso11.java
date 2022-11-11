package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CasoDeUso11 {
    @Test
    public void UnNexoMineralProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new NexoMineral(HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnNexoMineralRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new NexoMineral(HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(250);
        when(HPmock.escudo()).thenReturn(250);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(250,edificio.vidaActual());
        assertEquals(250,edificio.escudoActual());
    }

    @Test
    public void UnPilonProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Pilon(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnPilonRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Pilon(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(300);
        when(HPmock.escudo()).thenReturn(300);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(300,edificio.vidaActual());
        assertEquals(300,edificio.escudoActual());
    }
    @Test
    public void UnAsimiladorProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Asimilador(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnAsimiladorRecibeDañoySeRegeneraPorTurno(){
        //mocks para simular depedencia para simular despuees la tenes que reemplazar
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Asimilador(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(450);
        when(HPmock.escudo()).thenReturn(450);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(450,edificio.vidaActual());
        assertEquals(450,edificio.escudoActual());
    }
    @Test
    public void UnAccesoProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Acceso(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnAccesoRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Acceso(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(500);
        when(HPmock.escudo()).thenReturn(500);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(500,edificio.vidaActual());
        assertEquals(500,edificio.escudoActual());
    }

    @Test
    public void UnPuertoEstelarReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new PuertoEstelar(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnPuertoEstelarRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new PuertoEstelar(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(600);
        when(HPmock.escudo()).thenReturn(600);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(600,edificio.vidaActual());
        assertEquals(600,edificio.escudoActual());
    }
}
