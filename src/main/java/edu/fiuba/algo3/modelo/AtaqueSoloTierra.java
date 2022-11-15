package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public class AtaqueSoloTierra extends Ataque{

    public AtaqueSoloTierra(int danioTierra) {
        super(danioTierra);
    }

    @Override
    public void aplicarDanioViento(HitPoints hp) {
        throw new NoPuedeAplicarDanioUnidadTipoAire();
    }
}
