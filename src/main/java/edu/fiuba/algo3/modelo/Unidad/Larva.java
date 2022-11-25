package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Edificio.Zerg.ReservaDeReproduccion;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;

public class Larva {
    public Zangano evolucionar() {
        return new Zangano();
    }

    public Zerling evolucionar(ReservaDeReproduccion reserva) {
        return new Zerling(new HPZerg(35) );
    }

    public Hidralisco evolucionar(Guarida guarida) {
        return new Hidralisco(new HPZerg(10));
    }

    public Mutalisco evolucionar(Espiral espiral) {
        return new Mutalisco();
    }
}
