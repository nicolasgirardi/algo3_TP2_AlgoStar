package edu.fiuba.algo3.modelo.Unidad;

import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.Atacante;
import edu.fiuba.algo3.modelo.Ataque.Ataque;
import edu.fiuba.algo3.modelo.HitPoints.HitPoints;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;

public abstract class  Unidad implements Atacable, Atacante {
    protected HitPoints hp;
    private TipoSuperficie tipoSuperficie;
    private Ubicacion ubicacion;
    private int rango;
    private Ataque ataque;

    protected int costoSuministro;
    protected int costoPoblacion;

    protected int turnosRestantesParaSerOperativo;

    public Unidad(HitPoints vida, int suministroNecesario){
        hp = vida;
        costoSuministro = suministroNecesario;
    }

    public void verificarUnidadOperativa() {
        if(turnosRestantesParaSerOperativo > 0 ){
            throw  new UnidadNoOperativaError();
        }
    }
    public Unidad(HitPoints vida, TipoSuperficie tipoSuperficie, Ataque ataque, int turnosRestantesParaSerOperativo, int costoPoblacion){
        hp = vida;
        this.tipoSuperficie = tipoSuperficie;
        this.ataque = ataque;
        this.turnosRestantesParaSerOperativo = turnosRestantesParaSerOperativo;
        this.costoPoblacion = costoPoblacion;
    }

    public void atacar(Atacable atacable){
        verificarUnidadOperativa();
        atacable.recibirAtaque(ataque);
    }

    public void ejecutarTurno() {
        turnosRestantesParaSerOperativo--;
    }

    public void recibirAtaque(Ataque ataque){
        tipoSuperficie.recibirAtaque(ataque, hp);
    }

    public void asignarLugar(Ubicacion unLugar){
        ubicacion=unLugar;
    }

    public void atacarSobreUbicacion(Atacable atacable){
        if(ubicacion.distancia(atacable.ubicacion())> rango){
            throw new EnemigoFueraDeRangoError();
        }
        else {
            atacar(atacable);
        }
    }
    public Ubicacion ubicacion(){
        return ubicacion;
    }
    public void asignarRango(int Rango){
        rango = Rango;
    }

    public void volar(){
        verificarUnidadOperativa();
        tipoSuperficie.volar();
    }

    public void consumirSuministro(GestionRecurso suministro){
        suministro.consumir(costoSuministro);
    }
    public void verificarSiPuedeSerCreado(int poblacion){
        if(poblacion-costoPoblacion < 0){
            throw new PoblacionExedidaError();
        }
    }


    public void disminuirPoblacion(Raza raza) {
        raza.disminuirPoblacion(costoPoblacion);
    }
}