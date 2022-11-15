package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

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


<<<<<<< HEAD
=======
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
>>>>>>> 84e2df0 (Revert "Actualizo")
}
