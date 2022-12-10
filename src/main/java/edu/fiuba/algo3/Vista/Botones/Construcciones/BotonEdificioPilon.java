package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.BotonPilonHandler;
import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAtacarEnemigoController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuCriaderoController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuPilonController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.BotonTierra;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;

public class BotonEdificioPilon extends BotonCeldaTablero {

    public BotonEdificioPilon(int tamanio, Ubicacion ubicacion, VBox vBoxMenu, GridPane tablero, JuegoModelo juegoModelo) {
        super(tamanio, "images/pilon.png",ubicacion,vBoxMenu,tablero,juegoModelo);
        this.setOnAction(new BotonPilonHandler((Pilon) ubicacion.getEdificio(), vBoxMenu));
    }

    public BotonEdificioPilon(BotonTierra botonTierra) {
        super(botonTierra, "images/pilon.png");
        this.setOnAction(new BotonPilonHandler((Pilon) ubicacion.getEdificio(), vBoxMenu));
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {
        ID_RAZA raza = jugadorActivo.getRaza().getEntidad();
        FXMLLoader vistaMenu = new FXMLLoader();
        URL url = null;
        Pane layoutVista = null;

        if(raza.equals(ID_RAZA.PROTOSS)){
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_PILON));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuPilonController controller = vistaMenu.getController();
            //controller.setElements(tablero,ubicacion,(RazaProtoss) jugadorActivo.getRaza(),this);
        }else{
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_ATACAR_ENEMIGO));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuAtacarEnemigoController controller = vistaMenu.getController();
            //controller.setElements((Criadero) ubicacion.getEdificio(),vBoxMenu, tablero,juegoModelo,getTAMANIO());
        }

        Pane finalLayoutVista = layoutVista;

        this.setOnAction(event -> {
            vBoxMenu.getChildren().clear();
            vBoxMenu.getChildren().addAll(finalLayoutVista);
        });

    }
}
