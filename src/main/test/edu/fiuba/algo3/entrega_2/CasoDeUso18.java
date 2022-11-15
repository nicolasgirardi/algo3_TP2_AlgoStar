package edu.fiuba.algo3.entrega_2;

import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.HitPoints.*;
import edu.fiuba.algo3.modelo.Zealot;
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
        Zangano zangano = new Zangano();
        HitPoints HpZealot = new HPProtoss(60,100);
        Atacable zealot = new Zealot(HpZealot);
        HitPoints HpEsperado = new HPProtoss(60,100);

        //Act
        zangano.atacar(zealot);

        //Assert
        assertEquals(HpZealot,HpEsperado);

    }


    @Test
    public void testUnZerlingAtacaAUnZealotQueEsUnaUnidadDeSuperficieTierrayLeDeberiaCausar4Danio(){
        //Arrange
        HitPoints HpZerling = new HPZerg(35);
        HitPoints HpZealot = new HPProtoss(60,100);
        HitPoints HpEsperado = new HPProtoss(60,96);
        Unidad zerling = new Zerling(HpZerling);
        Atacable zealot = new Zealot(HpZealot);


        //Act
        zerling.atacar(zealot);

        //Assert
        assertEquals(HpZealot,HpEsperado);

    }

    @Test
    public void testUnHidraliscoAtacaAUnZealotQueEsUnaUnidadDeSuperficieVientoyLeDeberiaCausar10Danio(){
        //Arrange
        HitPoints HpZerling = new HPZerg(35);
        HitPoints HpZealot = new HPProtoss(60,100);
        HitPoints HpEsperado = new HPProtoss(60,90);

        Unidad hidralisco = new Hidralisco(HpZerling);
        Atacable zealot = new Zealot(HpZealot);


        //Act
        hidralisco.atacar(zealot);

        //Assert
        assertEquals(HpZealot,HpEsperado);
    }

    /*
    @Test
    public void UnZerlingAtacaTierrayCausa4Daño(){
        Unidad unidad = new Zerling();

        int dañoEsperado = 4;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnZerlingAtacaAireyCausa0Daño(){
        Unidad unidad = new Zerling();

        int dañoEsperado = 0;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }

    @Test
    public void UnHidraliscoAtacaTierrayCausa10Daño(){
        Unidad unidad = new Hidralisco();

        int dañoEsperado = 10;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnHidraliscoAtacaAireyCausa10Daño(){
        Unidad unidad = new Hidralisco();

        int dañoEsperado = 10;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }

    @Test
    public void UnMutaliscoAtacaTierrayCausa9Daño(){
        Unidad unidad = new Mutalisco();

        int dañoEsperado = 9;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnMutaliscoAtacaAireyCausa9Daño(){
        Unidad unidad = new Mutalisco();

        int dañoEsperado = 9;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnGuardianAtacaTierrayCausa25Daño(){
        Unidad unidad = new Mutalisco();

        int dañoEsperado = 25;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnMutaliscoAtacaAireyCausa0Daño(){
        Unidad unidad = new Mutalisco();

        int dañoEsperado = 0;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }*/

}
