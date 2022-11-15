package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Celda;
import edu.fiuba.algo3.modelo.ConstruccionFueraDelMohoError;
import edu.fiuba.algo3.modelo.ConstruccionProtoEnMohoError;
import edu.fiuba.algo3.modelo.Edificio.*;
import edu.fiuba.algo3.modelo.tablero.Mapa;

import java.util.ArrayList;

public class Moho implements Tipo{


    public void instalar(Edificio edificio){
        if (edificioEsProtos(edificio)) {
            throw new ConstruccionProtoEnMohoError();
        }
    }

    private boolean edificioEsProtos(Edificio edificio){
        if(edificio instanceof NexoMineral){
            return true;
        }
        if(edificio instanceof Pilon){
            return true;
        }
        if(edificio instanceof Asimilador){
            return true;
        }
        if(edificio instanceof Acceso){
            return true;
        }
        if(edificio instanceof PuertoEstelar) {
            return true;
        }
        return false;
    }


    public void crecer(Coordenada coor,Mapa mapa,int radio){
        ArrayList<Ubicacion> ubicaciones = mapa.buscar(coor,radio);
        for(int i=0;i<ubicaciones.size();i++){
            ubicaciones.get(i).infectar();
        }
    }
}
