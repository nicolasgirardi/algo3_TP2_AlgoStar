package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.OtrosHandlers.MostradorAlertas;
//import edu.fiuba.algo3.Vista.Botones.BotonZealot;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonAcceso;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonDragon;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonScout;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonZealot;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Unidad.Dragon;
import edu.fiuba.algo3.modelo.Unidad.InsuficientesRecursosParaCrearUnidadError;
import edu.fiuba.algo3.modelo.Unidad.Scout;
import edu.fiuba.algo3.modelo.Unidad.Zealot;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class MenuAccesoController {
    @FXML
    public AnchorPane contenerdorMenuAcceso;

    private GridPane tablero;
    private Ubicacion ubicacion;
    private RazaProtoss razaProtoss;
    BotonAcceso botonAcceso;
    private JuegoModelo juegoModelo;



    @FXML
    public void onClickedConstruirDragon(MouseEvent event) {
        ArrayList<Ubicacion> ubicacionesManhattan =  juegoModelo.getMapa().buscar( ubicacion.coordenada(), 2);
        for(Ubicacion ubicacionMah : ubicacionesManhattan){
            if(ubicacionMah.estaLibre()){
                agregarDragon(ubicacionMah);
                break;
            }
        }
    }

    @FXML
    public void onClickedConstruirZealot(MouseEvent event) {
        ArrayList<Ubicacion> ubicacionesManhattan =  juegoModelo.getMapa().buscar( ubicacion.coordenada(), 2);
        for(Ubicacion ubicacionMah : ubicacionesManhattan){
            if(ubicacionMah.estaLibre()){
                agregarZealot(ubicacionMah);
                break;
            }
        }
    }

    @FXML
    public void onClickedConstruirScout(MouseEvent event) {
        ArrayList<Ubicacion> ubicacionesManhattan =  juegoModelo.getMapa().buscar( ubicacion.coordenada(), 2);
        for(Ubicacion ubicacionMah : ubicacionesManhattan){
            if(ubicacionMah.estaLibre()){
                agregarScout(ubicacionMah);
                break;
            }
        }

    }
    private void agregarDragon(Ubicacion ubicacionMah){
        Coordenada coordLibre = ubicacionMah.coordenada();
        try {
            Dragon dragon = new Dragon();
            razaProtoss.agregarUnidad(dragon);
            ubicacionMah.asignarUnidad(dragon);

            BotonDragon botonDragon = new BotonDragon( eliminarBotonAntiguo(coordLibre) );
            tablero.add(botonDragon, coordLibre.horizontal() , coordLibre.vertical() );
        } catch ( PoblacionExedidaError e) {
            MostradorAlertas.mostrarAlerta(e, "Construya mas pilones");
        } catch ( InsuficientesRecursosParaCrearUnidadError e){
            MostradorAlertas.mostrarAlerta(e, "No se puede crear el Dragon");
        }

    }
    private void agregarZealot(Ubicacion ubicacionMah) {
        Coordenada coordLibre = ubicacionMah.coordenada();
        try {
            Zealot zealot = new Zealot();
            razaProtoss.agregarUnidad(zealot);
            ubicacionMah.asignarUnidad(zealot);

            BotonZealot botonZealot = new BotonZealot( eliminarBotonAntiguo(coordLibre) );
            tablero.add(botonZealot, coordLibre.horizontal() , coordLibre.vertical() );
        } catch ( PoblacionExedidaError e) {
            MostradorAlertas.mostrarAlerta(e, "Construya mas pilones");
        } catch ( InsuficientesRecursosParaCrearUnidadError e){
            MostradorAlertas.mostrarAlerta(e, "No se puede crear el Zealot");
        }
    }

    private void agregarScout(Ubicacion ubicacionMah) {
        Coordenada coordLibre = ubicacionMah.coordenada();
        try {
            Scout scout = new Scout();
            razaProtoss.agregarUnidad( scout);
            ubicacionMah.asignarUnidad(scout);

            BotonScout botonScout = new BotonScout( eliminarBotonAntiguo(coordLibre) );
            tablero.add(botonScout, coordLibre.horizontal() , coordLibre.vertical() );
        } catch ( PoblacionExedidaError e) {
            MostradorAlertas.mostrarAlerta(e, "Construya mas pilones");
        } catch ( InsuficientesRecursosParaCrearUnidadError e){
            MostradorAlertas.mostrarAlerta(e, "No se puede crear el scout");
        }

    }


    BotonCeldaTablero eliminarBotonAntiguo(Coordenada coordLibre){
        BotonCeldaTablero botonAntiguo = (BotonCeldaTablero) findNodoDelGridPane(coordLibre.horizontal(), coordLibre.vertical() );
        botonAntiguo.borrarBotonDelTablero();
        return botonAntiguo;
    }


    public void setElements(GridPane tablero, Ubicacion ubicacion, RazaProtoss razaProtoss, BotonAcceso botonAcceso, JuegoModelo juegoModelo){
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.razaProtoss = razaProtoss;
        this.botonAcceso = botonAcceso;
        this.juegoModelo = juegoModelo;
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
