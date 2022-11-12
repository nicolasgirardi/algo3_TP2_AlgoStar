package edu.fiuba.algo3.entrega2;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso18 {

    @Test
    public void UnZanganoAtacaTierrayCausa0Daño(){
        Unidad unidad = new Zangano();

        int dañoEsperado = 0;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnZanganoAtacaAireyCausa0Daño(){
        Unidad unidad = new Zangano();

        int dañoEsperado = 0;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnZerlingAtacaTierrayCausa4Daño(){
        Unidad unidad = new Zerling();

        int dañoEsperado = 4;

        assertEquals(dañoEsperado,unidad.AtacarAire());
    }
    @Test
    public void UnZerlingAtacaAireyCausa4Daño(){
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
}