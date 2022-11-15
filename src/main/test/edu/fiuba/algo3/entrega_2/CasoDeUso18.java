package edu.fiuba.algo3.entrega_2;

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
    public void testUnZanganoAtacaAUnZealotQueEsUnaUnidadDeTierrayLeDeberiaCausar0Danio(){
        HitPoints HpZangano = new HPZerg(20);
        HitPoints HpZealot = new HPProtoss(60,100);

        Unidad zanganoUno = new Zangano(HpZangano);
        Unidad zealot = new Zealot(HpZealot);

        zanganoUno.atacar(zealot);
        HitPoints HPRestante = new HPProtoss(60,100);

        assertEquals(HpZealot,HPRestante);
    }

    @Test
    public void testUnZerlingAtacaAUnZealotQueEsUnaUnidadTierayLeDeberiaCausar4Danio(){
        HitPoints HpZerling = new HPZerg(35);
        HitPoints HpZealot = new HPProtoss(60,100);

        Unidad zerling = new Zerling(HpZerling);
        Unidad zealot = new Zealot(HpZealot);

        zerling.atacar(zealot);
        HitPoints HPRestante = new HPProtoss(60,96);

        assertEquals(HpZealot,HPRestante);
    }
/* ----------TEST QUE FALLA PENSARLO
    @Test
    public void testUnHidraliscoAtacaAUnZealotQueEsUnaUnidadTierayLeDeberiaCausar10Danio(){
        HitPoints HpZerling = new HPZerg(35);
        HitPoints HpZealot = new HPProtoss(60,100);

        Unidad hidralisco = new Hidralisco(HpZerling);
        Unidad zealot = new Zealot(HpZealot);

        hidralisco.atacar(zealot);
        HitPoints HPRestante = new HPProtoss(60,96);

        assertEquals(HpZealot,HPRestante);
    }
*/
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
