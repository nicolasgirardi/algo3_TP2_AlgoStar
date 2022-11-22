package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Unidad.TipoAire;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Guardian extends Unidad {


    public Guardian(){
        super(new HPZerg(100), new TipoAire(), new AtaqueSoloTierra(25), 4,0);
    }

    public Guardian(HitPoints hp){
        super(hp, new TipoAire(), new AtaqueSoloTierra(25), 4,0);
    }
    @Override
    public void fueAgregado(Raza raza) {
        return;
    }



}
