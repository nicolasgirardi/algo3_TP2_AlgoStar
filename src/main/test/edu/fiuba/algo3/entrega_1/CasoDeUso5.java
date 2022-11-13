package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Criadero;
import edu.fiuba.algo3.modelo.Moho;
import edu.fiuba.algo3.modelo.tablero.CeldaMapa;
import org.junit.jupiter.api.Test;

public class CasoDeUso5 {

    @Test
    public void testConstruirArribaDelMoho(){
        CeldaMapa celdaMapa = new CeldaMapa(0,0);
        Moho moho = new Moho(celdaMapa);
        Criadero criaderoNormal = new Criadero(0);
    }
}
