package testMutacionDeZanganoAEdificios;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Extractor;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class mutacionDeUnZanganoAUnEdificio {

    @Test
    public void testZanganoMutaEnUnCriaderoElZanganoQueCreaDeSerEquivalenteAOtroZanganoCreado(){
        //act
        RazaZerg raza = new RazaZerg();
        Zangano unZangano = new Zangano();

        //arrange
        unZangano.mutarCriadero(raza);
        Criadero criaderoNormal = new Criadero(0);
        Zangano otroZangano =  unZangano.evolucionarLarva();
        Zangano tercerZangano = criaderoNormal.evolucionarLarva();

        //assert
        assertTrue(otroZangano.equals(tercerZangano));
    }

    @Test
    public void testZanganoMutaEnUnEspiralLosMutaliscoQueSeCreanDeberianSerIguales(){
        //act
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(100) );
        raza.aumentarGas(new GestionRecurso(100) );
        Zangano unZangano = new Zangano();
        Espiral espiralCreado = new Espiral();

        //arrange
        unZangano.mutarEspiral(raza);

        for(int i = 0; i < 10 ; i++){                   //dejamos operativos los edificios.
            espiralCreado.ejecutarTurno();
            unZangano.ejecutarTurno();
        }

        Mutalisco mutaliscoUno = espiralCreado.crearMutalisco();
        Mutalisco mutaliscoDos = unZangano.crearMutalisco();

        //asert
        assertTrue(mutaliscoUno.equals(mutaliscoDos));
    }

    @Test
    public void testZanganoMutaAUnExtractorDeberiaPoderExtraerMinerales(){
        //act
        RazaZerg raza = new RazaZerg();
        raza.aumentarMineral(new GestionRecurso(100) );
        raza.aumentarGas(new GestionRecurso(100) );
        Zangano unZangano = new Zangano();
        Volcan volcan = new Volcan();
        GestionRecurso resultadoEsperado = new GestionRecurso(10);

        //arrange
        unZangano.mutarExtractor(raza);
        for(int i = 0; i < 6; i++ ){            // dejo el extractor operable en 6 turnos
            unZangano.ejecutarTurno();
        }
        unZangano.agregarZangano(new Zangano(new HPZerg(25)));
        GestionRecurso cantidadGas = unZangano.extraer(volcan);

        //Assert
        assertEquals(resultadoEsperado, cantidadGas);
    }

    @Test
    public void testZangano

}
