package edu.fiuba.algo3.entrega_0;

import edu.fiuba.algo3.modelo.Larva;
import edu.fiuba.algo3.modelo.RazaZerg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class entrega0Test {
    @Test
    public void CriaderoSeIniciaCon3larvasSeConsumeUnaParaEngendrarUnzánganoLeDeberiaQuedarDos() {

        RazaZerg zergs = new RazaZerg();
        Criadero unCriadero = new Criadero();
        Larva larvaUno = new Larva();
        Larva larvaDos = new Larva();
        Larva larvaTres = new Larva();
        int resultadoEsperado = 2;
        zergs.agregarIndividuo(larvaUno);
        zergs.agregarIndividuo(larvaDos);
        zergs.agregarIndividuo(larvaTres);

        //Act
        larvaUno.evolucionar(new Zangano()); // posiblemente peude evolucionar a otra unidad

        //Assert
        assertEquals(resultadoEsperado, zergs.getCantidadLarvas() );

    }

}
