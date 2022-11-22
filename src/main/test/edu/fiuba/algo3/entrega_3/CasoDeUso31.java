package edu.fiuba.algo3.entrega_3;
import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.NoPuedeAplicarDanioUnidadTipoAire;
import edu.fiuba.algo3.modelo.Raza.*;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class CasoDeUso31 {

    @Test
    public void destruirUnCriaderoDisminuyeLaCapacidad(){
        Raza razaZerg = new RazaZerg();
        razaZerg.aumentarMineral(new GestionRecurso(10000));
        for (int i =0 ;i<4;i++) {
            razaZerg.agregarEdificio(new Criadero());
        }
        Edificio criaderoTemporal = new Criadero();
        razaZerg.agregarEdificio(criaderoTemporal);

        razaZerg.destruirEdificio(criaderoTemporal);
        assertEquals(20,razaZerg.capacidadReal());
    }
    @Test
    public void destruirUnPilonoDisminuyeLaCapacidad(){
        Raza razaProtos = new RazaZerg();
        razaProtos.aumentarMineral(new GestionRecurso(10000));
        for (int i =0 ;i<4;i++) {
            razaProtos.agregarEdificio(new Pilon());
        }
        Edificio pilonTemporal = new Pilon();
        razaProtos.agregarEdificio(pilonTemporal);

        razaProtos.destruirEdificio(pilonTemporal);
        assertEquals(20,razaProtos.capacidadReal());
    }

    @Test
    public void MatarUnAmoSupremoDisminuyeLaCapacidad(){
        Raza razaZerg = new RazaZerg();
        razaZerg.aumentarMineral(new GestionRecurso(10000));
        for (int i =0 ;i<4;i++) {
            razaZerg.agregarUnidad(new AmoSupremo());
        }
        Unidad amoTemporal = new AmoSupremo();
        razaZerg.agregarUnidad(amoTemporal);

        razaZerg.matarUnidad(amoTemporal);
        assertEquals(20,razaZerg.capacidadReal());
    }
}


