package edu.fiuba.algo3.entrega_2;
import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Juego.Juego;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.HitPoints.*;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CasoDeUso24 {

    @Test
    public void LasBasesDe2JugadoresSeInicianEnExtremos() {
        Mapa mapa =new Mapa(20,20);
        Juego elJuego = new Juego(mapa,new Coordenada(0,0));

        int distanciaEsperada = mapa.distanciaMaxima();

        assertEquals(distanciaEsperada, elJuego.distanciaEntreBases());
    }
    @Test
    public void BasesEnPuntosNoExtremosOpuestosTiranError(){
        Mapa mapa =new Mapa(20,20);

        assertThrows(CoordenadaNoEsExtremoDelMapa.class, () -> {
            new Juego(mapa,new Coordenada(1,1));
        });
    }
}
