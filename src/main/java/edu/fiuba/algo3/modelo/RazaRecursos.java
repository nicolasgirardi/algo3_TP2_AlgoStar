package edu.fiuba.algo3.modelo;

public class RazaRecursos {
    private int unidadesGas;
    private int unidadesMineral;

    public RazaRecursos(){
        unidadesGas = 0;
        unidadesMineral = 0;
    }

    public int obtenerCantidadGas(){
        return unidadesGas;
    }


    public void aumentarGas(int cantidad){
        unidadesGas += cantidad;
    }
    public void unidadesMineral(int cantidad){
        unidadesMineral += cantidad;
    }
}
