package edu.fiuba.algo3.modelo;

public class Volcan extends Recurso{
    protected VolcanEstado estado;

    public Volcan() {
        super(5000);
        estado = new VolcanLibre();
    }

    public void ocuparVolcan(VolcanOcupado volcanOcupado) {
        if( estado.estaLibre() ){
            estado = volcanOcupado;
            return;
        }

        throw new VolcanOcupadoError();
    }


}
