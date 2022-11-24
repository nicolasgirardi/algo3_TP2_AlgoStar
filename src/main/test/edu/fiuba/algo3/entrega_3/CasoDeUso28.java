package edu.fiuba.algo3.entrega_3;

import edu.fiuba.algo3.modelo.Ataque.ZealotNoPuedeSerAtacadaError;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Extractor;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.AmoSupremo;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.Unidad.Zealot;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso28 {
    @Test
    public void testUnZealotInvisibleNoDeberiaPoderSerAtacado(){
        //Arrange
        Zealot zealot = new Zealot();
        Zangano zangano = new Zangano();

        //Dejo al zealot y al zealot operativos
        for(int i = 0; i < 4; i++){
            zealot.ejecutarTurno();
        }
        zangano.ejecutarTurno();

        //Hago que el zealot se vuelva invisible
        Zangano zangano1 = new Zangano();
        for (int i = 0 ; i < 4; i++){
            zealot.atacar(zangano1);    //se muere al cuarto ataque
        }

        Zangano zangano2 = new Zangano();
        for (int i = 0 ; i < 4; i++){
            zealot.atacar(zangano2);
        }

        Zangano zangano3 = new Zangano();
        for (int i = 0 ; i < 4; i++){
            zealot.atacar(zangano3);
        }   //PROBAR LO MISMO CON EDIFICIOS

        //Assert y Act
        assertThrows( ZealotNoPuedeSerAtacadaError.class, ()-> {
            zangano.atacar(zealot);
        });

    }

    @Test
    public void testUnZealotVisibleSiDeberiaPoderSerAtacado(){
        //Arrange
        Zealot zealot = new Zealot();
        Zangano zangano = new Zangano();

        //Dejo al zealot y al zealot operativos
        for(int i = 0; i < 5; i++){
            zealot.ejecutarTurno();
        }
        zangano.ejecutarTurno();

        //Assert y Act
        assertDoesNotThrow( ()-> {
            zangano.atacar(zealot);
        });

    }

    @Test
    public void testUnZealotDestruye3EdificiosDeberiaVolverseInvisible(){
        RazaZerg unaRaza = new RazaZerg();
        unaRaza.aumentarMineral(new GestionRecurso(1000));
        unaRaza.aumentarGas(new GestionRecurso(1000));
        //Arrange
        Zealot zealot = new Zealot();
        Zangano zangano = new Zangano();

        //Dejo al zealot y al zealot operativos
        for(int i = 0; i < 4; i++){
            zealot.ejecutarTurno();
        }
        zangano.ejecutarTurno();

        //Hago que el zealot se vuelva invisible
        Espiral espiral = new Espiral();
        unaRaza.agregarEdificio(espiral);

        for (int i = 0 ; i < 163; i++){
            zealot.atacar(espiral);
        }

        Criadero criadero2 = new Criadero();
        unaRaza.agregarEdificio(criadero2);

        for (int i = 0 ; i < 63; i++){
            zealot.atacar(criadero2);
        }

        Criadero criadero3 = new Criadero();
        unaRaza.agregarEdificio(criadero3);

        for (int i = 0 ; i < 63; i++){
            zealot.atacar(criadero3);
        }

        //Assert y Act
        assertThrows( ZealotNoPuedeSerAtacadaError.class, ()-> {
            zangano.atacar(zealot);
        });

    }
/*
    @Test
    public void testUnZealotInvisiblePeroBajoElRangoDeUnAmoSupremoSiDeberiaSerAtacado(){
        Mapa mapa = new Mapa(10,10);
        Ubicacion ubicacion1 = mapa.buscar(new Coordenada(5,5));
        AmoSupremo amoSupremo = new AmoSupremo();
        ubicacion1.asignarUnidad(amoSupremo);   //aca tengo que hacer que expanda su vision
        Zangano zangano = new Zangano();
        Zealot zealot = new Zealot();

        Zangano zangano1 = new Zangano();
        for (int i = 0 ; i < 4; i++){
            zealot.atacar(zangano1);    //se muere al cuarto ataque
        }

        Zangano zangano2 = new Zangano();
        for (int i = 0 ; i < 4; i++){
            zealot.atacar(zangano2);
        }

        Zangano zangano3 = new Zangano();
        for (int i = 0 ; i < 4; i++){
            zealot.atacar(zangano3);
        }
        //assert
        assertDoesNotThrow( ()-> {
            zangano.atacar(zealot);
        });

    }*/
}
