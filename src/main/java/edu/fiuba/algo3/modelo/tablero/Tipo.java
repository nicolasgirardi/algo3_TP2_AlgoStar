package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Edificio.Edificio;

public interface Tipo {

    public void instalar(Edificio edificio);
    public void crecer(Coordenada coor,Mapa mapa,int radio);
}
