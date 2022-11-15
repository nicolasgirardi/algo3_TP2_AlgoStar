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
        Atacante atacante = new Zerling();
        Atacable zealot = new Scout();


        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            atacante.atacar(zealot);
        });

    }

    @Test
    public void testUnidadGuardianNoDeberiaPoderAtacarAUnidadesDeAire(){
        //Arrange
        Atacante atacante = new Zerling();
        Atacable zealot = new Scout();


        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            atacante.atacar(zealot);
        });

    }

    @Test
    public void testUnidadZealotNoDeberiaPoderAtacarAUnidadesDeAire(){
        //Arrange
        Atacante atacante = new Zealot();
        Atacable guardian = new Guardian();


        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            atacante.atacar(guardian);
        });

    }

}
