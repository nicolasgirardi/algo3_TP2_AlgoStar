package edu.fiuba.algo3.modelo.tablero;

public class Coordenada {

        private int horizontal;
        private int vertical;

        public Coordenada(int x,int y){
            horizontal = x;
            vertical = y;
        }
        public int distancia(Coordenada coor){

            return Math.abs(coor.horizontal-horizontal)+Math.abs(coor.vertical-vertical);
        }

        public int horizontal(){
            return horizontal;
        }

        public int vertical(){
            return vertical;
        }
        public boolean esIgual(Coordenada coor){
            if(horizontal != coor.horizontal || vertical != coor.vertical()){
                return false;
            }
            else{return true;}
        }
    }

