package edu.fiuba.algo3.modelo.tablero;

public class Nodo {

    private Nodo norte;
    private Nodo sur;
    private Nodo noreste;
    private Nodo sureste;
    private Nodo noroeste;
    private Nodo suroeste;
    private Ubicacion ubicacion;

    public Nodo(){
        norte = null;
        sur = null;
        noreste = null;
        sureste = null;
        noroeste = null;
        suroeste = null;
    }
    public void asignarNorte(Nodo Norte){
        norte = Norte;
    }
    public void asignarSur(Nodo Sur){
        sur = Sur;
    }
    public void asignarNorEste(Nodo NorEste){
        noreste = NorEste;
    }
    public void asignarNorOeste(Nodo NorOeste){
        noroeste = NorOeste;
    }
    public void asignarSurEste(Nodo SurEste){
        sureste = SurEste;
    }
    public void asignarSurOeste(Nodo SurOeste){
        suroeste = SurOeste;
    }

    public Nodo Norte(){
        return norte;
    }
    public Nodo Sur(){
        return sur;
    }
    public Nodo NorEste(){
        return noreste;
    }
    public Nodo NorOeste(){
        return noroeste;
    }
    public Nodo SurEste(){
        return sureste;
    }
    public Nodo SurOeste(){
        return suroeste;
    }

    public void crearNodos(){
        if (norte == null)
            norte = new Nodo();
        if (sur == null)
            sur = new Nodo();
        if (noreste == null)
            noreste = new Nodo();
        if (noroeste == null)
            noroeste = new Nodo();
        if (sureste == null)
            sureste = new Nodo();
        if (suroeste == null)
            suroeste = new Nodo();
        conectarNodos();
    }
    private void conectarNodos(){
        norte.asignarSurOeste(noroeste);
        norte.asignarSurEste(noreste);
        noreste.asignarNorOeste(norte);
        noreste.asignarSur(sureste);
        sureste.asignarNorte(noreste);
        sureste.asignarSurOeste(sur);
        sur.asignarNorEste(sureste);
        sur.asignarNorOeste(suroeste);
        suroeste.asignarSurEste(sur);
        suroeste.asignarNorte(noroeste);
        noroeste.asignarSur(suroeste);
        noroeste.asignarNorEste(norte);

    }
    public Ubicacion ubicacion(){
        return ubicacion;
    }
}
