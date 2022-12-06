package edu.fiuba.algo3.modelo.Raza;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.EstadoZangano.EstadoZangano;
public class RazaZerg extends Raza{

    public RazaZerg(){
        super();
        entidad = ID_RAZA.ZERG;
    }
    public RazaZerg(GestionRecurso mineral, GestionRecurso gas){
        super(mineral, gas);
    }
    public void agregarEsteEdificio(EstadoZangano estadoZangano) {
        estadoZangano.agregarseAEstaRaza(this);
    }

    @Override
    public void existenAunEdificios() {
        if(edificios.size() == 0){
            throw new FinDelJuegoGanaronLosProtoss();
        }
    }
}
