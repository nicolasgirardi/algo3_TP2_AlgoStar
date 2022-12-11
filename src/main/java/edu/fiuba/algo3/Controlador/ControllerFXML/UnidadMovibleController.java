package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonUnidad;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonZangano;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.Unidad.UnidadNoOperativaError;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.UbicacionOcupadaError;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
        botonUnidad.setOnKeyPressed(keyEvent -> {
            Unidad unidad = ubicacion.getUnidad();
            try {

                if (keyEvent.getCode() == KeyCode.UP || keyEvent.getCode() == KeyCode.W){
                    unidad.moverseArriba();
                }
                if (keyEvent.getCode() == KeyCode.DOWN || keyEvent.getCode() == KeyCode.S){
                    unidad.moverseAbajo();
                }
                if (keyEvent.getCode() == KeyCode.RIGHT || keyEvent.getCode() == KeyCode.D){
                    unidad.moverseDerecha();
                }
                if (keyEvent.getCode() == KeyCode.LEFT || keyEvent.getCode() == KeyCode.A){
                    unidad.moverseIzquierda();
                }
            } catch (UnidadNoOperativaError | UbicacionOcupadaError e){
                MostradorAlertas.mostrarAlerta(e);
            }
            moverUnidadGraficamente(unidad.ubicacion().coordenada());

        });
    }


    protected void moverUnidadGraficamente(Coordenada nuevaCoordenada){

        botonUnidad.colocarSuperficie();
        BotonCeldaTablero botonNuevaCordenada = (BotonCeldaTablero) findNodoDelGridPane(nuevaCoordenada.horizontal(),nuevaCoordenada.vertical());
        botonNuevaCordenada.borrarBotonDelTablero();
        BotonZangano nuevoBotonZangano = new BotonZangano(botonNuevaCordenada);
        tablero.add(nuevoBotonZangano,nuevaCoordenada.horizontal(), nuevaCoordenada.vertical());
        nuevoBotonZangano.fire();
        nuevoBotonZangano.requestFocus();
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