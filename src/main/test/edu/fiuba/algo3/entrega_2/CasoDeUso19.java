package edu.fiuba.algo3.entrega_2;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.Unidad.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso19 {
    /*
    Verificar que todas las unidades que no tienen ataque de aire no puedan atacar a una
     unidad voladora. Idem para todas las combinaciones.
    */

    @Test
    public void testUnidadZerlingNoDeberiaPoderAtacarAUnidadesDeAire(){
        //Arrange
        HitPoints HpZerling = new HPZerg(35);
        HitPoints HpZealot = new HPProtoss(60,100);
        Unidad zerling = new Zerling(HpZerling);
        Atacable zealot = new Scout(HpZealot);


        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            zerling.atacar(zealot);
        });

    }
    /*
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



*/
}
