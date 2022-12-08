package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.BotonEvolucionarAZanganoHandler;
import edu.fiuba.algo3.Vista.Botones.BotonZangano;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MenuCriaderoController {

    @FXML
    public Button btnEvolucionarZangano;

    @FXML
    public Label lblCantidadLarvas;

    private VBox vBoxMenu;
    private Criadero criadero;
    private Jugador jugador;
    private GridPane tablero;
    private Mapa mapa;
    private int tamanio;

    public void setElements(Criadero criadero, VBox cajaParaRellenar, Jugador jugador, GridPane tablero, Mapa mapa, int tamanio){
        this.vBoxMenu = cajaParaRellenar;
        this.criadero = criadero;
        this.jugador = jugador;
        this.tablero = tablero;
        this.mapa = mapa;
        this.tamanio = tamanio;

        lblCantidadLarvas.setText(String.valueOf( criadero.getCantidadLarvas()));
    }


    public void handle(ActionEvent actionEvent) {


    }

    @FXML
    public void onClickEvolucionarZangano(MouseEvent event) {
        try{
            criadero.evolucionarLarva();
            boolean agregado = false;
            for(int i = 0; i < mapa.getDimension() ; i++){
                for(int j = 0; j < mapa.getDimension(); j++){
                    if( mapa.buscar(new Coordenada(i,j)).ubicacionVacia() && (!agregado)){
                        mapa.buscar(new Coordenada(i,j)).asignarUnidad(jugador.getRaza().getUltimaUnidad());
                        BotonZangano botonZangano = new BotonZangano(tamanio);
                        botonZangano.setMinSize(tamanio, tamanio );
                        //botonZangano.setOnAction(new botonZanganoHandler);
                        tablero.add(botonZangano, i, j);
                        agregado = true;
                    }
                }
            }
            lblCantidadLarvas.setText(String.valueOf( criadero.getCantidadLarvas() ));
        }catch (IndexOutOfBoundsException e){   //si en el criadero no hay mas larvas para evolucionar
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("El criadero no tiene larvas");
            alert.showAndWait();
        }
    }

}
