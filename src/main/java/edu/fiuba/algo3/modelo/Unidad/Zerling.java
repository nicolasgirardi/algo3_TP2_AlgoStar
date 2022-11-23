package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Zerling extends Unidad {

    public Zerling(){
        super(
                new HPZerg(35),
                new TipoTierra(),
                new AtaqueSoloTierra(4),
                2,1,25,0
        );
    }

    public Zerling(HitPoints vida){
        super(
                vida,
                new TipoTierra(),
                new AtaqueSoloTierra(4),
                2,1,25,0
        )
        ;
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Zerling)) return false;
        Zerling zerling = (Zerling) object;

        return zerling.hp.equals(hp) ;
    }

}
