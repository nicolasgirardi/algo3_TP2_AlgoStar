package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Unidad.TipoAire;
import edu.fiuba.algo3.modelo.Unidad.Unidad;

public class Scout extends Unidad {


    public Scout(){
        super(new HPProtoss(150,100), new TipoAire(), new AtaqueTierraYViento(8,14), 9, 4);

    }

    public Scout(HitPoints hp){
        super(hp, new TipoAire(), new AtaqueTierraYViento(8,14), 9, 4);

    }
}
