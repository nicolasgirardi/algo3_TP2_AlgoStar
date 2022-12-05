package edu.fiuba.algo3.modelo.tablero;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Recurso;;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.Unidad.*;

public class Ubicacion {
    private Edificio edificio;
    private Recurso recurso;
    private Unidad unidad;
    private Tipo tipo;
    private Coordenada coor;
    private int enRangoAmoSupremo;
    private int energizado;

    public Ubicacion(Coordenada coordenada){
        coor = coordenada;
        tipo = new Tierra();
        enRangoAmoSupremo = 0;
        energizado = 0;
    }

    public void ubicar(Edificio Edificio){

        tipo.instalar(Edificio);
        edificio = Edificio;
        edificio.ubicar(this);
    }
    public void ubicar(Pilon pilon, Mapa mapa){
        tipo.instalar(pilon);
        edificio = pilon;
        pilon.ubicarPilon(this, mapa);
    }

    public void desalojar(){
        edificio.desalojar();
        edificio = null;
    }

    public void desalojarPilon(Mapa mapa){
        Pilon aux = (Pilon) edificio;
        aux.desalojarPilon(mapa);
        edificio = null;
    }
    public void darTipo(Tipo unTipo){
        tipo = unTipo;
    }


    //calcula distancia entre 2 ubicaciones
    public int distancia(Ubicacion unaUbicacion){
        return coor.distancia(unaUbicacion.coor);
    }

    public Coordenada coordenada(){
        return coor;
    }

    public void crecer(int radio,Mapa mapa){
        tipo.crecer(coor,mapa,radio);
    }
    public void infectar(){
        if(edificio == null){
            tipo = new Moho();
        }
    }
    public void asignarUnidad(Unidad unaUnidad){
        tipo.ubicar(unaUnidad);
        unidad = unaUnidad;
        unaUnidad.asignarLugar(this);
    }

    public void asignarAmoSupremo(AmoSupremo unAmoSupremo, Mapa unMapa){
        tipo.ubicar(unAmoSupremo);
        unidad = unAmoSupremo;
        unAmoSupremo.asignarLugarAmoSupremo(this, unMapa);
    }

    public void establecerEnRangoAmoSupremo(){
        if(edificio == null){
            enRangoAmoSupremo++;
        }
    }

    public void energizar(){
        energizado++;
    }

    public void desenergizar(){
        if(energizado()){
            energizado--;
        }
    }

    public boolean estaBajoElRangoDeUnAmoSupremo(){
        return enRangoAmoSupremo > 0;
    }

    public boolean energizado(){
        return (0 < energizado);
    }

    public void ubicarRecurso(Recurso unRecurso){
        recurso = unRecurso;
    }

    public boolean existeEdificio() {
        return edificio != null;
    }

    public boolean existeRecurso() {
        return recurso != null;
    }


    public boolean contieneNodoMineral() {

        return recurso.contieneNodoMineral();
    }

    public NodoMineral getNodoMineral() {
        return (NodoMineral) recurso;
    }

    public Volcan getVolcan() {
        return (Volcan) recurso;
    }
}