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
        //mapa.agregarLinea(linea1);
        moho.mover(new Direccion(mapa));
        mapa.agregarLinea(linea1);
        //dsp de dos turnos el moho se desplaza
       //moho.ejecutarTurno(mapa);


        assertEquals(6, moho.obtenerPosicion().obtenerPosicionX());
        assertEquals(5, moho.obtenerPosicion().obtenerPosicionY());
    }
    @Test
    public void test02ConstruirAdentroDelMoho(){
        Mapa mapa = new Mapa();
        Esquina posicionConstruir = new Esquina(5, 0); //le pongo esquina
        Esquina esquina1 = new Esquina(1,0);//longitud inicial moho
        Esquina esquina2 = new Esquina(5,5);//longitud final moho
        Linea linea1 = new Linea(esquina1, esquina2);
        linea1.agregarNuevoEdificio(new ReservaDeReproduccion(2,posicionConstruir));

        mapa.agregarLinea(linea1);

        assertEquals(5, ReservaDeReproduccion.obtenerPosicion().obtenerPosicionX());
    }
}
