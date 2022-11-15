package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;

public class Zangano extends Unidad {

    public Zangano(){
        super(
                new HPZerg(25),
                new TipoTierra(),
                new AtaqueSoloTierra(0) {
        });
    }

    public Zangano(HitPoints vida){
        super(vida);
    }

    public int extraer(Recurso recurso){
        return recurso.extraer(10);
    }

    public int extraerMineral(NodoMineral nodoMineral){
        return  nodoMineral.extraerConZangano(10, this);
    }

}
