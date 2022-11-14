package edu.fiuba.algo3.modelo;

public class Celda {

    private Edificio edificio;

    private Recurso recurso; //desp refactorizar y que sean recursos

    private Moho moho;
    private RangoPilon rangoPilon;


    private int posicion_x;
    private int posicion_y;


    public Celda(){
        edificio = null;
        recurso = null;

    }
    public Celda(int x, int y){
        moho = null;
        rangoPilon = null;
        this.posicion_x = x;
        this.posicion_y = y;
    }

    public Boolean estaOcupado(Moho moho) {
        if (moho.obtenerPosicion().posicion_x == posicion_x ) {
            return true;
        }
        return false;
    }

    public boolean coordenadasValidas(int minimo_x, int minimo_y, int maximo_x, int maximo_y) {
        return posicion_x >= minimo_x && posicion_x <= maximo_x &&
                posicion_y >= minimo_y && posicion_y <= maximo_y;
    }
    public void asignarRecurso(Volcan volcan) {
        recurso = volcan;

    }

    public void asignarEdifico(Edificio unEdificio){
        tirarEdificioIncorrectoError(unEdificio);
        edificio = unEdificio;
    }

    public void asignarEdificoZerg(Edificio unEdificio){
        if(moho == null) {
            throw new ConstruccionFueraDelMohoError();
        }
        edificio = unEdificio;
    }
    public void asignarEdificoProtos(Edificio unEdificio){
        if (moho == null){
            edificio = unEdificio;
        }

        if(rangoPilon == null) {
            throw new ConstruccionFueraDelRangoPilonError();
        }

        throw new ConstruccionProtoEnMohoError();

    }

    public void tirarEdificioIncorrectoError(Edificio unEdificio){

        if( verificarClases(unEdificio) ){
            throw new EdificioIncorrectoError();
        }
    }

    private boolean verificarClases(Edificio unEdificio){
        Volcan unVolcan = new Volcan();
        Asimilador unAsimilador = new Asimilador(unVolcan);
        Extractor unExtractor = new Extractor(new Volcan());
        return ( recurso.getClass() == unVolcan.getClass() && unEdificio.getClass() != unAsimilador.getClass() && unEdificio.getClass() != (unExtractor.getClass()));
    }

    public void asignarMoho(Criadero unCriadero, Celda unaCelda) {
        int baldosas = 1;
        if (edificio == null){
            baldosas = 5;
        }
        for (int i = 1; i <= baldosas; i++ ){
            posicion_x = unaCelda.posicion_x + 1;
            posicion_y = unaCelda.posicion_y + 1;
            Celda celda = new Celda(posicion_x ,posicion_y);
            Moho unMoho = new Moho();
            edificio = unCriadero;
            moho = unMoho;

        }
    }
    public void asignarRangoPilon(Pilon unPilon, Celda unaCelda){
        int baldosas = 3;
        for (int i = 1; i <= baldosas; i++ ){
            posicion_x = unaCelda.posicion_x + 1;
            posicion_y = unaCelda.posicion_y + 1;
            Celda celda = new Celda(posicion_x ,posicion_y);
            RangoPilon unRangoPilon = new RangoPilon();
            edificio = unPilon;
            rangoPilon = unRangoPilon;

        }

    }

    public boolean vacio(){
        if (this.moho == null){
            return true;
        }
        return false;
    }

    private int obtenerPosicionY() {
        return posicion_y;
    }

    public int obtenerPosicionX() {
        return posicion_x;
    }

}
