package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Hidralisco extends Unidad {

    public Hidralisco() {
        super(new HPZerg(35), new TipoTierra(), new AtaqueTierraYViento(10,10), 4,2);
    }

    public Hidralisco(HitPoints vida) {
        super(vida, new TipoTierra(), new AtaqueTierraYViento(10,10), 4,2);
    }


}