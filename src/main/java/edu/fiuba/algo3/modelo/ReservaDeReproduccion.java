package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class ReservaDeReproduccion extends Edificio{

    private static final int CANTIDAD_TURNOS_OPERATIVO = 12;

    private ArrayList<Larva> larvas;

    public ReservaDeReproduccion(){
        super(CANTIDAD_TURNOS_OPERATIVO);
        larvas = new ArrayList<Larva>();
        cargarTodaslasLarvas();
    }

    private  void cargarTodaslasLarvas(){
        larvas.add( new Larva() );
        larvas.add( new Larva() );
        larvas.add( new Larva() );
    }


    public Zerling evolucionarLarva(Larva larva) {
        verififarEdificioOperativo();
        return larva.evolucionar(this);

    }

}
