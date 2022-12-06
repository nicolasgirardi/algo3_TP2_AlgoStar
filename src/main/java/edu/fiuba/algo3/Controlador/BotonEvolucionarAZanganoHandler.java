package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;

public class BotonEvolucionarAZanganoHandler implements EventHandler<ActionEvent> {

    private Criadero criadero;
    private Raza raza;
    private GridPane gridPane;
    private Mapa mapa;

    public BotonEvolucionarAZanganoHandler(Criadero criadero, Jugador jugador, GridPane gridPane, Mapa mapa){
        this.criadero = criadero;
        this.raza = jugador.getRaza();
        this.gridPane = gridPane;
        this.mapa = mapa;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        /*
        criadero.evolucionarLarva();
        for(int i = 0; i <= mapa.getDimension(); i++){
            for(int j = 0; j <= mapa.getDimension(); j++){
                if( mapa.buscar(new Coordenada(i,j)).ubicacionVacia() ){
                    mapa.buscar(new Coordenada(i,j)).asignarUnidad(raza.getUltimaUnidad());
                    BotonGenerico botonTierra = new BotonGenerico(1000,"images/tierra.png", mapa.buscar(new Coordenada(i,j)));
                    botonTierra.setMinSize(1000, 1000 );
                    //botonTierra.setOnAction(new BotonTierraHandler(vBoxMenu));
                    gridPane.add(botonTierra, i, j);
                }
            }
        }*/
    }
}
