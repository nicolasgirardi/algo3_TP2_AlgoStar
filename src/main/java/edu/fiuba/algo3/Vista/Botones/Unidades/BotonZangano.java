package edu.fiuba.algo3.Vista.Botones.Unidades;

import edu.fiuba.algo3.Controlador.BotonZanganoHandler;
import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAtacarEnemigoController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuCriaderoController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuZanganoController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;
import java.net.URL;

public class BotonZangano extends BotonCeldaTablero {

    private Unidad unidad;

    public BotonZangano(BotonCeldaTablero botonCeldaTablero){
        super(botonCeldaTablero,"images/zangano.png" );
        /*this.setOnAction(
                new BotonZanganoHandler(
                        (Zangano) juegoModelo.getJugadorActivo().getRaza().getUltimaUnidad(),
                        vBoxMenu,
                        (RazaZerg) juegoModelo.getJugadorActivo().getRaza(),
                        tablero
                ));

         */
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {
        ID_RAZA raza = jugadorActivo.getRaza().getEntidad();
        FXMLLoader vistaMenu = new FXMLLoader();
        URL url = null;
        Pane layoutVista = null;

        if(raza.equals(ID_RAZA.PROTOSS)){
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_ATACAR_ENEMIGO));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuAtacarEnemigoController controller = vistaMenu.getController();
            //controller.setElements(tablero,ubicacion,(RazaProtoss) jugadorActivo.getRaza(),this);
        }else{
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_ZANGANO));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuZanganoController controller = vistaMenu.getController();
            controller.setElements(tablero,vBoxMenu,ubicacion,this,juegoModelo);
        }

        Pane finalLayoutVista = layoutVista;

        this.setOnAction(event -> {
            vBoxMenu.getChildren().clear();
            vBoxMenu.getChildren().addAll(finalLayoutVista);
        });

    }
}
