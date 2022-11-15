package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Unidad.TipoTierra;
import edu.fiuba.algo3.modelo.Unidad.Unidad;

public class Zealot extends Unidad {
    public Zealot(HitPoints hpZealot) {
        super(
                hpZealot,
                new TipoTierra(),
                new AtaqueSoloTierra(8)
        );
    }

    public Zealot() {
        super(
                new HPProtoss(100,60),
                new TipoTierra(),
                new AtaqueSoloTierra(8)
        );
    }

    @Override
    public void atacar(Unidad unidad) {
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
}
