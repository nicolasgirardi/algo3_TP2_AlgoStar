package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Criadero{
    private final int CANTIDAD_TURNOS_OPERATIVO = 4;
    private int turnosRestantesParaSerOperativo;
    private ArrayList<Larva> larvas;

    public Criadero(){
        larvas = new ArrayList<Larva>();
        cargarTodaslasLarvas();
        turnosRestantesParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO ;
    }
    public Criadero(int cantidadTurnosParaSerOperativo){
        larvas = new ArrayList<Larva>();
        this.turnosRestantesParaSerOperativo = cantidadTurnosParaSerOperativo;
        if (cantidadTurnosParaSerOperativo == 0 ) cargarTodaslasLarvas();
    }

    public Zangano evolucionarLarva() {
        if( turnosRestantesParaSerOperativo > 0 ){
            throw new EdificioNoOperativoError();
        }
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

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }
}