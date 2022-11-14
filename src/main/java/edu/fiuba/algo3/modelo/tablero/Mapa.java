package edu.fiuba.algo3.modelo.tablero;

public class Mapa {

    private Ubicacion[][] mapa;

    public Mapa(int Base,int Altura) {
        mapa = new Ubicacion[Base][Altura];
        for(int i = 0;i<Base;i++){
            for(int j = 0;j<Altura;j++){
                mapa[i][j] = new Ubicacion(new Coordenada(i,j));
            }
        }
    }
    public void buscar(Coordenada coordenada){

    }

}