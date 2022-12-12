package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.OtrosHandlers.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonZangano;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.UnidadesRecurso.Poblacion;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MenuCriaderoController {

    @FXML
    public Button btnEvolucionarZangano;
    private VBox vBoxMenu;
    private Criadero criadero;
    private GridPane tablero;
    private int tamanio;
    private JuegoModelo juegoModelo;

    public void setElements(Criadero criadero, VBox vBoxMenu, GridPane tablero, JuegoModelo juegoModelo , int tamanio){
        this.vBoxMenu = vBoxMenu;
        this.criadero = criadero;
        this.juegoModelo = juegoModelo;
        this.tablero = tablero;
        this.tamanio = tamanio;
    }


    public void handle(ActionEvent actionEvent) {


    }

    @FXML
    public void onClickEvolucionarZangano(MouseEvent event) {
        Mapa mapa = juegoModelo.getMapa();
        Jugador jugador = juegoModelo.getJugadorActivo();
        try{
            criadero.asignarRaza(jugador.getRaza());
            criadero.evolucionarLarva();
            Zangano zangano = (Zangano) jugador.getRaza().getUltimaUnidad();

            boolean agregado = false;

            for(int i = 0; i < mapa.getDimension() ; i++){
                for(int j = 0; j < mapa.getDimension(); j++){
                    Coordenada coordenada = new Coordenada(i,j);
                    Ubicacion ubicacion = mapa.buscar(coordenada);
                    if( ubicacion.ubicacionVacia() && !agregado ) {
                        ubicacion.asignarUnidad(jugador.getRaza().getUltimaUnidad());
                        System.out.println("Ubicacion actual Creacion Zangano");
                        System.out.println("horizontal: "+ String.valueOf(ubicacion.coordenada().horizontal() ) +
                                " vertical: "+ String.valueOf(ubicacion.coordenada().vertical()));

                        BotonCeldaTablero botonCeldaTablero = null;
                        for (Node node : tablero.getChildren()) {
                            BotonCeldaTablero boton = (BotonCeldaTablero) node;
                            if(boton.getUbicacion().equals(ubicacion)) {
                                botonCeldaTablero = (BotonCeldaTablero) node;
                                break;
                            }
                        }
                        botonCeldaTablero.borrarBotonDelTablero();
                        BotonZangano botonZangano = new BotonZangano(botonCeldaTablero);
                        tablero.add(botonZangano, i, j);
                        agregado = true;
                    }
                }
            }}catch (IndexOutOfBoundsException | PoblacionExedidaError  e){   //si en el criadero no hay mas larvas para evolucionar
            MostradorAlertas.mostrarAlerta(e);
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
