package edu.fiuba.algo3.modelo.Edificio;

import edu.fiuba.algo3.modelo.Unidad.Larva;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Unidad.Zangano;

import java.util.ArrayList;

public class Criadero extends Edificio {
    private final int CANTIDAD_TURNOS_OPERATIVO = 4;

    private ArrayList<Larva> larvas;

    public Criadero(){
        super(4);
        larvas = new ArrayList<Larva>();
        cargarTodaslasLarvas();
    }
    public Criadero(int cantidadTurnosParaSerOperativo){
        super(cantidadTurnosParaSerOperativo);
        larvas = new ArrayList<Larva>();
        if (cantidadTurnosParaSerOperativo == 0 ) cargarTodaslasLarvas();
    }

    @Override
    public void construirEdificioEn(Recurso recurso) {
        throw new ConstruccionIncorrectaError();
    }

    public Zangano evolucionarLarva() {
        verififarEdificioOperativo();
        Larva larvaAuxiliar = larvas.get(0);
        larvas.remove(0);
        return larvaAuxiliar.evolucionar();
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

    public void verificarSiPuedeSerConstruido(int unidadesDeMineral, int unidadesDeGas){
        verificarSiPuedeSerConstruidoSegunRecursos(unidadesDeMineral, unidadesDeGas, 50 , 0);
    }

    @Override
    public int consumirGas(int unidadesDeGas) {
        return unidadesDeGas;
    }

    @Override
    public int consumirMineral(int unidadesDeMineral) {
        return unidadesDeMineral-50;
    }
}