package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Recurso.Volcan;

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
    /*
        if( verificarClases(unEdificio) ){
            throw new EdificioIncorrectoError();
        }


     */
    }
    /*
    private boolean verificarClases(Edificio unEdificio){
        Volcan unVolcan = new Volcan();
        Asimilador unAsimilador = new Asimilador(unVolcan);
        Extractor unExtractor = new Extractor(new Volcan());
        return ( recurso.getClass() == unVolcan.getClass() && unEdificio.getClass() != unAsimilador.getClass() && unEdificio.getClass() != (unExtractor.getClass()));
    }
    */
}
