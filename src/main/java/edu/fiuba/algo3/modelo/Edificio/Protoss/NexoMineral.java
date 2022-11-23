package edu.fiuba.algo3.modelo.Edificio.Protoss;


import edu.fiuba.algo3.modelo.ConstruccionProtoEnMohoError;
import edu.fiuba.algo3.modelo.Edificio.ConstruccionIncorrectaError;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Tierra;

public class NexoMineral extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 4;
    private static final int CANTIDAD_EXTRACCION = 20;
    private NodoMineral nodoMineral;

    public NexoMineral(NodoMineral nodoMineral){
        super(CANTIDAD_TURNOS_OPERATIVO,50,0) ;
        this.nodoMineral = nodoMineral;
        nodoMineral.ocuparConEdificio(this);
    }


    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public GestionRecurso extraer(){
        verififarEdificioOperativo();
        return nodoMineral.extraer(CANTIDAD_EXTRACCION);
    }

    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral,GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }

    @Override
    public void fueAgregado(Raza raza) {
        this.raza = raza;
        return;
    }

    @Override
    public void instalar(Tierra tierra) {
        return;
    }

    @Override
    public void instalar(Moho moho) {
        throw new ConstruccionProtoEnMohoError();
    }
}
