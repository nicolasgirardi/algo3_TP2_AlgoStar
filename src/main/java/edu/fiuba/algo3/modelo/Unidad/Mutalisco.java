package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueTierraYViento;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Mutalisco extends Unidad{

    private TipoEvolucionDeMutalisco tipoEvolucionDeMutalisco;
    public Mutalisco() {

        super(
                new HPZerg(120),
                new TipoAire(),
                new AtaqueTierraYViento(9,9),
                7,4,100,100);
        tipoEvolucionDeMutalisco = null;
    }

    public Mutalisco(HitPoints vida) {
            super(vida, 4);
            tipoEvolucionDeMutalisco = null;
    }

    public void evolucionarAGuardian(RazaZerg raza) {
        tipoEvolucionDeMutalisco = new Guardian();
        raza.agregarUnidad((Unidad) this.getTipoEvolucionDeMutalisco());
    }

    public void evolucionarDevorador(RazaZerg raza) {
        tipoEvolucionDeMutalisco = new Devorador();
        raza.agregarUnidad((Unidad) this.getTipoEvolucionDeMutalisco());
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Mutalisco)) return false;
        Mutalisco mutalisco = (Mutalisco) object;

        return mutalisco.hp.equals(hp)  ;
    }

    public TipoEvolucionDeMutalisco getTipoEvolucionDeMutalisco(){
        return tipoEvolucionDeMutalisco;
    }


}
