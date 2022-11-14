package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso14 {
    @Test
    public void testNoPuedenHaberConstruccionesProtossEnELMoho(){

        Mapa mapa = new Mapa();
        Celda celdaMoho = new Celda(5,5);

        Criadero unCriadero = new Criadero();
        //act
        celdaMoho.asignarMoho(unCriadero, celdaMoho);//primera vez que se mueve (5 posiciones)


        Celda celdaPilon = new Celda(4,4);

        Pilon unPilon = new Pilon();

        celdaPilon.asignarRangoPilon(unPilon, celdaPilon);

        Edificio unEdificio = new PuertoEstelar();

        //assert
        assertThrows( ConstruccionProtoEnMohoError.class, ()-> {
            celdaPilon.asignarEdificoProtos(unEdificio);
        });

    }
    @Test
    public void testElMohoNOPuedeInvadirConstrucciones(){}
}
