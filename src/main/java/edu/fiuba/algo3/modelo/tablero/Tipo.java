package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Unidad.*;

public interface Tipo {

    void instalar(Edificio edificio);
    void crecer(Coordenada coor,Mapa mapa,int radio);
    void ubicar(Unidad unaUnidad);
}
