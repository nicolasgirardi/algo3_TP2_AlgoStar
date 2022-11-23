package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Unidad.TipoTierra;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Zealot extends Unidad {
    public Zealot(HitPoints hpZealot) {
        super(
                hpZealot,
                new TipoTierra(),
                new AtaqueSoloTierra(8),
                4,2,100,0
        );
    }

    public Zealot() {
        super(
                new HPProtoss(100,60),
                new TipoTierra(),
                new AtaqueSoloTierra(8),
                4,2,100,0
        );
    }

}
