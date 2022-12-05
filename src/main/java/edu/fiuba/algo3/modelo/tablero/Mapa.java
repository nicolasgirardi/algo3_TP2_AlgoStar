package edu.fiuba.algo3.modelo.tablero;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.Volcan;

import java.util.ArrayList;

public class Mapa {

    private Ubicacion[][] mapa;
    private int base;
    private int altura;

    public Mapa(int Base, int Altura) {
        mapa = new Ubicacion[Base+1][Altura+1];
        base = Base;
        altura = Altura;
        for (int i = 0; i <= Base; i++) {
            for (int j = 0; j <= Altura; j++) {
                mapa[i][j] = new Ubicacion(new Coordenada(i, j));
            }
        } // falta definir los nodos minerales y los volcanes lugares ala mtitad del mapa lo definimos apriori.
    } // si base es de 10, y altura 10 , mapa se puede acceder al 10,10 tambien.

    public Ubicacion buscar(Coordenada coordenada) {
        for (int i = 0; i <= base; i++) {
            for (int j = 0; j <= altura; j++) {
                if (coordenada.esIgual(mapa[i][j].coordenada())) {
                    return mapa[i][j];
                }
            }

        }
        throw new UbicacionFueraDelMapaError();
    }
    public ArrayList<Ubicacion> buscar(Coordenada coordenada,int radio){
        ArrayList<Ubicacion> lista = new ArrayList<Ubicacion>();
        for (int i =0;i<=base;i++){
            for (int j = 0;j<=altura;j++){
                if (coordenada.distancia(mapa[i][j].coordenada())<= radio){
                    lista.add(mapa[i][j]);
                }
            }
        }
        return lista;
    }

    public int distanciaMaxima(){
        return mapa[0][0].distancia(mapa[base][altura]);
    }
    public Ubicacion buscarOpuesto(Coordenada coor){
        return buscar(coor.opuesta(base,altura));
    }

    public void inicializarMapa() {
        Ubicacion ubicacion1 = this.buscar(new Coordenada(0,0));
        ubicacion1.darTipo(new Moho());
        this.buscar(new Coordenada(0,0)).ubicar(new Criadero());
        this.buscar(new Coordenada(0,2)).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(2,0)).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(2,2)).ubicarRecurso(new Volcan());

        this.buscar(new Coordenada(base,altura)).ubicar(new Pilon());
        this.buscar(new Coordenada(base - 2, altura)).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(base, altura - 2 )).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(base - 2, altura - 2)).ubicarRecurso(new NodoMineral());


        if(base == 15){ // es factor 2 entonces.
            agregarBasesDiagonales();
        }

        if(base == 18){  // es factor 3 entonces.
            agregarBasesDiagonales();
            this.buscar(new Coordenada(7, 0)).ubicarRecurso(new NodoMineral());
            this.buscar(new Coordenada(11, 0)).ubicarRecurso(new NodoMineral());
            this.buscar(new Coordenada(9, 2)).ubicarRecurso(new Volcan());

            this.buscar(new Coordenada(7, 18)).ubicarRecurso(new NodoMineral());
            this.buscar(new Coordenada(11, 18)).ubicarRecurso(new NodoMineral());
            this.buscar(new Coordenada(9, 16)).ubicarRecurso(new Volcan());
        }
    }

    private void agregarBasesDiagonales(){
        this.buscar(new Coordenada(0, 13)).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(2, 15)).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(0, 15)).ubicarRecurso(new Volcan());

        this.buscar(new Coordenada(13, 0)).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(15, 2)).ubicarRecurso(new NodoMineral());
        this.buscar(new Coordenada(15, 0)).ubicarRecurso(new Volcan());
    }


}
