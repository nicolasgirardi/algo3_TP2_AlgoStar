package edu.fiuba.algo3.modelo.Edificio.Protoss;

import edu.fiuba.algo3.modelo.ConstruccionProtoEnMohoError;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.IDEDIFICIO;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Tierra;

public class Asimilador extends Edificio {
    private static final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private Volcan volcan;

    public Asimilador(){
        super(CANTIDAD_TURNOS_OPERATIVO,new HPProtoss(450,450),100,0);
        entidad = IDEDIFICIO.ASIMILADOR;
    }

    //asimilador se instala sobre un volcan imposible instalarlo en otro lugar.
    public Asimilador(Volcan volcan){
        super(CANTIDAD_TURNOS_OPERATIVO,new HPProtoss(450,450),100,0);
        entidad = IDEDIFICIO.ASIMILADOR;
        volcan.agregarEdificio(this);
        this.volcan = volcan;
    }

    public void prepararCapsula() {
        verififarEdificioOperativo();

    }

    public GestionRecurso extraer(Volcan volcan) {
        if(this.volcan != null){
            return volcan.extraer(20);
        }
        return volcan.extraer(20);

    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        recurso.agregarEdificio(this);
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
