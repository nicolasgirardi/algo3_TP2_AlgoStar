package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;

public class Hidralisco extends Unidad {

    public Hidralisco() {
        super(new HPZerg(35), new TipoTierra(), new AtaqueTierraYViento(10,10));
    }

    public Hidralisco(HitPoints vida) {
        super(vida, new TipoTierra(), new AtaqueTierraYViento(10,10));
    }


    @Override
    public void atacar(Unidad unidad) {

        unidad.recibirDañoTierra(10);
        unidad.recibirDañoAire(10);
        /*
        Cada unidad tiene un TipoUnidad. Hidralisco es de tierra pero realiza ataques
        tanto a aire como tierra.
        unidad.recibirDañoTierra(10)
        unidad.RecibirDañoAire(10)

        En unidad, estos metodos delegan a TipoUnidad el recibirDañoTierra y si la unidad es de tierra
        se aplica el daño de recibirDañoTierra y recibirDañoAire no lo aplica nada.

        Osea tengo clases tipoAgua, tipoTierra.
         */
    }

}
