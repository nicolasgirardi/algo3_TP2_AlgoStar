package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso10 {

    @Test
    public void UnCriaderoReciBeDañoYSeRegeneraPorTurno(){
        HitPoints HPmock = mock(HitPoints.class);
        Edificio edificio = new Criadero(HPmock);

        edificio.recibirDaño(30);

        verify(HPmock,times(1)).recibirDaño(30);
    }


}