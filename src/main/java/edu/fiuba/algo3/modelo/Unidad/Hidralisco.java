package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public class Hidralisco extends Unidad {

    public Hidralisco(HitPoints vida) {
        super(vida, new TipoTierra(), new AtaqueTierraYViento(10,10));
    }

    @Override
    public void atacar(Unidad unidad) {

    }

}
