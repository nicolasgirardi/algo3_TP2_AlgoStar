package edu.fiuba.algo3.modelo.Edificio.Zerg;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelMohoError;
import edu.fiuba.algo3.modelo.Edificio.ConstruccionIncorrectaError;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.EstadoZangano.EstadoZangano;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Moho;
import edu.fiuba.algo3.modelo.tablero.Tierra;

import java.util.ArrayList;

public class Criadero extends Edificio implements EstadoZangano {
    private final int CANTIDAD_TURNOS_OPERATIVO = 4;

    private ArrayList<Larva> larvas;

    public Criadero(){
        super(0,new HPZerg(500),200,0);
        larvas = new ArrayList<Larva>();
        cargarTodaslasLarvas();
    }
    public Criadero(int cantidadTurnosParaSerOperativo){
        super(cantidadTurnosParaSerOperativo, 200, 0);
        larvas = new ArrayList<Larva>();
        if (cantidadTurnosParaSerOperativo == 0 ) cargarTodaslasLarvas();
    }

    @Override
    public void ejecutarTurno() {
        super.ejecutarTurno();
        if (turnosRestantesParaSerOperativo == 0 ) cargarTodaslasLarvas();
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
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public Zerling evolucionarLarvaAZerli(Larva larva) {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public Zangano evolucionarLarva() {
        verififarEdificioOperativo();
        Larva larvaAuxiliar = larvas.remove(0);
        Zangano zangano = larvaAuxiliar.evolucionar();
        raza.agregarUnidad(zangano);
        return zangano;
    }

    @Override
    public void agregarseAEstaRaza(RazaZerg razaZerg) {
        razaZerg.agregarEdificio(this);
    }

    private  void cargarTodaslasLarvas(){
        larvas.add( new Larva() );
        larvas.add( new Larva() );
        larvas.add( new Larva() );
    }


    @Override
    public boolean equals(Object object){
        if (!(object instanceof Criadero)) return false;
        Criadero criadero = (Criadero) object;

        return criadero.tieneMismaCantidad(larvas.size());
    }

    private boolean tieneMismaCantidad(int size) {
        return larvas.size() == size;
    }


    public void ejecutarTurnoRegenerar() {
        if(larvas.size() < 3){
            larvas.add( new Larva() );
        }
    }

    public void verificarSiPuedeSerConstruido(GestionRecurso unidadesDeMineral, GestionRecurso unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas);
    }


    @Override
    public void fueAgregado(Raza raza) {
        this.raza = raza;
        raza.aumentarCapacidad(5);
    }

    @Override
    public void instalar(Tierra tierra) {
        throw new ConstruccionFueraDelMohoError();
    }

    @Override
    public void instalar(Moho moho) {
        return;
    }
    @Override
    public Mutalisco crearMutalisco() {
        throw new NoDeberiaEjecutarEsteMetodoError();
    }



    public void disminuirCapacidad(Raza unaRaza){
        unaRaza.disminuirCapacidad(5);
    }


}