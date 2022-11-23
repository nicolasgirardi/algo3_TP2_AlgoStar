package edu.fiuba.algo3.modelo.Edificio.Zerg;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelMohoError;
import edu.fiuba.algo3.modelo.Edificio.ConstruccionIncorrectaError;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.EstadoZangano.EstadoZangano;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Tierra;

public class ReservaDeReproduccion extends Edificio implements EstadoZangano {

    private static final int CANTIDAD_TURNOS_OPERATIVO = 12;


    public ReservaDeReproduccion(){
        super(CANTIDAD_TURNOS_OPERATIVO,150,0);
    }

    @Override
    public Zerling evolucionarLarvaAZerli(Larva larva) {
        verififarEdificioOperativo();
        return larva.evolucionar(this);

    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral, GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }

    @Override
    public void fueAgregado(Raza raza) {
        raza.fueAgregadoReserva();
    }

    @Override
    public void instalar(Tierra tierra) {
        throw new ConstruccionFueraDelMohoError();
    }

    @Override
    public void instalar(Moho moho) {
        return;
    }


    public Zerling crearZerling() {
        Zerling zerling = new Zerling();
        raza.agregarUnidad(zerling);
        return zerling;
    }

    @Override
    public Zangano evolucionarLarva() {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public void agregarseAEstaRaza(RazaZerg razaZerg) {
        razaZerg.agregarEdificio(this);
    }

    @Override
    public Mutalisco crearMutalisco() {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public void agregarZangano(Zangano zangano) {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public GestionRecurso extraer(Recurso recurso) {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public Hidralisco evolucionarLarvaAHidra(Larva larva) {
        throw  new NoDeberiaEjecutarEsteMetodoError();
    }

}
