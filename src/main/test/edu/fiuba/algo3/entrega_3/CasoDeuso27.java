package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.Devorador;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeuso27 {
    @Test
    public void testMutaliscoSiPuedeEvolucionarADevoradorPorqueoHayRecursosSuficientes() {
        RazaZerg raza = new RazaZerg(); // se crea con 200 mineral y 0 gas.
        raza.aumentarRecursos(400, 420);
        Mutalisco mutalisco = new Mutalisco(new HPZerg(120));

        //Devorador devorador = mutalisco.evolucionarDevorador(raza);
        assertDoesNotThrow(() -> {
            mutalisco.evolucionarDevorador(raza);
        });
    }
    @Test
    public void testMutaliscoNoPuedeEvolucionarADevoradorPorqueoNoHayRecursosSuficientes() {
        RazaZerg raza = new RazaZerg(); // se crea con 200 mineral y 0 gas.
        Mutalisco mutalisco = new Mutalisco(new HPZerg(120));

        assertThrows( RecursosInsuficientesError.class, ()-> {
            mutalisco.evolucionarDevorador(raza) ; //busca un mutalisco y lo hace evolucionar .
        });
    }

}
