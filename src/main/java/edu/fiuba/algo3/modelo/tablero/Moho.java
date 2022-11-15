package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Celda;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.tablero.Mapa;

import java.util.ArrayList;

public class Moho implements Tipo{


    public void instalar(Edificio edificio){}

    public void crecer(Coordenada coor,Mapa mapa,int radio){
        ArrayList<Ubicacion> ubicaciones = mapa.buscar(coor,radio);
        for(int i=0;i<ubicaciones.size();i++){
            ubicaciones.get(i).infectar();
        }
    }
}
