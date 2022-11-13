package edu.fiuba.algo3.modelo;

public class Volcan extends Recurso{
    protected VolcanEstado estado;

    public Volcan() {
        super(5000);
        edificio = null;
        estado = new VolcanLibre();
    }

    public void ocuparVolcan(VolcanOcupado volcanOcupado) {
        if( estado.estaLibre() ){
            estado = volcanOcupado;
            return;
        }

        throw new VolcanOcupadoError();
    }


    public void agregarEdificio(Edificio edificio) {
        if(this.edificio != null){
            throw new RecursoOcupadoError();
        }
        this.edificio = edificio;
    }



}
