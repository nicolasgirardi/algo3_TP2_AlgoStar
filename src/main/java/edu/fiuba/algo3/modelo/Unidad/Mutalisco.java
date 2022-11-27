package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Mutalisco extends Unidad{

    public Mutalisco() {

        super(
                new HPZerg(120),
                new TipoAire(),
                new AtaqueTierraYViento(9,9),
                7,4,100,100);
    }

    public Mutalisco(HitPoints vida) {
            super(vida, 4);
    }

    public void evolucionar(RazaZerg raza) {
        raza.verficarConsumoRecurso(50,100);
    }
    public void evolucionarDevorador(RazaZerg raza) {
        raza.verficarConsumoRecurso(150,50);

    }


    @Override
    public boolean equals(Object object){
        if (!(object instanceof Mutalisco)) return false;
        Mutalisco mutalisco = (Mutalisco) object;

        return mutalisco.hp.equals(hp)  ;
    }




}
