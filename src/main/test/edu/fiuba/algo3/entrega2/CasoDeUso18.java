package edu.fiuba.algo3.entrega2;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso18 {


    @Test
    public void UnZerlingAtacaTierrayCausa4Daño(){
        Unidad unidad = new Zerling();

        int dañoEsperado = 4;

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
        Unidad unidad = new Guardian();

        int dañoEsperado = 25;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }

    @Test
    public void UnZealotAtacaTierrayCausa8Daño(){
        Unidad unidad = new Zealot();

        int dañoEsperado = 8;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnDragonAtacaTierrayCausa20Daño(){
        Unidad unidad = new Dragon();

        int dañoEsperado = 20;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnDragonAtacaAireyCausa20Daño(){
        Unidad unidad = new Dragon();

        int dañoEsperado = 20;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnScoutAtacaTierrayCausa8Daño(){
        Unidad unidad = new Scout();

        int dañoEsperado = 8;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnScoutAtacaAireyCausa14Daño(){
        Unidad unidad = new Scout();

        int dañoEsperado = 14;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
}
