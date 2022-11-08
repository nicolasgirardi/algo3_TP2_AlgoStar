package edu.fiuba.algo3.architecture.Entrega01;


import edu.fiuba.algo3.modelo.Criadero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CasoDeUso1 {


    @Test
    public void SeCreaUnCriaderoOperativoYtiene3Larvas(){

        Criadero edificio = new Criadero(0);

        assertEquals(3,edificio.larvasActuales());

    }

    @Test
    public void SeCreaunCriaderoSeConsumeUnaLarvaYTiene2(){

        Criadero edificio = new Criadero(0);
        edificio.engendrarZangano();

        assertEquals(2,edificio.larvasActuales());

    }

    @Test
    public void SeConsumeUnaLarvaYLuegoDe1TurnoSeTienen3(){
        Criadero edificio = new Criadero(0);
        edificio.engendrarZangano();
        edificio.finDeturno();

        assertEquals(3,edificio.larvasActuales());

    }

    @Test
    public void SeConsumen3LarvasYSeVerificaQueCadaTurnoTengaLaCantidadCorrecta(){
        Criadero edificio = new Criadero(0);
        edificio.engendrarZangano();
        edificio.engendrarZangano();
        edificio.engendrarZangano();

        assertEquals(0,edificio.larvasActuales());

        edificio.finDeturno();
        assertEquals(1,edificio.larvasActuales());

        edificio.finDeturno();
        assertEquals(2,edificio.larvasActuales());

        edificio.finDeturno();
        assertEquals(3,edificio.larvasActuales());

        edificio.finDeturno();
        assertEquals(3,edificio.larvasActuales());
    }
}