package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Raza.RazaZerg;

public class Mutalisco implements Unidad{
    public void evolucionar(RazaZerg raza) {
        raza.verficarConsumoRecurso(50,100);
    }
}
