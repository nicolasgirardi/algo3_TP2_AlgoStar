package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class RazaZerg extends Raza{
    public RazaZerg(){ super();}
    public RazaZerg(GestionRecurso mineral, GestionRecurso gas){
        super(mineral, gas);
    }
}
