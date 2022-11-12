package edu.fiuba.algo3.modelo;



public class Mapa {
    private Nodo nodoPrincipal;

    //

    public Mapa(int base, int altura) {
        nodoPrincipal = new Nodo();
        Nodo nodo = nodoPrincipal;
        Nodo nodoAux = nodoPrincipal;
        for (int j = 1; j <= altura; j++) {
            for (int i = 1; i <= base; i++) {
                if (i % 2 != 0) {
                    nodo.asignarSurEste(new Nodo());
                    nodo.SurEste().asignarSurOeste(nodo);
                    if (nodo.NorOeste() != null) {
                        nodo.SurEste().asignarNorte(nodo.NorOeste());
                        nodo.NorOeste().asignarSur(nodo.SurEste());
                    }
                    nodo = nodo.SurEste();
                } else {
                    nodo.asignarNorEste(new Nodo());
                    nodo.NorEste().asignarSurOeste(nodo);
                    if (nodo.Norte() != null) {
                        nodo.Norte().asignarSurEste(nodo.NorOeste());
                        nodo.NorOeste().asignarNorOeste(nodo.Norte());
                        nodo.Norte().NorOeste().asignarSur(nodo.NorOeste());
                        nodo.NorOeste().asignarNorte(nodo.Norte().NorOeste());
                        if(i < base) {
                            nodo.Norte().NorOeste().SurEste().asignarSurOeste(nodo.NorOeste());
                            nodo.NorOeste().asignarNorEste(nodo.Norte().NorOeste().SurEste());
                        }
                    }
                    nodo = nodo.NorEste();
                }
            }
            if(j < altura ) {
                nodoAux.asignarSur(new Nodo());
                nodoAux.Sur().asignarNorte(nodoAux);
                nodoAux.SurEste().asignarSurOeste(nodoAux.Sur());
                nodoAux.Sur().asignarSurOeste(nodoAux.SurEste());
                nodo = nodoAux.Sur();
            }
        }
    }
    public Ubicacion ubicacion(int horizontal,int vertical){
        Nodo nodo = nodoPrincipal;
        for (int i= 0;i < horizontal;i++) {
            if(i%2 == 0){
                nodo = nodo.SurEste();
            }
            else{
                nodo = nodo.NorOeste();
            }
        }
        for(int i = 0;i < vertical;i++){
            nodo = nodo.Sur();
        }
        return nodo.ubicacion();
    }

}