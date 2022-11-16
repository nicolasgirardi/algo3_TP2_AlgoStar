package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Celda;
import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.tablero.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso9 {

    @Test
    public void unEdificioProtossEnRangoDe2PilonesSigueEnergizadoSiSeDestruyeUno(){
        //para probar esto se van a crear 2 pilones, ponemos un edificio cerca de estos, destruimos uno
        //y vemos que sigue activo
        ArrayList<Pilon> lista = new ArrayList<Pilon>();
        Pilon pilon1 = new Pilon(); //crea un primer pilon
        lista.add(pilon1);
        Pilon pilon2 = new Pilon(); //crea un segundo pilon
        lista.add(pilon2);
        Acceso acceso = new Acceso(); //crea un acceso
        Ubicacion ubicacion1 = new Ubicacion(new Coordenada(2,2));
        Ubicacion ubicacion2 = new Ubicacion(new Coordenada( 4,4 ));
        Ubicacion ubicacion3 = new Ubicacion(new Coordenada(3,3));
        ubicacion1.ubicar(pilon1);
        ubicacion2.ubicar(pilon2);
        ubicacion3.ubicar(acceso);


        for(int i = 0; i < 8 ; i++){
            acceso.ejecutarTurno();
        }

        ubicacion2.desalojar();
        lista.remove(pilon2);


        assertDoesNotThrow(  ()-> {
            acceso.energizado(lista);
        });

    }
    @Test
    public void unEdificioProtossEnRangoDe1PilonNOEstaEnergizadoSiSeDestruyeElPilon(){
        //para probar esto se van a crear 2 pilones, ponemos un edificio cerca de estos, destruimos uno
        //y vemos que sigue activo
        ArrayList<Pilon> lista = new ArrayList<Pilon>();
        Pilon pilon1 = new Pilon(); //crea un primer pilon
        lista.add(pilon1);
        Pilon pilon2 = new Pilon(); //crea un segundo pilon
        lista.add(pilon2);
        Acceso acceso = new Acceso(); //crea un acceso
        Ubicacion ubicacion1 = new Ubicacion(new Coordenada(2,2));
        Ubicacion ubicacion2 = new Ubicacion(new Coordenada( 3,3 ));
        Ubicacion ubicacion3 = new Ubicacion(new Coordenada(4,4));
        ubicacion1.ubicar(pilon1);
        ubicacion2.ubicar(pilon2);
        ubicacion3.ubicar(acceso);


        for(int i = 0; i < 8 ; i++){
            acceso.ejecutarTurno();
        }

        ubicacion2.desalojar();
        lista.remove(pilon2);


        assertThrows(ConstruccionFueraDelRangoPilonError.class, () -> {
            acceso.energizado(lista);
        });

    }
}
