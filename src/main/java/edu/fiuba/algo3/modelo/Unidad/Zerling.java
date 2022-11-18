package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public class Zerling extends Unidad {

    public Zerling(){
        super(
                new HPZerg(35),
                new TipoTierra(),
                new AtaqueSoloTierra(4), 2
        ); // no puede existir un zerling sin rango dejarlo consistente.
    }

    public Zerling(HitPoints vida){
        super(
                vida,
                new TipoTierra(),
                new AtaqueSoloTierra(4),2
        );
    }

}
