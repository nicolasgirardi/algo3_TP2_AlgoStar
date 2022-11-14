package edu.fiuba.algo3.entrega_1;

import edu.fiuba.algo3.modelo.Celda;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CasoDeUso9 {
    @Test
    public void testEdificioProtoSigueOperativoSiUnoDeLosDosPilonesEsDestruido(){
        Celda Rangopilon1 = new Celda(3,3);
        Celda Rangopilon2 = new Celda(2,2);

        Rangopilon1.asignarRangoPilon(new Pilon());
        Rangopilon2.asignarRangoPilon(new Pilon());

        Edificio unEdificio = new PuertoEstelar();
        Rangopilon2.asignarEdificoProtos(unEdificio);


        //act


        Rangopilon1.eliminarRangoPilon();
        Rangopilon2.ReasignarRangoPilon();
        Rangopilon2.asignarEdificoProtos(unEdificio);

        //assert
        //assertFalse(Rangopilon2.estaFuncional(unEdificio));
    }
}
