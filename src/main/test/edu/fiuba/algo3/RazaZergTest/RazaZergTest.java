package edu.fiuba.algo3.RazaZergTest;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.tablero.Celda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RazaZergTest {

    @Test
    public void test01SeCreaLaRazaZergSeAgregan3Larvas(){

/*        RazaZerg unaRaza  = new RazaZerg();
        Larva larvaUno = new Larva();
        Larva larvaDos = new Larva();
        Larva larvaTres = new Larva();
        unaRaza.agregarIndividuo(larvaUno);
        unaRaza.agregarIndividuo(larvaDos);
        unaRaza.agregarIndividuo(larvaTres);
        assertEquals(3, unaRaza.getCantidadLarvas());*/
    }

    @Test
    public void test02SeCreaLaRazaZergSeAgregan3LarvasYSeEvolucionaUnLarvaDeberiamosTener2LarvasYUnZangano(){
        Celda posicionConstruir = new Celda(0, 0);
        RazaZerg unaRaza  = new RazaZerg();
        Criadero unCriadero = new Criadero(posicionConstruir);  // hay 3 larvas adentro.
        unaRaza.agregarNuevoEdificio(unCriadero);
        unaRaza.evolucionarUnZangano(unCriadero);

        assertEquals(2, unaRaza.getCantidadLarvas());
        assertEquals(1, unaRaza.getCantidadZangano());
    }


}
