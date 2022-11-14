package edu.fiuba.algo3.entrega_1;


import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Edificio.*;

import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso5 {
    @Test
    public void testNoGuaridaSePuedeConstruirFueraDelMoho(){
        //Mapa mapa = new Mapa();

        Celda celdaCriadero = new Celda(0,0);
        //act
        celdaCriadero.asignarMoho(new Criadero());

        Celda celdaEdificio = new Celda(8,8);

        Edificio unEdificio = new Guarida();
        //assert

        assertThrows( ConstruccionFueraDelMohoError.class, ()-> {
            celdaEdificio.asignarEdificoZerg(unEdificio);
        });

    }
    @Test
    public void testReservaDeReproducionNoSePuedeConstruirFueraDelMoho(){
        //Mapa mapa = new Mapa();

        Celda celdaCriadero = new Celda(0,0);
        //act
        celdaCriadero.asignarMoho(new Criadero());

        Celda celdaEdificio = new Celda(8,8);

        Edificio unEdificio = new ReservaDeReproduccion();
        //assert

        assertThrows( ConstruccionFueraDelMohoError.class, ()-> {
            celdaEdificio.asignarEdificoZerg(unEdificio);
        });

    }

    @Test
    public void testExtractorNoSePuedeConstruirFueraDelMoho(){
        //Mapa mapa = new Mapa();

        Celda celdaCriadero = new Celda(0,0);
        //act
        celdaCriadero.asignarMoho(new Criadero());

        Celda celdaEdificio = new Celda(8,8);

        Edificio unEdificio = new Extractor();
        //assert

        assertThrows( ConstruccionFueraDelMohoError.class, ()-> {
            celdaEdificio.asignarEdificoZerg(unEdificio);
        });
    }

    @Test
    public void testEspiralNoSePuedeConstruirFueraDelMoho(){
        //Mapa mapa = new Mapa();

        Celda celdaCriadero = new Celda(0,0);
        //act
        celdaCriadero.asignarMoho(new Criadero());

        Celda celdaEdificio = new Celda(8,8);

        Edificio unEdificio = new Espiral();
        //assert

        assertThrows( ConstruccionFueraDelMohoError.class, ()-> {
            celdaEdificio.asignarEdificoZerg(unEdificio);
        });
    }
    @Test
    public void testPuertoEstelarNoSePuedeConstruirFueraDelRangoDelPilon(){
        //Mapa mapa = new Mapa();

        Celda celdaPilon = new Celda(0,0);

        celdaPilon.asignarRangoPilon(new Pilon());
        //act

        Celda celdaEdificio = new Celda(5,5);
        Edificio unEdificio = new PuertoEstelar();

        //assert
        assertThrows( ConstruccionFueraDelRangoPilonError.class, ()-> {
            celdaEdificio.asignarEdificoProtos(unEdificio);
        });

    }
    public void testNexoMineralNoSePuedeConstruirFueraDelNexoMineral(){
        //Mapa mapa = new Mapa();

        Celda celdaPilon = new Celda(0,0);

        celdaPilon.asignarRangoPilon(new Pilon());
        //act

        Celda celdaEdificio = new Celda(5,5);
        Edificio unEdificio = new NexoMineral(new NodoMineral());

        //assert
        assertThrows( ConstruccionFueraDelRangoPilonError.class, ()-> {
            celdaEdificio.asignarEdificoProtos(unEdificio);
        });

    }

    public void testAsimiladorNoSePuedeConstruirFueraDelNexoMineral(){
        //Mapa mapa = new Mapa();

        Celda celdaPilon = new Celda(0,0);

        celdaPilon.asignarRangoPilon(new Pilon());
        //act

        Celda celdaEdificio = new Celda(5,5);
        Edificio unEdificio = new Asimilador();

        //assert
        assertThrows( ConstruccionFueraDelRangoPilonError.class, ()-> {
            celdaEdificio.asignarEdificoProtos(unEdificio);
        });

    }
    public void testAccesoNoSePuedeConstruirFueraDelNexoMineral(){
        //Mapa mapa = new Mapa();

        Celda celdaPilon = new Celda(0,0);

        celdaPilon.asignarRangoPilon(new Pilon());
        //act

        Celda celdaEdificio = new Celda(5,5);
        Edificio unEdificio = new Acceso();

        //assert
        assertThrows( ConstruccionFueraDelRangoPilonError.class, ()-> {
            celdaEdificio.asignarEdificoProtos(unEdificio);
        });

    }


}
