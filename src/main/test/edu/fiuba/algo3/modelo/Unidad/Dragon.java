package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;

public class Dragon extends Unidad {

    public Dragon() {
        super(new HPProtoss(100,80), new TipoTierra(), new AtaqueTierraYViento(20,20), 6, 3);
    }
}
