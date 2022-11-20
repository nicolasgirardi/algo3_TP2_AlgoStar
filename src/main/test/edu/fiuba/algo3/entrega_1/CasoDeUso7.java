package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Edificio.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso7 {
    @Test
    public void testUnZanganoTrabajandoEnUnMineralEnUnTurnoDeberiaExtraer10Minerales(){
        //Arrange
        Zangano zangano = new Zangano(new HPZerg(25));
        NodoMineral nodoMineral = new NodoMineral();

        //Act
        int cantidadMineral = zangano.extraer(nodoMineral);

        //Assert
        assertEquals(10,cantidadMineral);
    }

    @Test
    public void testNexoMineralCuandoEstaOperativoDeberiaExtraer10MineralesDeUnNodoMineral(){
        //Arrange
        NodoMineral nodoMineral = new NodoMineral();
        NexoMineral nexoMineral = new NexoMineral(nodoMineral);

        //Act
        // dejo operativo el nexoMineral
        nexoMineral.ejecutarTurno();
        nexoMineral.ejecutarTurno();
        nexoMineral.ejecutarTurno();
        nexoMineral.ejecutarTurno();
        int cantidadMineral = nexoMineral.extraer();

        //Assert
        assertEquals(20,cantidadMineral);
    }

    @Test
    public void testNexoMineralNoDeberiaExtraerSiNoEstaOperativo(){
        //Arrange
        NodoMineral nodoMineral = new NodoMineral();
        NexoMineral nexoMineral = new NexoMineral(nodoMineral);

        //Assert
        assertThrows(EdificioNoOperativoError.class, ()->{
            nexoMineral.extraer();
        });
    }
}
