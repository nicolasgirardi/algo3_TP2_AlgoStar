package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.Guardian;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.NoPuedeAtacarUnidadDeAireError;
import edu.fiuba.algo3.modelo.Scout;

public class Zerling extends Unidad {

    public Zerling(){
        super(
                new HPZerg(35),
                new TipoTierra(),
                new AtaqueSoloTierra(4)
        );
    }

    public Zerling(HitPoints vida){
        super(
                vida,
                new TipoTierra(),
                new AtaqueSoloTierra(4)
        );
    }


    public void atacarUnidad(Mutalisco mutalisco) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }

    public void atacarUnidad(Guardian guardian) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }

    public void atacarUnidad(Scout scout) {
        throw new NoPuedeAtacarUnidadDeAireError();
    }


    @Override
    public void atacar(Unidad unidad) {
        unidad.recibirDanio(4);
    }
}
