package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonUnidad;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonZangano;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class UnidadMovibleController {
    protected JuegoModelo juegoModelo;
    protected GridPane tablero;
    protected VBox vBoxMenu;
    protected Ubicacion ubicacion;
    protected BotonUnidad botonUnidad;


    public void setElements(GridPane tablero, VBox vBoxMenu ,Ubicacion ubicacion, BotonUnidad botonUnidad, JuegoModelo juegoModelo) {
        this.juegoModelo = juegoModelo;
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.vBoxMenu = vBoxMenu;
        this.botonUnidad = botonUnidad;
    }


    protected void moverUnidadGraficamente(Coordenada nuevaCoordenada){

        botonUnidad.colocarSuperficie();
        BotonCeldaTablero botonNuevaCordenada = (BotonCeldaTablero) findNodoDelGridPane(nuevaCoordenada.horizontal(),nuevaCoordenada.vertical());
        botonNuevaCordenada.borrarBotonDelTablero();
        BotonZangano nuevoBotonZangano = new BotonZangano(botonNuevaCordenada);
        tablero.add(nuevoBotonZangano,nuevaCoordenada.horizontal(), nuevaCoordenada.vertical());
        nuevoBotonZangano.fire();
    }

    private Node findNodoDelGridPane(int posHorizontal, int posVertical) {
        for (Node node : tablero.getChildren()) {
            if (GridPane.getColumnIndex(node) == posHorizontal && GridPane.getRowIndex(node) == posVertical) {
                return node;
            }
        }
        return null;
    }

}
/*
* botonZangano.setOnKeyPressed(keyEvent ->{
            if(keyEvent.getCode() == KeyCode.UP ){
                this.onClickedMoverArriba();
            }
            if(keyEvent.getCode() == KeyCode.DOWN ){
                this.onClickedMoverAbajo();
            }
            if(keyEvent.getCode() == KeyCode.LEFT ){
                this.onClickedMoverIzquierda();
            }
            if(keyEvent.getCode() == KeyCode.UP ){
                this.onClickedMoverArriba();
            }
        });
* */