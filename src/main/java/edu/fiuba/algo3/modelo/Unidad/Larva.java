package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.Ataque;
import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.Edificio.Zerg.*;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Larva extends Unidad{

    private TipoDeUnidadZerg tipoDeUnidadZerg;

    public Larva() {//Aca estoy tomando bastantes SUPUESTOS
        super(new HPZerg(1), new TipoTierra(), new AtaqueSoloTierra(0), 0, 0, 0, 0);
        tipoDeUnidadZerg = null;
    }

    public void evolucionar() {
        tipoDeUnidadZerg = new Zangano();
    }

    public Zerling evolucionar(ReservaDeReproduccion reserva) {
        return new Zerling(new HPZerg(35) );
        /*
        tipoDeUnidad = new Zerling();
        */
    }

    public Hidralisco evolucionar(Guarida guarida) {
        return new Hidralisco(new HPZerg(10));
        /*
        tipoDeUnidad = new Hidralisco();
        */
    }

    public Mutalisco evolucionar(Espiral espiral) {
        return new Mutalisco();
        /*
        tipoDeUnidad = Mutalisco();
        */
    }

    public GestionRecurso extraer(Recurso recurso){
        return tipoDeUnidadZerg.extraer(recurso);
    }

    public GestionRecurso extraerMineral(NodoMineral nodoMineral){
        return  tipoDeUnidadZerg.extraerMineral(nodoMineral);
    }

    public void mutarCriadero(RazaZerg raza) {
        tipoDeUnidadZerg.mutarCriadero(raza);
    }

    public void mutarEspiral(RazaZerg raza) {
        tipoDeUnidadZerg.mutarEspiral(raza);
    }

    public void mutarExtractor(RazaZerg raza) {
        tipoDeUnidadZerg.mutarExtractor(raza);
    }
    @Override
    public boolean equals(Object object){
        return tipoDeUnidadZerg.equals(object);
    }

    public void evolucionarLarva() {
        tipoDeUnidadZerg.evolucionarLarva();
    }

    public Mutalisco crearMutalisco() {
        return tipoDeUnidadZerg.crearMutalisco();
    }

    /*Esto creo que no es necesario
    @Override
    public void ejecutarTurno(){
        tipoDeUnidadZerg.ejecutarTurno();
    }*/

    public void agregarZangano(Zangano zangano) {
        tipoDeUnidadZerg.agregarZangano(zangano);
    }

    public void mutarGuarida(RazaZerg raza) {
        tipoDeUnidadZerg.mutarGuarida(raza);
    }

    public Hidralisco evolucionarLarvaAHidra(Larva larva) {
        return tipoDeUnidadZerg.evolucionarLarvaAHidra(larva);
    }

    public Zerling evolucionarLarvaAZerli(Larva larva) {
        return tipoDeUnidadZerg.evolucionarLarvaAZerli(larva);
    }

    public void mutarReservaReproduccion(RazaZerg raza) {
        tipoDeUnidadZerg.mutarReservaReproduccion(raza);
    }

    public TipoDeUnidadZerg getTipoDeUnidadZerg(){
        return tipoDeUnidadZerg;
    }
}
