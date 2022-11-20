package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public class Devorador extends Unidad {


    public Devorador(){
        super(new HPZerg(200), new TipoAire(), new AtaqueTierraYViento(0,25), 4, 5);
    }

    public Devorador(HitPoints hp){
        super(hp, new TipoAire(), new AtaqueTierraYViento(0,25), 4, 5);
    }

    /*public Zangano evolucionar() {
        return new Zangano();
    }*/

}