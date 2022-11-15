package edu.fiuba.algo3.entrega_2;
import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Edificio.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Scout;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Especial;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso20 {

    @Test
    public void UnScoutPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Scout();

        assertDoesNotThrow(  ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
    @Test
    public void UnGuardianPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Guardian();

        assertDoesNotThrow(  ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
    @Test
    public void UnMutaliscoPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Mutalisco();

        assertDoesNotThrow(  ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
    @Test
    public void UnDragonNoPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Dragon();

        assertThrows( UnidadNoVuelaError.class, ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
    @Test
    public void UnZealotNoPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Zealot();

        assertThrows( UnidadNoVuelaError.class, ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
    @Test
    public void UnHidraliscoNoPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Hidralisco();

        assertThrows( UnidadNoVuelaError.class, ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
    @Test
    public void UnZerlingNoPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Zerling();

        assertThrows( UnidadNoVuelaError.class, ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
    @Test
    public void UnZanganoNoPuedeUbicarseEnUnaUbicacionEspecial(){
        Ubicacion ubicacion = new Ubicacion(new Coordenada(5,5));
        ubicacion.darTipo(new Especial());
        Unidad unidad = new Zangano();

        assertThrows( UnidadNoVuelaError.class, ()-> {
            ubicacion.asignarUnidad(unidad);
        });
    }
}
