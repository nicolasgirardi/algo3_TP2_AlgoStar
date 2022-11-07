package edu.fiuba.algo3.modelo;

public class JugadorZerg implements Jugador{

    public void JugadorZert(){


    }
    public void construirGuarida(){
        if (tieneReserva()){
            /*construir guarida*/
        }
        else
            throw new FaltaEdificio();


    }
    private boolean tieneReserva(){
        return false;
    }
}
