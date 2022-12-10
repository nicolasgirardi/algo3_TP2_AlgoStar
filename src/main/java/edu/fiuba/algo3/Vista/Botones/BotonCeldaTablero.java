package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Observers.ObservadorJugadorActivo;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public abstract class BotonCeldaTablero extends BotonGenerico implements ObservadorJugadorActivo {

    protected VBox vBoxMenu;
    protected Ubicacion ubicacion;

    protected GridPane tablero;

    protected JuegoModelo juegoModelo;

    public BotonCeldaTablero(int TAMANIO, String rutaImagen, Ubicacion ubicacion, VBox vBoxMenu, GridPane tablero, JuegoModelo juegoModelo) {
        super(TAMANIO, rutaImagen, ubicacion);
        this.vBoxMenu = vBoxMenu;
        this.ubicacion = ubicacion;
        this.tablero = tablero;
        this.juegoModelo = juegoModelo;
        juegoModelo.subscribirseJugadorActivo(this);
        this.actualizar(juegoModelo.getJugadorActivo());
    }

    public BotonCeldaTablero(BotonCeldaTablero botonACopiar,  String rutaImagen) {
        super(botonACopiar.getTAMANIO(), rutaImagen, botonACopiar.ubicacion);
        this.vBoxMenu = botonACopiar.vBoxMenu;
        this.ubicacion = botonACopiar.ubicacion;
        this.tablero = botonACopiar.tablero;
        this.juegoModelo = botonACopiar.juegoModelo;
        juegoModelo.subscribirseJugadorActivo(this);
        this.actualizar(juegoModelo.getJugadorActivo());
    }

    public void borrarBotonDelTablero(){
        juegoModelo.desubscribirseJugadorActivo(this);
        vBoxMenu.getChildren().clear();
        tablero.getChildren().remove(this);
    }

}
