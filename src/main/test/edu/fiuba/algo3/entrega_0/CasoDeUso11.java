package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso11 {
    @Test
    public void UnEdificioProtosReciBeDañoYUsaElMetodoRecibirDañoDeHitPoints(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new NexoMineral(HPmock); //podría ser cualquier edificio

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }

    @Test
    public void UnEdificioZergRecibeDañoySeRegeneraPorTurno(){

        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Criadero(HPmock); //podría ser cualquier edificio

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

}
