package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuNodoMineralProtossController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuTierraProtossController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Observers.ObservadorJugadorActivo;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;

public class BotonTierra extends BotonCeldaTablero {

    public BotonTierra(int TAMANIO, Ubicacion ubicacion,VBox vBoxMenu, GridPane tablero, JuegoModelo juegoModelo) {
        super(TAMANIO, "images/tierra.png", ubicacion,vBoxMenu,tablero,juegoModelo);
    }

    public BotonTierra(BotonCeldaTablero botonCeldaTablero) {
        super(botonCeldaTablero, "images/tierra.png");
    }


    @Override
    public void actualizar(Jugador jugadorActivo) {
        ID_RAZA raza = jugadorActivo.getRaza().getEntidad();
        FXMLLoader vistaMenu = new FXMLLoader();
        URL url = null;
        Pane layoutVista = null;

        if(raza.equals(ID_RAZA.PROTOSS)){
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_TIERRA_PROTOSS));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuTierraProtossController controller = vistaMenu.getController();
            controller.setElements(this.tablero,ubicacion,(RazaProtoss) jugadorActivo.getRaza(),this, juegoModelo.getMapa());
            Pane finalLayoutVista = layoutVista;
            this.setOnAction(event -> {
                vBoxMenu.getChildren().clear();
                vBoxMenu.getChildren().addAll(finalLayoutVista);
            });
        }else{
            this.setOnAction(event -> {
                vBoxMenu.getChildren().clear();
            });
        }


    }


}
