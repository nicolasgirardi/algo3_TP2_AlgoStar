package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Unidad.TipoAire;
import edu.fiuba.algo3.modelo.Unidad.Unidad;

public class Scout extends Unidad {

    public Scout(HitPoints hp){
        super(hp, new TipoAire(), new AtaqueTierraYViento(14,8));

    }
}
