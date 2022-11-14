package edu.fiuba.algo3.entrega_1;


import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Edificio.*;

import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.Tierra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso5 {
    @Test
    public void testNoSePuedeConstruirFueraDelMoho(){
        //Mapa mapa = new Mapa();

        Ubicacion ubicacion = new Ubicacion(new Coordenada(0,0));

        //act
        ubicacion.darTipo(new Tierra());

        //assert

        assertThrows( ConstruccionFueraDelMohoError.class, ()-> {
            ubicacion.ubicar(new Criadero());
        });

    }
    @Test
    public void testNoSePuedeConstruirFueraDelRangoDelPilon(){
        //Mapa mapa = new Mapa();

        Ubicacion ubicacionPilon = new Ubicacion(new Coordenada(5,5));
        Pilon unPilon = new Pilon();
        ubicacionPilon.ubicar(unPilon);
        //act

        Ubicacion ubicacionPuerto = new Ubicacion(new Coordenada(10,10));

        //assert
        assertThrows( ConstruccionFueraDelRangoPilonError.class, ()-> {
            ubicacionPuerto.ubicar(new Acceso(),unPilon);
        });

    }
}
