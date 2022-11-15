package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public abstract class  Unidad {
    protected HitPoints hp;
    public Unidad(HitPoints vida){
        hp = vida;
    }

    public abstract void  atacar(Unidad unidad);

    protected void recibirDanio(int danio) {
        hp.recibirDaño(danio);
    }


    protected void recibirDanio(Hidralisco hidralisco, int danio, int danio2) {

    }
    
}
