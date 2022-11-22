package edu.fiuba.algo3.entrega_3;


import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso26 {
    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarZanganoNoDeberiaTirarError(){
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Zangano zangano = new Zangano();
        raza.agregarEdificio(criadero);

        assertDoesNotThrow(() -> {
            raza.agregarUnidad(zangano);
        });
    }
    @Test
    public void testSeIntentaAgregarUnZanganoSinCapacidadDeberiaTirarError(){
        RazaZerg raza = new RazaZerg();
        Zangano zangano = new Zangano();

        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(zangano);
        });
    }



}




