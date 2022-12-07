package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.Vista.BotonZangano;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class BotonEvolucionarAZanganoHandler implements EventHandler<ActionEvent> {

    private Criadero criadero;
    private Raza raza;
    private GridPane gridPane;
    private Mapa mapa;
    private int tamanio;
    private Label labelLarvas;

    public BotonEvolucionarAZanganoHandler(Criadero criadero, Jugador jugador, GridPane gridPane, Mapa mapa, int tamanio, Label labelLarvas){
        this.criadero = criadero;
        this.raza = jugador.getRaza();
        this.gridPane = gridPane;
        this.mapa = mapa;
        this.tamanio = tamanio;
        this.labelLarvas = labelLarvas;
    }
    @Override
    public void handle(ActionEvent actionEvent) {

        try{
            criadero.evolucionarLarva();
            boolean agregado = false;
            for(int i = 0; i < mapa.getDimension() ; i++){
                for(int j = 0; j < mapa.getDimension(); j++){
                    if( mapa.buscar(new Coordenada(i,j)).ubicacionVacia() && (!agregado)){
                        mapa.buscar(new Coordenada(i,j)).asignarUnidad(raza.getUltimaUnidad());
                        BotonZangano botonZangano = new BotonZangano(tamanio);
                        botonZangano.setMinSize(tamanio, tamanio );
                        //botonZangano.setOnAction(new botonZanganoHandler);
                        gridPane.add(botonZangano, i, j);
                        agregado = true;
                    }
                }
            }
            labelLarvas.setText("Cantidad de larvas: " + String.valueOf( criadero.getCantidadLarvas() ) + "\n");
        }catch (IndexOutOfBoundsException e){   //si en el criadero no hay mas larvas para evolucionar
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("El criadero no tiene larvas");
            alert.showAndWait();
        }

    }
}
