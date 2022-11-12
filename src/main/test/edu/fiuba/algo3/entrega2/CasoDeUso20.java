package edu.fiuba.algo3.entrega2;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*

public class CasoDeUso20 {

    @Test
    public void unMutaliscoPuedeMoverseSobreAreaEspecial(){
        Unidad unidad = new Mutalisco();
        Ubicacion ubicacion = new Ubicacion(new AreaEspecial());

        assertDoesNotThrow( ()-> {
            unidad.irA(ubicacion);
        });
    }
    @Test
    public void unGuardianoPuedeMoverseSobreAreaEspecial(){
        Unidad unidad = new Guardian();
        Ubicacion ubicacion = new Ubicacion(new AreaEspecial());

        assertDoesNotThrow( ()-> {
            unidad.irA(ubicacion);
        });
    }
    @Test
    public void unScoutPuedeMoverseSobreAreaEspecial(){
        Unidad unidad = new Scout();
        Ubicacion ubicacion = new Ubicacion(new AreaEspecial());

        assertDoesNotThrow( ()-> {
            unidad.irA(ubicacion);
        });
    }
    @Test
    public void unZerlingNoPuedeMoverseSobreAreaEspecial(){
        Unidad unidad = new Zerling();
        Ubicacion ubicacion = new Ubicacion(new AreaEspecial());
        assertThrows( AreaIncorrecta.class, ()-> {
            unidad.irA(ubicacion);
        });
    }
    @Test
    public void unHidraliscoNoPuedeMoverseSobreAreaEspecial(){
        Unidad unidad = new Hidralisco();
        Ubicacion ubicacion = new Ubicacion(new AreaEspecial());
        assertThrows( AreaIncorrecta.class, ()-> {
            unidad.irA(ubicacion);
        });
    }
    @Test
    public void unZealotNoPuedeMoverseSobreAreaEspecial(){
        Unidad unidad = new Zealot();
        Ubicacion ubicacion = new Ubicacion(new AreaEspecial());
        assertThrows( AreaIncorrecta.class, ()-> {
            unidad.irA(ubicacion);
        });
    }
    @Test
    public void unDragonNoPuedeMoverseSobreAreaEspecial(){
        Unidad unidad = new Dragon();
        Ubicacion ubicacion = new Ubicacion(new AreaEspecial());
        assertThrows( AreaIncorrecta.class, ()-> {
            unidad.irA(ubicacion);
        });
    }
}
