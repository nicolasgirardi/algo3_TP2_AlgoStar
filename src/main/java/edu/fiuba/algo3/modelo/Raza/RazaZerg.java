package edu.fiuba.algo3.modelo.Raza;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.tablero.*;

public class RazaZerg extends Raza{

    public void construirBase(Ubicacion unaUbicacion,Mapa mapa){
        Criadero primerCriadero = new Criadero();
        edificios.add(primerCriadero);
        unaUbicacion.infectar();
        unaUbicacion.ubicar(primerCriadero);
        primerCriadero.ubicar(unaUbicacion,mapa);
    }



}
