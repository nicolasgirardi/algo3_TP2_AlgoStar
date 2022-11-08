package edu.fiuba.algo3.modelo;

public class JugadorZerg implements Jugador{

    public void JugadorZert(){


    }
    public void construirGuarida(){

    }
    private boolean tieneReserva(){
        return false;
    }

    public String instalar(Edificio edificio, Ubicacion lugar) {
        try{
            lugar.instalar(edificio);

        }
        catch(EdificioIncorrecto e){
            return "no se puede instalar en este lugar";
        }
        return"instalacion finalizada";
    }
}
