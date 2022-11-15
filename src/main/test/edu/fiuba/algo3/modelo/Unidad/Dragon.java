package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Atacante;
import edu.fiuba.algo3.modelo.Ataque;
import edu.fiuba.algo3.modelo.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public class Dragon extends Unidad {

    public Dragon() {
        super(new HPProtoss(100,80), new TipoTierra(), new AtaqueTierraYViento(20,20));
    }
}
