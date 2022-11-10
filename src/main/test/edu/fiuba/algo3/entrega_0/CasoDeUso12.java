package edu.fiuba.algo3.entrega_0;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso12 {

    @Test
    public void UnNexoMineralRecibeDemasiadoDañoySoloRegeneraEscudo(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new NexoMineral(HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(300);
        when(HPmock.vida()).thenReturn(200);
        when(HPmock.escudo()).thenReturn(250);
        for(int i=0; i<10;i++) {
            edificio.ejecutarTurno();
        }
        verify(HPmock,times(10)).regenerar();

        assertEquals(200,edificio.vidaActual());
        assertEquals(250,edificio.escudoActual());

    }
    @Test
    public void UnPilonRecibeDemasiadoDañoySoloRegeneraEscudo(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Pilon(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(400);
        when(HPmock.vida()).thenReturn(200);
        when(HPmock.escudo()).thenReturn(300);
        for(int i=0; i<10;i++) {
            edificio.ejecutarTurno();
        }
        verify(HPmock,times(10)).regenerar();

        assertEquals(200,edificio.vidaActual());
        assertEquals(300,edificio.escudoActual());

    }
    @Test
    public void UnAsimiladorRecibeDemasiadoDañoySoloRegeneraEscudo(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Asimilador(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(650);
        when(HPmock.vida()).thenReturn(200);
        when(HPmock.escudo()).thenReturn(450);
        for(int i=0; i<10;i++) {
            edificio.ejecutarTurno();
        }
        verify(HPmock,times(10)).regenerar();

        assertEquals(200,edificio.vidaActual());
        assertEquals(450,edificio.escudoActual());

    }
    @Test
    public void UnAccesoRecibeDemasiadoDañoySoloRegeneraEscudo(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Acceso(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(800);
        when(HPmock.vida()).thenReturn(200);
        when(HPmock.escudo()).thenReturn(500);
        for(int i=0; i<10;i++) {
            edificio.ejecutarTurno();
        }
        verify(HPmock,times(10)).regenerar();

        assertEquals(200,edificio.vidaActual());
        assertEquals(500,edificio.escudoActual());

    }
    @Test
    public void UnPuertoEstelarRecibeDemasiadoDañoySoloRegeneraEscudo(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new PuertoEstelar(0,HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(1000);
        when(HPmock.vida()).thenReturn(200);
        when(HPmock.escudo()).thenReturn(600);
        for(int i=0; i<10;i++) {
            edificio.ejecutarTurno();
        }
        verify(HPmock,times(10)).regenerar();

        assertEquals(200,edificio.vidaActual());
        assertEquals(600,edificio.escudoActual());

    }
}
