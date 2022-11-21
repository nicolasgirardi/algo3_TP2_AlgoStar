package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Juego.Color;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.NoPuedeAplicarDanioUnidadTipoAire;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso29 {

    @Test
    public void LaCapacidadNoAumentaAlTener200() {
        Raza razaZerg = new RazaZerg();
        razaZerg.aumentarMineral(new GestionRecurso(1050));
        for (int i =0 ;i<20;i++) {
            razaZerg.agregarUnidad(new AmoSupremo());
        }

        assertTrue(razaZerg.suministros().equals(new GestionRecurso(200)));
    }
    @Test
    public void LaCapacidadNoAumentaAlTener200() {
        Raza razaZerg = new RazaZerg();
        razaZerg.aumentarMineral(new GestionRecurso(1050));
        for (int i =0 ;i<21;i++) {
            razaZerg.agregarUnidad(new AmoSupremo());
        }

        assertTrue(razaZerg.suministros().equals(new GestionRecurso(200)));
    }
}
