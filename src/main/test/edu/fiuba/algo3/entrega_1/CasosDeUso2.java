package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasosDeUso2 {

    @Test
    public void EdificoCriaderoCon4TurnosParaSerOperativoSeLeMandaAEvolucionarLarvaDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange

        Criadero criadero = new Criadero();
        //Act y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            criadero.evolucionarLarva();
        });

    }

    @Test
    public void EdificoCriaderoCon4TurnosParaSerOperativoPasan2TurnosYSeLeMandaAEvolucionarLarvaDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){

        //Arrange
        Criadero criadero = new Criadero();

        //Act
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();

        //assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            criadero.evolucionarLarva();
        });
    }

    @Test
    public void EdificoCriaderoCon4TurnosParaSerOperativoPasan4TurnosYSeLeMandaAEvolucionarLarvaNoDeberiaLanzarExcepcion(){
        //Arrange
        Criadero criadero = new Criadero();

        //Act
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();
        criadero.ejecutarTurno();

        //assert
       assertDoesNotThrow(  ()->{
            Zangano zangano = criadero.evolucionarLarva();
       });
    }

    @Test
    public void EdificoReservaDeReproduccionCon12TurnosParaSerOperativoSeLeMandaEvolucionarZerlingDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange

        ReservaDeReproduccion reserva = new ReservaDeReproduccion();
        Larva larva = new Larva();
        //Act y Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            reserva.evolucionarLarva(larva);
        });
    }

    @Test
    public void EdificoReservaDeReproduccionCon12TurnosParaSerOperativoPasan5TurnosSeLeMandaEvolucionarZerlingDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange

        ReservaDeReproduccion reserva = new ReservaDeReproduccion();
        Larva larva = new Larva();
        //Act
        for(int i = 0 ; i < 5 ; i++){
            reserva.ejecutarTurno();
        }

        //Assert
        assertThrows( EdificioNoOperativoError.class, ()-> {
            reserva.evolucionarLarva(larva);
        });
    }


    @Test
    public void EdificoReservaDeReproduccionCon12TurnosParaSerOperativoPasan12TurnosSeLeMandaEvolucionarZerlingNoDeberiaLanzarExcepcionPorqueAunNoEstaOperativo(){
        //Arrange

        ReservaDeReproduccion reserva = new ReservaDeReproduccion();
        Larva larva = new Larva();
        //Act
        for(int i = 0 ; i < 12 ; i++){
            reserva.ejecutarTurno();
        }

        //Assert
        assertDoesNotThrow( ()-> {
            reserva.evolucionarLarva(larva);
        });
    }



}
