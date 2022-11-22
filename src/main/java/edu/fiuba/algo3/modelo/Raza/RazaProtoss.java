package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.tablero.*;

public class RazaProtoss extends Raza{

    public void construirBase(Ubicacion unaUbicacion,Mapa mapa){
        Pilon primerPilon = new Pilon();
        edificios.add(primerPilon);
        unaUbicacion.ubicar(primerPilon);
    }

}
