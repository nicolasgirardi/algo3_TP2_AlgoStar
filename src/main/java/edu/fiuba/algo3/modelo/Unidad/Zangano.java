package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Ataque.AtaqueSoloTierra;
import edu.fiuba.algo3.modelo.Edificio.Edificacion;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Extractor;
import edu.fiuba.algo3.modelo.EstadoZangano.EstadoZangano;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public class Zangano extends Unidad{
    private EstadoZangano estadoZangano;
    public Zangano(){
        super(new HPZerg(25),  new TipoTierra(),  new AtaqueSoloTierra(0), 1,1);
        estadoZangano = null;
    }

    public Zangano(HitPoints vida){
        super(vida,1);
    }

    public GestionRecurso extraer(Recurso recurso){
        if(estadoZangano == null){
            return recurso.extraer(10);
        }
        return estadoZangano.extraer(recurso);
    }

    public GestionRecurso extraerMineral(NodoMineral nodoMineral){
        return  nodoMineral.extraerConZangano(10, this);
    }

    private void verificarEstadoLibreZangano(){
        if( estadoZangano != null ){
            throw new ZanganoYaEsUnaEdificacionError();   //luego al criadero ponerle 4 crias.
        }
    }

    public void mutarCriadero(RazaZerg raza) {
        verificarEstadoLibreZangano();
        estadoZangano = new Criadero();  //creo un criadero con 0 turnos para ser operativos. ojo.
        raza.agregarEsteEdificio(estadoZangano);
    }

    public void mutarEspiral(RazaZerg raza) {
        verificarEstadoLibreZangano();
        estadoZangano = new Espiral();
        raza.agregarEsteEdificio(estadoZangano);
    }

    public void mutarExtractor(RazaZerg raza) {
        verificarEstadoLibreZangano();
        estadoZangano = new Extractor();
        raza.agregarEsteEdificio(estadoZangano);
    }

    //--------Wrappers de criadero.
    @Override
    public boolean equals(Object object){
        if (!(object instanceof Zangano)) return false;
        Zangano zangano = (Zangano) object;

        return zangano.estadoZangano == this.estadoZangano ;
    }

    //wrapper de criadero.
    public Zangano evolucionarLarva() {
        return estadoZangano.evolucionarLarva();
    }

    //wrapper de espiral:
    public Mutalisco crearMutalisco() {
        return estadoZangano.crearMutalisco();
    }

    @Override
    public void ejecutarTurno(){
        if(estadoZangano == null){
            turnosRestantesParaSerOperativo--;
            return;
        }
        estadoZangano.ejecutarTurno();
    }

    // wrapper del extractor.
    public void agregarZangano(Zangano zangano) {
        estadoZangano.agregarZangano(zangano);
    }


}
