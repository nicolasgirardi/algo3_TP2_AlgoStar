package edu.fiuba.algo3.entrega_2;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.HitPoints.*;
import org.junit.jupiter.api.Test;

import java.security.interfaces.RSAKey;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class CasoDeUso18 {

    /*
     * - Verificar que todas las unidades cuasen el daño que dicen que causan en sus ataques.*/

    @Test
    public void testUnZanganoAtacaAUnZealotQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar0Danio(){
        //Arrange
        Atacante zangano = new Zangano();
        HitPoints hpZealot = new HPProtoss(60,100);
        Atacable zealot = new Zealot(hpZealot);
        HitPoints hpEsperado = new HPProtoss(60,100);

        //Act
        zangano.atacar(zealot);

        //Assert
        assertEquals(hpEsperado,hpZealot);

    }

    @Test
    public void testUnZerlingAtacaAUnZealotQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar4Danio(){
        //Arrange
        HitPoints hpZealot = new HPProtoss(60,100);
        HitPoints hpEsperado = new HPProtoss(60,96);
        Atacante zerling = new Zerling();
        Atacable zealot = new Zealot(hpZealot);

        //Act
        zerling.atacar(zealot);

        //Assert
        assertEquals(hpEsperado,hpZealot);

    }

    @Test
    public void testUnHidraliscoAtacaAUnZealotQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar10Danio(){
        //Arrange
        HitPoints hpZealot = new HPProtoss(60,100);
        HitPoints hpEsperado = new HPProtoss(60,90);

        Atacante hidralisco = new Hidralisco();
        Atacable zealot = new Zealot(hpZealot);


        //Act
        hidralisco.atacar(zealot);

        //Assert
        assertEquals(hpEsperado,hpZealot);
    }


    @Test
    public void testUnHidraliscoAtacaAUnZealotQueEsUnaUnidadDeSuperficieVVientoyLeDeberiaCausar10Danio(){
        //Arrange
        HitPoints hpScout = new HPProtoss(150,100);
        HitPoints hpEsperado = new HPProtoss(150,90);

        Atacante hidralisco = new Hidralisco();
        Atacable scout = new Scout(hpScout);


        //Act
        hidralisco.atacar(scout);

        //Assert
        assertEquals(hpEsperado, hpScout);
    }

    @Test
    public void testUnMutaliscoAtacaAUnZealotQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar9Danio(){
        //Arrange
        HitPoints hpZealot = new HPProtoss(60,100);
        HitPoints hpEsperado = new HPProtoss(60,91);

        Atacante mutalisco = new Mutalisco();
        Atacable zealot = new Zealot(hpZealot);


        //Act
        mutalisco.atacar(zealot);

        //Assert
        assertEquals(hpEsperado,hpZealot);
    }


    @Test
    public void testUnMutaliscoAtacaAUnZealotQueEsUnaUnidadDeSuperficieVVientoyLeDeberiaCausar9Danio(){
        //Arrange
        HitPoints hpScout = new HPProtoss(150,100);
        HitPoints hpEsperado = new HPProtoss(150,91);

        Atacante mutalisco = new Mutalisco();
        Atacable scout = new Scout(hpScout);


        //Act
        mutalisco.atacar(scout);

        //Assert
        assertEquals(hpEsperado,hpScout);
    }

    @Test
    public void testUnGuardianAtacaAUnZealotQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar25Danio(){
        //Arrange
        HitPoints hpZealot = new HPProtoss(60,100);
        HitPoints hpEsperado = new HPProtoss(60,75);

        Atacante mutalisco = new Guardian();
        Atacable zealot = new Zealot(hpZealot);


        //Act
        mutalisco.atacar(zealot);

        //Assert
        assertEquals(hpEsperado,hpZealot);
    }



    @Test
    public void testUnZealotAtacaAUnZerlingQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar8Danio(){
        //Arrange
        HitPoints hpZerling = new HPZerg(35);
        HitPoints hpEsperado = new HPZerg(27);

        Atacante zealot = new Zealot();
        Atacable zerling = new Zerling(hpZerling);


        //Act
        zealot.atacar(zerling);

        //Assert
        assertEquals(hpEsperado,hpZerling);
    }

    @Test
    public void testUnDragonAtacaAUnZerlingQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar8Danio(){
        //Arrange
        HitPoints hpZerling = new HPZerg(35);
        HitPoints hpEsperado = new HPZerg(15);

        Atacante dragon = new Dragon();
        Atacable zerling = new Zerling(hpZerling);


        //Act
        dragon.atacar(zerling);

        //Assert
        assertEquals(hpEsperado,hpZerling);
    }

    @Test
    public void testUnDragonAtacaAUnGuardianQueEsUnaUnidadDeSuperficieVientoyLeDeberiaCausar20Danio(){
        //Arrange
        HitPoints hpGuardian = new HPZerg(100);
        HitPoints hpEsperado = new HPZerg(80);

        Atacante dragon = new Dragon();
        Atacable guardian = new Guardian(hpGuardian);


        //Act
        dragon.atacar(guardian);

        //Assert
        assertEquals(hpEsperado,hpGuardian);
    }


    @Test
    public void testUnScoutAtacaAUnZerlingQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar8Danio(){
        //Arrange
        HitPoints hpZerling = new HPZerg(35);
        HitPoints hpEsperado = new HPZerg(27);

        Atacante scout = new Scout();
        Atacable zerling = new Zerling(hpZerling);


        //Act
        scout.atacar(zerling);

        //Assert
        assertEquals(hpEsperado,hpZerling);
    }

    @Test
    public void testUnScoutAtacaAUnGuardianQueEsUnaUnidadDeSuperficieVientoyLeDeberiaCausar14Danio(){
        //Arrange
        HitPoints hpGuardian = new HPZerg(100);
        HitPoints hpEsperado = new HPZerg(86);

        Atacante scout = new Scout();
        Atacable guardian = new Guardian(hpGuardian);


        //Act
        scout.atacar(guardian);

        //Assert
        assertEquals(hpEsperado,hpGuardian);
    }

}