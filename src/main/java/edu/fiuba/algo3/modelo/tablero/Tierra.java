package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelMohoError;
import edu.fiuba.algo3.modelo.Edificio.*;

public class Tierra implements Tipo {

    public void instalar(Edificio edificio) {
        if (edificioEsZerg(edificio)) {
            throw new ConstruccionFueraDelMohoError();
        }
    }

    private boolean edificioEsZerg(Edificio edificio){
        if(edificio instanceof Criadero){
            return true;
        }
        if(edificio instanceof ReservaDeReproduccion){
            return true;
        }
        if(edificio instanceof Extractor){
            return true;
        }
        if(edificio instanceof Criadero){
            return true;
        }
        if(edificio instanceof Guarida) {
            return true;
        }
        if(edificio instanceof Espiral) {
            return true;
        }
        return false;
    }
    public void crecer(Coordenada coor,Mapa mapa,int radio){}
}
