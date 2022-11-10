package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import java.security.interfaces.RSAKey;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso10 {

    @Test
    public void UnCriaderoReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Criadero(HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnCriaderoRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Criadero(HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(500);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar() ;

        assertEquals(500,edificio.vidaActual());
    }
    @Test
    public void UnaReservaReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new ReservaDeReproduccion(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnaReservaRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new ReservaDeReproduccion(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(1000);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(1000,edificio.vidaActual());
    }

    @Test
    public void UnExtractorReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Extractor(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnExtractorRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Extractor(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(750);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(750,edificio.vidaActual());
    }
    @Test
    public void UnaGuaridaReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Guarida(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnaGuaridaRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Guarida(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(1250);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(1250,edificio.vidaActual());
    }
    @Test
    public void UnaEspiralReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Espiral(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnaEspiralRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Espiral(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);
        when(HPmock.vida()).thenReturn(1300);
        for(int i=0; i<10;i++){
            edificio.ejecutarTurno();
        }

        verify(HPmock,times(10)).regenerar();

        assertEquals(1300,edificio.vidaActual());
    }
}