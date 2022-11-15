package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Unidad.TipoAire;
import edu.fiuba.algo3.modelo.Unidad.TipoTierra;
import edu.fiuba.algo3.modelo.Unidad.Unidad;

public class Guardian extends Unidad {


    public Guardian(){
        super(new HPZerg(100), new TipoTierra(), new AtaqueSoloTierra(25));
    }

    public Guardian(HitPoints hp){
        super(hp, new TipoAire(), new AtaqueSoloTierra(25));
    }

    public void atacarUnidad(Mutalisco mutalisco) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }

    public void atacarUnidad(Guardian guardianDos) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }

    public void atacarUnidad(Scout scout) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }
}
