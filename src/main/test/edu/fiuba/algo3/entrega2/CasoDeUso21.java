package edu.fiuba.algo3.entrega2;
import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CasoDeUso21 {

    @Test
    public void unMutaliscoNoPuedeEvolucionarSinLosRecursosSuficientes(){
        Unidad unMutalisco = new Mutalisco();
        Recursos unosRecursos = new Recursos(0,0);//0 minerales y 0 gas
        assertThrows(RecursosInsuficientes.class,()-> {
            unMutalisco.evolucionar(recursos);
        });
    }
}
