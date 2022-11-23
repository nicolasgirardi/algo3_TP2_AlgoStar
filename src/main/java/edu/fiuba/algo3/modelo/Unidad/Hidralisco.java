package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Hidralisco extends Unidad {

    public Hidralisco() {
        super(
                new HPZerg(35),
                new TipoTierra(),
                new AtaqueTierraYViento(10,10),
                4,2,75,25);

    }

    public Hidralisco(HitPoints vida) {
        super(vida, new TipoTierra(), new AtaqueTierraYViento(10,10), 4,2,75,25);
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Hidralisco)) return false;
        Hidralisco hidralisco = (Hidralisco) object;

        return hidralisco.hp.equals(hp);
    }


}