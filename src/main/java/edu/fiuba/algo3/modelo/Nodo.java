package edu.fiuba.algo3.modelo;

public class Nodo {
    private Nodo norte;
    private Nodo sur;
    private Nodo noreste;
    private Nodo sureste;
    private Nodo noroeste;
    private Nodo suroeste;
    private Ubicacion ubicacion;


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
}
