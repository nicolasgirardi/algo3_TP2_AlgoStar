package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuMohoZergController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Observers.ObservadorJugadorActivo;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;

public class BotonMoho extends BotonCeldaTablero {

    public BotonMoho(BotonCeldaTablero botonCeldaTablero) {
        super(botonCeldaTablero, "images/moho.png");
        juegoModelo.subscribirseJugadorActivo(this);
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {
        this.setOnAction(event -> {
            vBoxMenu.getChildren().clear();
        });
    }
        /*ID_RAZA raza = jugadorActivo.getRaza().getEntidad();
        FXMLLoader vistaMenu = new FXMLLoader();
        URL url = null;
        Pane layoutVista = null;

        if(raza.equals(ID_RAZA.PROTOSS)){
            this.setOnAction(event -> {
                vBoxMenu.getChildren().clear();
            });
        }else{
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_MOHO_ZERG));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuMohoZergController controller = vistaMenu.getController();
            controller.setElements(this.tablero,ubicacion,(RazaZerg) jugadorActivo.getRaza(),this, juegoModelo.getMapa());
            Pane finalLayoutVista = layoutVista;
            this.setOnAction(event -> {
                vBoxMenu.getChildren().clear();
                vBoxMenu.getChildren().addAll(finalLayoutVista);
            });
        }
    }*/
}
