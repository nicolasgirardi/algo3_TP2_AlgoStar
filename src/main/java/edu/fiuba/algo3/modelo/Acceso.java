package edu.fiuba.algo3.modelo;

public class Acceso extends Edificio{

    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;


    public Acceso(){
        super(CANTIDAD_TURNOS_OPERATIVO);
    }


    public void transportarTropas() {
        verififarEdificioOperativo();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 150 , 900000000);
    }
}
