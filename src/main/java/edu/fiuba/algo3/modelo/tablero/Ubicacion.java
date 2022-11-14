package edu.fiuba.algo3.modelo.tablero;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.Recurso.Recurso;;

public class Ubicacion {
    private Edificio edificio;
    private Recurso recurso;
    //private Tipo tipo;
    private Coordenada coor;

    public Ubicacion(Coordenada coordenada){
        coor = coordenada;
    }
/*
    public void ubicar(Edificio Edificio){
        edificio = Edificio;
        edificio.ubicar(this);
    }
    public void desalojar(){
        edificio.desalojar();
        edificio = null;
    }


 */
}