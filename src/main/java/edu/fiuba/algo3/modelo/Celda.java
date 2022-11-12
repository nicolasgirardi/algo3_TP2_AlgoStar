package edu.fiuba.algo3.modelo;

public class Celda {

    private Edificio edificio;
    private Recurso recurso; //desp refactorizar y que sean recursos

    public Celda(){
        edificio = null;
        recurso = null;
    }
    public void asignarRecurso(Volcan volcan) {
        recurso = volcan;

    }

    public void asignarEdifico(Edificio unEdificio){
        tirarEdificioIncorrectoError(unEdificio);
        edificio = unEdificio;
    }

    public void tirarEdificioIncorrectoError(Edificio unEdificio){

        if( verificarClases(unEdificio) ){
            throw new EdificioIncorrecto();
        }
    }

    private boolean verificarClases(Edificio unEdificio){
        Volcan unVolcan = new Volcan();
        Asimilador unAsimilador = new Asimilador();
        Extractor unExtractor = new Extractor();
        return ( recurso.getClass() == unVolcan.getClass() && unEdificio.getClass() != unAsimilador.getClass() && unEdificio.getClass() != (unExtractor.getClass()));
    }

}
