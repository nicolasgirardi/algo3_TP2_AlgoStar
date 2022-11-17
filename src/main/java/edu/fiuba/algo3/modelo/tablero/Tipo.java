package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Unidad.*;

public interface Tipo {

    public void instalar(Edificio edificio);
    public void crecer(Coordenada coor,Mapa mapa,int radio);
    public void ubicar(Unidad unaUnidad);
}