package edu.fiuba.algo3.modelo;

public class Espiral extends Edificio{

    private static final int CANTIDAD_TURNOS_OPERATIVO = 10;

    private int turnosRestantesParaSerOperativo;

    public Espiral() {
        super(CANTIDAD_TURNOS_OPERATIVO);
    }

    public Mutalisco crearMutalisco() {
        verififarEdificioOperativo();
        return new Mutalisco();

    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 150 , 100);
    }

    @Override
    public int consumirGas(int unidadesDeGas) {
        return unidadesDeGas-100;
    }

    @Override
    public int consumirMineral(int unidadesDeMineral) {
        return unidadesDeMineral-150;
    }

}
