package edu.fiuba.algo3.entrega_3;


import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso26 {
    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarZanganoNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Zangano zangano = new Zangano();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(zangano);
        });
    }
    @Test
    public void testSeIntentaAgregarUnZanganoSinCapacidadDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Zangano zangano = new Zangano();

        //Act y Assert
        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(zangano);
        });
    }

    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarZerlingNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Zerling zerling = new Zerling();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(zerling);
        });
    }
    @Test
    public void testSeIntentaAgregarUnZerlingSinCapacidadDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Zerling zerling = new Zerling();

        //Act y Assert
        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(zerling);
        });
    }

    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarZealotNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Zealot zealot = new Zealot();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(zealot);
        });
    }
    @Test
    public void testSeIntentaAgregarUnZealotSinCapacidadDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Zealot zealot = new Zealot();

        //Act y Assert
        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(zealot);
        });
    }

    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarScoutNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Scout scout = new Scout();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(scout);
        });
    }
    @Test
    public void testSeIntentaAgregarUnScoutSinCapacidadDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Scout scout = new Scout();

        //Act y Assert
        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(scout);
        });
    }
    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarMutaliscoNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Mutalisco mutalisco = new Mutalisco();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(mutalisco);
        });
    }
    @Test
    public void testSeIntentaAgregarUnMutaliscoSinCapacidadDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Mutalisco mutalisco = new Mutalisco();

        //Act y Assert
        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(mutalisco);
        });
    }
    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarHidraliscoNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Hidralisco hidralisco = new Hidralisco();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(hidralisco);
        });
    }
    @Test
    public void testSeIntentaAgregarUnHidraliscoSinCapacidadDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Hidralisco hidralisco = new Hidralisco();

        //Act y Assert
        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(hidralisco);
        });
    }
    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarGuardianNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Guardian guardian = new Guardian();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(guardian);
        });
    }
    @Test
    public void testSeAgregarUnGuardianNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Guardian guardian = new Guardian();

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(guardian);
        });
    }
    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarDragonNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Dragon dragon = new Dragon();
        raza.agregarEdificio(criadero);

        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(dragon);
        });
    }
    @Test
    public void testSeIntentaAgregarUnDragonSinCapacidadDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Dragon dragon = new Dragon();

        //Act y Assert
        assertThrows( PoblacionExedidaError.class, ()-> {
            raza.agregarUnidad(dragon);
        });
    }
    @Test
    public void testSeIniciaElJuegoConUnCriaderoYAlAgregarDevoradorNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Criadero criadero = new Criadero(0);
        Devorador devorador = new Devorador();
        raza.agregarEdificio(criadero);
        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(devorador);
        });
    }

    @Test
    public void testSeAgregarUnDevoradorNoDeberiaTirarError(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        Devorador devorador = new Devorador();
        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(devorador);
        });
    }
    @Test
    public void testSeAgregaUnAmoSupremoDeberiaSumarMas5Poblacion(){
        //Arrange
        RazaZerg raza = new RazaZerg();
        AmoSupremo amoSupremo = new AmoSupremo();
        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarUnidad(amoSupremo);
        });
    }
    @Test
    public void testSeAgregaUnPilonDeberiaSumarMas5Poblacion(){
        //Arrange
        RazaProtoss raza = new RazaProtoss();
        Pilon pilon = new Pilon();
        //Act y Assert
        assertDoesNotThrow(() -> {
            raza.agregarEdificio(pilon);
        });
    }

}




