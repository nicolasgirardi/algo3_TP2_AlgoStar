package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;

public class AmoSupremo extends Unidad {
    public AmoSupremo() {
        super(new HPZerg(200), new TipoAire(), new AtaqueTierraYViento(0,0), 5);
    }
    public AmoSupremo(HitPoints vida) {
        super(vida);
    }
    public void costoCreacion(RazaZerg raza) {
        raza.verficarConsumoRecurso(50,0);
    }


}
