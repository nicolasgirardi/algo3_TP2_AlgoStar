package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Unidad.TipoTierra;
import edu.fiuba.algo3.modelo.Unidad.Unidad;

public class Zealot extends Unidad {
    public Zealot(HitPoints hpZealot) {
        super(
                hpZealot,
                new TipoTierra(),
                new AtaqueSoloTierra(8)
        );
    }

    public Zealot() {
        super(
                new HPProtoss(100,60),
                new TipoTierra(),
                new AtaqueSoloTierra(8)
        );
    }

<<<<<<< HEAD
=======
    @Override
    public void atacar(Unidad unidad) {

    }
>>>>>>> 84e2df0 (Revert "Actualizo")

}
