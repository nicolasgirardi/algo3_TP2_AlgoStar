package edu.fiuba.algo3.entrega_0;
import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.tablero.Celda;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso12 {

    @Test
    public void UnEdificioZergRecibeDemasiadoDañoySoloRegeneraEscudo(){

        HitPoints HPmock = mock(HitPoints.class);
        Celda posicionConstruir = new Celda(0, 0);
        Edificio edificio = new Criadero(HPmock,posicionConstruir); //podría ser cualquier edificio

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
}
