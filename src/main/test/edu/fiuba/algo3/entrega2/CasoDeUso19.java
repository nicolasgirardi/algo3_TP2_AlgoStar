package edu.fiuba.algo3.entrega2;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasoDeUso19 {

    @Test
    public void UnZerlingNoPuedeAtacarUnScout(){
        Unidad unZerling = new Zerling();
        Unidad unScout = new Scout();
        assertThrows(NoSePuedeAtacarUnidad.class,()-> {
            unZerling.atacar(unScout);
        });
    }
    @Test
    public void UnGuardianNoPuedeAtacarUnScout(){
        Unidad unGuardian = new Guardian();
        Unidad unScout = new Scout();
        assertThrows(NoSePuedeAtacarUnidad.class,()-> {
            unGuardian.atacar(unScout);
        });
    }
    @Test
    public void UnZealotNoPuedeAtacarUnMutalisco(){
        Unidad UnZealot = new Zealot();
        Unidad unMutalisco = new Mutalisco();
        assertThrows(NoSePuedeAtacarUnidad.class,()-> {
            UnZealot.atacar(unMutalisco);
        });
    }
    @Test
    public void UnZealotNoPuedeAtacarunGuardian(){
        Unidad UnZealot = new Zerling();
        Unidad unGuardian = new Guardian();
        assertThrows(NoSePuedeAtacarUnidad.class,()-> {
            UnZealot.atacar(unGuardian);
        });
    }
}
