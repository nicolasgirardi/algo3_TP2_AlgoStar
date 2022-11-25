package edu.fiuba.algo3.entrega_1;


import edu.fiuba.algo3.modelo.*;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.Tierra;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void testNoSePuedeConstruirFueraDelRangoDelVariosPilones() {
        //Mapa mapa = new Mapa();

        Ubicacion ubicacionPilon1 = new Ubicacion(new Coordenada(5, 5));
        Pilon unPilon1 = new Pilon();
        ubicacionPilon1.ubicar(unPilon1);
        Ubicacion ubicacionPilon2 = new Ubicacion(new Coordenada(15, 15));
        Pilon unPilon2 = new Pilon();
        ubicacionPilon2.ubicar(unPilon2);
        ArrayList<Pilon> lista = new ArrayList<Pilon>();
        lista.add(unPilon1);
        lista.add(unPilon2);
        //act

        Ubicacion ubicacionPuerto = new Ubicacion(new Coordenada(10, 10));

        //assert
        assertThrows(ConstruccionFueraDelRangoPilonError.class, () -> {
            ubicacionPuerto.ubicar(new Acceso(), lista);
        });
    }
        @Test
        public void testSePuedeConstruirDentroDelRangoDelVariosPilones(){
            //Mapa mapa = new Mapa();

            Ubicacion ubicacionPilon1 = new Ubicacion(new Coordenada(5,5));
            Pilon unPilon1 = new Pilon();
            ubicacionPilon1.ubicar(unPilon1);
            Ubicacion ubicacionPilon2 = new Ubicacion(new Coordenada(6,6));
            Pilon unPilon2 = new Pilon();
            ubicacionPilon2.ubicar(unPilon2);
            ArrayList<Pilon> lista = new ArrayList<Pilon>();
            lista.add(unPilon1);
            lista.add(unPilon2);
            //act

            Ubicacion ubicacionPuerto = new Ubicacion(new Coordenada(5,6));

            //assert
            assertDoesNotThrow( ()-> {
                ubicacionPuerto.ubicar(new Acceso(), lista);
            });

    }

}
