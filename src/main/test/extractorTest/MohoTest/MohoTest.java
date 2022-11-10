package extractorTest.MohoTest;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MohoTest {
    @Test
    public void test01SeCreaElMohoConUnaExpansionDe5(){
        Mapa mapa = new Mapa();
        Esquina posicionCriadero = new Esquina(5, 5);
        Esquina esquina1 = new Esquina(1,0);
        Esquina esquina2 = new Esquina(5,5);
        Moho moho = new Moho(esquina1);
        Linea linea1 = new Linea(esquina1, esquina2);
        mapa.agregarLinea(linea1);
        moho.mover(new Direccion(mapa));

        assertEquals(6, moho.obtenerPosicion().obtenerPosicionX());
        assertEquals(5, moho.obtenerPosicion().obtenerPosicionY());
    }

}
