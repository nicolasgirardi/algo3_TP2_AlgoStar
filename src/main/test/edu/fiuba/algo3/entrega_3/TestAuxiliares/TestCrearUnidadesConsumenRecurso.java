package edu.fiuba.algo3.entrega_3.TestAuxiliares;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Zerg.ReservaDeReproduccion;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.Unidad.Zerling;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCrearUnidadesConsumenRecurso {
    GestionRecurso mineral;
    GestionRecurso gas;
    Raza raza;


    @BeforeEach
    void setup() {
        //Arrange
        mineral = new GestionRecurso(500);
        gas = new GestionRecurso(500);
        raza = new RazaZerg(mineral, gas);
        raza.aumentarCapacidad(100);
    }

    @Test
    public void ConstruirZanganoConsume25MineralesYQueda475MineralesY500DeGas() {

        Criadero criadero = new Criadero();
        raza.aumentarMineral(new GestionRecurso(200)); //agregamos recursos para el edificio
        raza.agregarEdificio(criadero); // quedan 500 minerales
        GestionRecurso mineralEsperado = new GestionRecurso(475);
        GestionRecurso gasEsperado = new GestionRecurso(500);


        //Act
        Zangano unidad = criadero.crearZangano();

        //Assert
        assertEquals(mineralEsperado, mineral);
        assertEquals(gasEsperado, gas);
    }

    @Test
    public void ConstruirZerlingConsume25MineralesYQueda475MineralesY500DeGas() {

        ReservaDeReproduccion edificio = new ReservaDeReproduccion();
        raza.aumentarMineral(new GestionRecurso(150)); //agregamos recursos para el edificio
        raza.agregarEdificio(edificio); // quedan 500 minerales
        GestionRecurso mineralEsperado = new GestionRecurso(475);
        GestionRecurso gasEsperado = new GestionRecurso(500);


        //Act
        Zerling unidad = edificio.crearZerling();

        //Assert
        assertEquals(mineralEsperado, mineral);
        assertEquals(gasEsperado, gas);
    }
}


