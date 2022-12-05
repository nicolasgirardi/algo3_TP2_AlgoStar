package testAuxiliares;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Base;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBaseMapa {

    @Test
    public void SeCreaUnaBaseConFactor1YLasDimencionesDelMapaDeberianSer10x10YYDeberiaHaberEnTotalBases() {

        //Average
        Base base = new Base(1);
        Mapa mapa = base.getMapa();



        //Act
        boolean resultado = mapa.buscar(new Coordenada(0,0)).existeEdificio();
        boolean resultado3 = mapa.buscar(new Coordenada(2,0)).existeRecurso();
        boolean resultado4 = mapa.buscar(new Coordenada(0,2)).existeRecurso();
        boolean resultado5 = mapa.buscar(new Coordenada(2,2)).existeRecurso();

        boolean resultado2 = mapa.buscar(new Coordenada(9,9)).existeEdificio();
        boolean resultado6 = mapa.buscar(new Coordenada(7,9)).existeRecurso();
        boolean resultado7 = mapa.buscar(new Coordenada(9,7)).existeRecurso();
        boolean resultado8 = mapa.buscar(new Coordenada(7,7)).existeRecurso();

        //Assert
        assertEquals(true, resultado);
        assertEquals(true, resultado2);
        assertEquals(true, resultado3);
        assertEquals(true, resultado4);
        assertEquals(true, resultado5);
        assertEquals(true, resultado6);
        assertEquals(true, resultado7);
        assertEquals(true, resultado8);
    }
}
