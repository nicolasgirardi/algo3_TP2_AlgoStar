package edu.fiuba.algo3.modelo.Recurso;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;

public class Volcan extends Recurso{

    public Volcan() {
        super(5000);
        edificio = null;
    }

    public void agregarEdificio(Edificio edificio) {
        verificarRecursoOcupado();
        this.edificio = edificio;
    }

    @Override
    public boolean contieneNodoMineral() {
        return false;
    }


}
