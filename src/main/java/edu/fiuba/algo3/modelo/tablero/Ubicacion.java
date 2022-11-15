package edu.fiuba.algo3.modelo.tablero;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Recurso.Recurso;;

public class Ubicacion {
    private Edificio edificio;
    private Recurso recurso;
    private Tipo tipo;

    private Coordenada coor;

    public Ubicacion(Coordenada coordenada){
        coor = coordenada;
        tipo = new Tierra();
    }

    public void ubicar(Edificio Edificio){
        tipo.instalar(Edificio);
        edificio = Edificio;
        edificio.ubicar(this);
    }
    public void ubicar(Edificio Edificio,Pilon unPilon){
        tipo.instalar(Edificio);
        unPilon.enRango(this);
        edificio = Edificio;
        edificio.ubicar(this);

    }
    public void desalojar(){
        edificio.desalojar();
        edificio = null;
    }
    public void darTipo(Tipo unTipo){
        tipo = unTipo;
    }

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
}