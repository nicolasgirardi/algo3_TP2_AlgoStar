package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;

public class Mutalisco extends Unidad{

    public Mutalisco(HitPoints vida) {
        super(vida);
    }

    public void evolucionar(RazaZerg raza) {
        raza.verficarConsumoRecurso(50,100);
    }

    @Override
    public void atacar(Unidad unidad) {

    }
}
