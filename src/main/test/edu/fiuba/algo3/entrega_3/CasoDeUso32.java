package edu.fiuba.algo3.entrega_3;
import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Juego.*;
import edu.fiuba.algo3.modelo.NoPuedeAplicarDanioUnidadTipoAire;
import edu.fiuba.algo3.modelo.Raza.*;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.*;
import edu.fiuba.algo3.modelo.Juego.Color;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import org.junit.jupiter.api.Test;

import static edu.fiuba.algo3.modelo.Juego.Color.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso32 {

    @Test
    public void AlDestruirElUltimoEdificioUnJUgadorPierde(){
        Raza zerg = new RazaZerg();
        Jugador unJugador = new Jugador("Pedrito",ROJO,zerg);
        Edificio criadero = new Criadero();

        zerg.agregarEdificio(criadero);



        assertThrows( FinDePartida.class, ()-> {
            zerg.destruirEdificio(criadero);
        });
    }
}
