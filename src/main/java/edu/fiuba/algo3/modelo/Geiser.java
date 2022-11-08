package edu.fiuba.algo3.modelo;

public class Geiser implements Ubicacion {

    public void instalar(Edificio unEdificio) throws EdificioIncorrecto{
        if(!(unEdificio instanceof Extractor || unEdificio instanceof Asimilador)){
            throw new EdificioIncorrecto();
        }
    }
}
