package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public interface TipoSuperficie {
    public void recibirAtaque(Ataque ataque, HitPoints hp);
}
