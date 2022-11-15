package edu.fiuba.algo3.entrega_2;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Unidad.Mutalisco;
import edu.fiuba.algo3.modelo.Unidad.Zerling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CasoDeUso19 {
    /*
    Verificar que todas las unidades que no tienen ataque de aire no puedan atacar a una
     unidad voladora. Idem para todas las combinaciones.
    */

    @Test
    public void testUnidadZerlingNoDeberiaPoderAtacarAUnScout(){

        //Arrange
        Atacante atacante = new Zerling();
        Atacable scout = new Scout();


        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            atacante.atacar(scout);
        });

    }

    @Test
    public void testUnidadZerlingNoDeberiaPoderAtacarAUnMutalisco(){
        //Arrange
        Atacante atacante = new Zerling();
        Atacable mutalisco = new Mutalisco();


        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            atacante.atacar(mutalisco);
        });

    }

    @Test
    public void testUnidadZerlingNoDeberiaPoderAtacarAUnGuardian(){
        //Arrange
        Atacante atacante = new Zerling();
        Atacable guardian = new Guardian();

        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            atacante.atacar(guardian);
        });
    }

    @Test
    public void testUnidadGuardianNoDeberiaPoderAtacarAUnMutalisco(){
        //Arrange
        Atacante guardian = new Guardian();
        Atacable mutalisco = new Mutalisco();

        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            guardian.atacar(mutalisco);
        });
    }

    @Test
    public void testUnidadGuardianNoDeberiaPoderAtacarAOtroGuardian(){
        //Arrange
        Atacante guardian = new Guardian();
        Atacable guardianDos = new Guardian();

        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            guardian.atacar(guardianDos);
        });

    }

    @Test
    public void testUnidadGuardianNoDeberiaPoderAtacarAUnScout(){
        //Arrange
        Atacante guardian = new Guardian();
        Atacable scout = new Scout();

        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            guardian.atacar(scout);
        });
    }


    @Test
    public void testUnidadZealotNoDeberiaPoderAtacarAUnMutalisco(){
        //Arrange
        Atacante zealot = new Zealot();
        Atacable mutalisco = new Mutalisco();

        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            zealot.atacar(mutalisco);
        });

    }


    @Test
    public void testUnidadZealotNoDeberiaPoderAtacarAUnGuardian(){
        //Arrange
        Atacante zealot = new Zealot();
        Atacable guardian = new Guardian();

        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            zealot.atacar(guardian);
        });

    }

    @Test
    public void testUnidadZealotNoDeberiaPoderAtacarAUnScout(){
        //Arrange
        Atacante zealot = new Zealot();
        Atacable scout = new Scout();

        //Act y Assert
        assertThrows(NoPuedeAplicarDanioUnidadTipoAire.class, () -> {
            zealot.atacar(scout);
        });
    }

}
