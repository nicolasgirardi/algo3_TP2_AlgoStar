package edu.fiuba.algo3.entrega_3;


import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso26 {
    @Test
    public void testMutaliscoNoPuedeEvolucionarAGuardianPorqueoNoHayRecursosSuficientes() {
        RazaZerg raza = new RazaZerg(); // se crea con 200 mineral y 0 gas.
        Mutalisco mutalisco = new Mutalisco(new HPZerg(120));
        assertThrows( RecursosInsuficientesError.class, ()-> {
            mutalisco.evolucionar(raza) ;
        });
    }
    @Test
    public void testMutaliscoNoPuedeEvolucionarADevoradorPorqueoNoHayRecursosSuficientes() {
        RazaZerg raza = new RazaZerg(); // se crea con 200 mineral y 0 gas.
        Mutalisco mutalisco = new Mutalisco(new HPZerg(120));
        assertThrows( RecursosInsuficientesError.class, ()-> {
            mutalisco.evolucionarDevorador(raza) ;
        });
    }
    @Test
    public void testNoPuedoCrearAAmoSupremoPorqueoNoHayRecursosSuficientes() {
        RazaZerg raza = new RazaZerg(); // se crea con 200 mineral y 0 gas.
        AmoSupremo amoSupremo = new AmoSupremo(new HPZerg(200));
        assertDoesNotThrow(() -> {
            amoSupremo.costoCreacion(raza);
        });
    }








}




