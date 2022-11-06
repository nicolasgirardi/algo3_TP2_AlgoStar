package edu.fiuba.algo3.RazaZergTest;

import edu.fiuba.algo3.modelo.Larva;
import edu.fiuba.algo3.modelo.RazaZerg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RazaZergTest {

    @Test
    public void test01SeCreaLaRazaZergSeAgregan3Larvas(){
        RazaZerg unaRaza  = new RazaZerg();
        Larva unaLarva = new Larva();
        unaRaza.agregarIndividuo(unaLarva);
        unaRaza.agregarIndividuo(unaLarva);
        unaRaza.agregarIndividuo(unaLarva);
        assertEquals(3, unaRaza.getCantidadLarvas());

    }
}
