package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class RazaProtoss extends Raza{

    public RazaProtoss(){
        super();
        entidad = ID_RAZA.PROTOSS;
    }
    public RazaProtoss(GestionRecurso mineral, GestionRecurso gas){
        super(mineral, gas);
    }

    @Override
    public void existenAunEdificios() {
        if( edificios.size() == 0){
            throw new FinDelJuegoGanaronLosZerg();
        }
    }
}
