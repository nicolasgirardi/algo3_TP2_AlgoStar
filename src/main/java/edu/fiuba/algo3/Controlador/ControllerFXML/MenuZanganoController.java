package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonZangano;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MenuZanganoController {

    @FXML
    public AnchorPane contenerdorMenu;

    private JuegoModelo juegoModelo;
    private GridPane tablero;
    private VBox vBoxMenu;
    private Ubicacion ubicacion;
    private BotonZangano botonZangano;
    private RazaZerg razaZerg;

    @FXML
    public void onClickedMoverArriba(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        System.out.println("Ubicacion actual Antes de mover de arriba");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        unidad.moverseArriba();
        System.out.println("Ubicacion actual Despues de mover de arriba");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }
    @FXML
    public void onClickedMoverAbajo(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        System.out.println("Ubicacion actual Antes de mover de abajo");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        unidad.moverseAbajo();
        System.out.println("Ubicacion actual Despues de mover de abajo");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    @FXML
    public void onClickedMoverDerecha(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        System.out.println("Ubicacion actual Antes de mover de derecha");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        unidad.moverseDerecha();
        System.out.println("Ubicacion actual Despues de mover de derecha");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    @FXML
    public void onClickedMoverIzquierda(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        System.out.println("Ubicacion actual Antes de mover de izquierda ");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        unidad.moverseIzquierda();
        System.out.println("Ubicacion actual despues de mover de izquierda");
        System.out.println("horizontal: "+ String.valueOf(unidad.ubicacion().coordenada().horizontal() ) +
                " vertical: "+ String.valueOf(unidad.ubicacion().coordenada().vertical()));
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    @FXML
    public void onClickedMutarACriadero(MouseEvent event) {
        Zangano zangano = (Zangano) ubicacion.getUnidad();
        zangano.mutarCriadero(razaZerg);

    }

    @FXML
    public void onClickedMutarAEspiral(MouseEvent event) {

    }

    @FXML
    public void onClickedMutarAGuarida(MouseEvent event) {

    }

    @FXML
    public void onClickedMutarAReservaDeReproduccion(MouseEvent event) {

    }

    public void setElements(GridPane tablero, VBox vBoxMenu ,Ubicacion ubicacion, BotonZangano botonZangano, JuegoModelo juegoModelo) {
        this.juegoModelo = juegoModelo;
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.vBoxMenu = vBoxMenu;
        this.botonZangano = botonZangano;
        this.razaZerg =  (RazaZerg) juegoModelo.getJugadorActivo().getRaza();
    }

    private Node findNodoDelGridPane(int posHorizontal, int posVertical) {
        for (Node node : tablero.getChildren()) {
            if (GridPane.getColumnIndex(node) == posHorizontal && GridPane.getRowIndex(node) == posVertical) {
                return node;
            }
        }
        return null;
    }
    private void moverUnidadGraficamente(Coordenada nuevaCoordenada){
        BotonCeldaTablero botonDeAbajo = (BotonCeldaTablero) findNodoDelGridPane(nuevaCoordenada.horizontal(), nuevaCoordenada.vertical() );
        botonDeAbajo.borrarBotonDelTablero();
        BotonZangano nuevoBotonZangano = new BotonZangano(botonDeAbajo);
        tablero.add(nuevoBotonZangano, nuevaCoordenada.horizontal(), nuevaCoordenada.vertical());
    }
}
