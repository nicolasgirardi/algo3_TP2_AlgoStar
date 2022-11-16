package edu.fiuba.algo3.entrega_1;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.HitPoints.*;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import org.junit.jupiter.api.Test;

import java.security.interfaces.RSAKey;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CasoDeUso11 {
    @Test
    public void UnNexoMineralProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(250,250);
        Edificio edificio = new NexoMineral(new NodoMineral()); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);

        //verify(HPmock,times(1)).recibirDaño(30);
        assertEquals(250,edificio.vidaActual());
        assertEquals(220,edificio.escudoActual());
    }

    @Test
    public void UnNexoMineralRecibeDañoySeRegeneraPorTurno(){

        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(250,250);
        Edificio edificio = new NexoMineral(new NodoMineral()); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);
        //when(HPmock.vida()).thenReturn(250);
        //when(HPmock.escudo()).thenReturn(250);
        for(int i=0; i<10;i++){
            edificio.regeneracionFinDeTurno();
        }

        //verify(HPmock,times(10)).regenerar();

        assertEquals(250,edificio.vidaActual());
        assertEquals(250,edificio.escudoActual());
    }

    @Test
    public void UnPilonProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(300,300);
        Edificio edificio = new Pilon(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);

        //verify(HPmock,times(1)).recibirDaño(30);
        assertEquals(300,edificio.vidaActual());
        assertEquals(270,edificio.escudoActual());
    }

    @Test
    public void UnPilonRecibeDañoySeRegeneraPorTurno(){

        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(300,300);
        Edificio edificio = new Pilon(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);
        //when(HPmock.vida()).thenReturn(300);
        //when(HPmock.escudo()).thenReturn(300);
        for(int i=0; i<10;i++){
            edificio.regeneracionFinDeTurno();
        }

        //verify(HPmock,times(10)).regenerar();

        assertEquals(300,edificio.vidaActual());
        assertEquals(300,edificio.escudoActual());
    }
    @Test
    public void UnAsimiladorProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(450,450);
        Edificio edificio = new Asimilador(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);

        //verify(HPmock,times(1)).recibirDaño(30);
        assertEquals(450,edificio.vidaActual());
        assertEquals(420,edificio.escudoActual());
    }

    @Test
    public void UnAsimiladorRecibeDañoySeRegeneraPorTurno(){

        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(450,450);
        Edificio edificio = new Asimilador(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);
        //when(HPmock.vida()).thenReturn(450);
        //when(HPmock.escudo()).thenReturn(450);
        for(int i=0; i<10;i++){
            edificio.regeneracionFinDeTurno();
        }

        //verify(HPmock,times(10)).regenerar();

        assertEquals(450,edificio.vidaActual());
        assertEquals(450,edificio.escudoActual());
    }
    @Test
    public void UnAccesoProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(500,500);
        Edificio edificio = new Acceso(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);

        //verify(HPmock,times(1)).recibirDaño(30);
        assertEquals(500,edificio.vidaActual());
        assertEquals(470,edificio.escudoActual());
    }

    @Test
    public void UnAccesoRecibeDañoySeRegeneraPorTurno(){

        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(500,500);
        Edificio edificio = new Acceso(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);
        //when(HPmock.vida()).thenReturn(500);
        //when(HPmock.escudo()).thenReturn(500);
        for(int i=0; i<10;i++){
            edificio.regeneracionFinDeTurno();
        }

        //verify(HPmock,times(10)).regenerar();

        assertEquals(500,edificio.vidaActual());
        assertEquals(500,edificio.escudoActual());
    }

    @Test
    public void UnPuertoEstelarReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(600,600);
        Edificio edificio = new PuertoEstelar(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);

        //verify(HPmock,times(1)).recibirDaño(30);
        assertEquals(600,edificio.vidaActual());
        assertEquals(570,edificio.escudoActual());
    }

    @Test
    public void UnPuertoEstelarRecibeDañoySeRegeneraPorTurno(){

        //HitPoints HPmock = mock(HitPoints.class);
        HitPoints HP = new HPProtoss(600,600);
        Edificio edificio = new PuertoEstelar(); //podría ser cualquier edificio
        edificio.asignarHP(HP);
        edificio.recibirDaño(30);
        //when(HPmock.vida()).thenReturn(600);
        //when(HPmock.escudo()).thenReturn(600);
        for(int i=0; i<10;i++){
            edificio.regeneracionFinDeTurno();
        }

        //verify(HPmock,times(10)).regenerar();

        assertEquals(600,edificio.vidaActual());
        assertEquals(600,edificio.escudoActual());
    }
}
