package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.Edificio;

public class RazaProtoss extends Raza{

    @Override
    public void existenAunEdificios() {
        if( edificios.size() == 0){
            throw new FinDelJuegoGanaronLosZerg();
        }
    }
}
