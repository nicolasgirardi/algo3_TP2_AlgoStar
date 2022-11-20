package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Extractor;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasoDeUso15 {

    @Test
    public void RazaZergDejaDeConseguirGasDelVolcanCuandoSeQuedaSinUnidadesDeGas(){
        //Arrange
        Volcan volcan = new Volcan();
        Extractor extractor = new Extractor();

        // dejo el Extractor operrable en 6 turnos
        for(int i = 0; i <6; i++ ){
            extractor.ejecutarTurno();
        }

        for(int i = 0; i < 3; i++ ){
            extractor.agregarZangano(new Zangano(new HPZerg(25)));
        }

        int maximaCantidadGasExtraible = 5000;
        int cantidadDeTurnosParaSacarTodoElGas = 167;
        int cantidadGas = 0;
        int cantidadGasExceso = 0;

        //Act
        for(int i = 0; i <=cantidadDeTurnosParaSacarTodoElGas ; i++ ){
            cantidadGas += extractor.extraer(volcan);
        }

        // Intentamos extraer 5 veces mas el Volcan

        for(int i = 0; i < 5 ; i++){
            cantidadGasExceso += extractor.extraer(volcan);
        }


        //Assert
        assertEquals(maximaCantidadGasExtraible, cantidadGas);

        assertEquals(0,cantidadGasExceso );
    }


    @Test
    public void RazaZergDejaDeConseguirMineralCuandoDelNodoMineralCuandoSeQuedaSinUnidadesDeMineral(){
        //Arrange
        NodoMineral nodoMineral = new NodoMineral();
        Zangano zangano = new Zangano(new HPZerg(25));
        int maximaCantidadGasExtraible = 2000;
        int cantidadDeTurnosParaSacarTodoElGas = 200;
        int cantidadMineral = 0;
        int cantidadMineralExceso = 0;

        //Act

        for(int i = 0; i <=cantidadDeTurnosParaSacarTodoElGas ; i++ ){
            cantidadMineral += zangano.extraer(nodoMineral);
        }

        // Intentamos extraer 5 veces mas en el nodoMineral

        for(int i = 0; i < 5 ; i++){
            cantidadMineralExceso += zangano.extraer(nodoMineral);
        }


        //Assert
        assertEquals( maximaCantidadGasExtraible, cantidadMineral);
        assertEquals(0,cantidadMineralExceso );

    }

    @Test
    public void RazaProtoDejaDeConseguirGasDelVolcanCuandoSeQuedaSinUnidadesDeGas(){
        //Arrange
        Volcan volcan = new Volcan();
        Asimilador asimilador = new Asimilador();

        // dejo el Asimilador operrable en 6 turnos
        for(int i = 0; i <6; i++ ){
            asimilador.ejecutarTurno();
        }

        int maximaCantidadGasExtraible = 5000;
        int cantidadDeTurnosParaSacarTodoElGas = 250;
        int cantidadGas = 0;
        int cantidadGasExceso = 0;
        //Act
        for(int i = 0; i <=cantidadDeTurnosParaSacarTodoElGas; i++ ){
            cantidadGas += asimilador.extraer(volcan);
        }

        // Intentamos extraer 5 veces mas en el volcan

        for(int i = 0; i < 5 ; i++){
            cantidadGasExceso += asimilador.extraer(volcan);
        }

        //Assert
        assertEquals(maximaCantidadGasExtraible, cantidadGas);

        assertEquals(0, cantidadGasExceso);

    }

    @Test
    public void RazaProtossDejaDeConseguirMineralCuandoDelNodoMineralCuandoSeQuedaSinUnidadesDeMineral(){
        //Arrange
        NexoMineral nexoMineral = new NexoMineral( new NodoMineral() );

        // dejo el Asimilador operrable en 6 turnos
        for(int i = 0; i <4; i++ ){
            nexoMineral.ejecutarTurno();
        }

        int maximaCantidadGasExtraible = 2000;
        int cantidadDeTurnosParaSacarTodoElGas = 250;
        int cantidadGas = 0;
        int cantidadGasExceso = 0;

        //Act
        for(int i = 0; i < cantidadDeTurnosParaSacarTodoElGas; i++ ){
            cantidadGas += nexoMineral.extraer();
        }

        // Intentamos extraer 5 veces mas en el nexoMineral
        for(int i = 0; i < 5 ; i++){
            cantidadGasExceso += nexoMineral.extraer();
        }

        //Assert
        assertEquals(maximaCantidadGasExtraible, cantidadGas);

        assertEquals(0, cantidadGasExceso );

    }

}
