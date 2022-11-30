package edu.fiuba.algo3.modelo.Edificio.Protoss;

import edu.fiuba.algo3.modelo.ConstruccionProtoEnMohoError;
import edu.fiuba.algo3.modelo.Edificio.ConstruccionIncorrectaError;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.HitPoints.HPProtoss;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Unidad.Dragon;
import edu.fiuba.algo3.modelo.Unidad.Zealot;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Tierra;


import java.util.ArrayList;

public class Acceso extends Edificio {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 8;
    private static final int COSTO_GAS = 0;
    private static final int COSTO_MINERAL = 150;


    public Acceso(){
        super(CANTIDAD_TURNOS_OPERATIVO,new HPProtoss(500,500),COSTO_MINERAL,COSTO_GAS);
    }


    public void transportarTropas() {
        verififarEdificioOperativo();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral,GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }

    @Override
    public void fueAgregado(Raza raza) {
        raza.fueAgregadoAcceso();
        this.raza = raza;
    }

    @Override
    public void instalar(Tierra tierra) {
        return;
    }

    @Override
    public void instalar(Moho moho) {
        throw new ConstruccionProtoEnMohoError();
    }

    public void energizado(ArrayList<Pilon> lista){
        lista.get(0).enRango(ubicacion(),lista);
    }

    public void crearZealot() {
        verififarEdificioOperativo();
        Zealot zealot = new Zealot();
        raza.agregarUnidad(zealot);
    }

    public void crearDragon() {
        verififarEdificioOperativo();
        Dragon dragon = new Dragon();
        raza.agregarUnidad(dragon);
    }
}
