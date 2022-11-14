package edu.fiuba.algo3.entrega_2;

import edu.fiuba.algo3.modelo.Guardian;
import edu.fiuba.algo3.modelo.NoPuedeAtacarUnidadDeAireError;
import edu.fiuba.algo3.modelo.Scout;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Unidad.Zerling;
import edu.fiuba.algo3.modelo.Zealot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso19 {
    /*
    Verificar que todas las unidades que no tienen ataque de aire no puedan atacar a una
     unidad voladora. Idem para todas las combinaciones.
    */

    @Test
    public void testUnidadZerlingNoDeberiaPoderAtacarAUnidadesDeAire(){
        Zerling zerling = new Zerling();
        Mutalisco mutalisco = new Mutalisco();
        Guardian guardian = new Guardian();
        Scout scout = new Scout();

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            zerling.atacarUnidad(mutalisco);
        });

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            zerling.atacarUnidad(guardian);
        });

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            zerling.atacarUnidad(scout);
        });
    }

    @Test
    public void testUnidadZealotNoDeberiaPoderAtacarAUnidadesDeAire(){
        Zealot zealot = new Zealot();
        Mutalisco mutalisco = new Mutalisco();
        Guardian guardian = new Guardian();
        Scout scout = new Scout();

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            zealot.atacarUnidad(mutalisco);
        });

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            zealot.atacarUnidad(guardian);
        });

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            zealot.atacarUnidad(scout);
        });
    }

    @Test
    public void testUnidadGuardianNoDeberiaPoderAtacarAUnidadesDeAire(){
        Guardian guardian = new Guardian();
        Mutalisco mutalisco = new Mutalisco();
        Guardian guardianDos = new Guardian();
        Scout scout = new Scout();

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            guardian.atacarUnidad(mutalisco);
        });

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            guardian.atacarUnidad(guardianDos);
        });

        assertThrows( NoPuedeAtacarUnidadDeAireError.class, ()-> {
            guardian.atacarUnidad(scout);
        });
    }




}
