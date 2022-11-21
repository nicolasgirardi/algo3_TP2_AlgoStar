package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.NoPuedeAplicarDanioUnidadTipoAire;
import edu.fiuba.algo3.modelo.Raza.*;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso30 {

    @Test
    public void SiSeTienenLaCapacidadMaximaOcupadaNoSePuedeCrearUnaNuevaUnidad(){
        Raza razaZerg = new RazaZerg();
        razaZerg.aumentarMineral(new GestionRecurso(7000));
        for (int i =0 ;i<40;i++) {
            razaZerg.agregarUnidad(new AmoSupremo());
        }
        for(int i =0;i<200;i++){
            razaZerg.agregarUnidad(new Zangano());
        }

        assertThrows( CantidadInsuficienteError.class, ()-> {
            razaZerg.agregarUnidad(new Zangano()) ;
        });
    }

}
