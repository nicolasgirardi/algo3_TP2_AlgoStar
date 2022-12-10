package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAccesoController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAsimiladorController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAtacarEnemigoController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class BotonAsimilador extends BotonCeldaTablero {
    public BotonAsimilador(BotonCeldaTablero botonCeldaTablero) {
        super(botonCeldaTablero, "images/asimilador.png");
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {
        ID_RAZA raza = jugadorActivo.getRaza().getEntidad();
        FXMLLoader vistaMenu = new FXMLLoader();
        URL url = null;
        Pane layoutVista = null;

        if(raza.equals(ID_RAZA.PROTOSS)){
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_ASIMILADOR));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuAsimiladorController controller = vistaMenu.getController();
            //controller.setElements(tablero,ubicacion,(RazaProtoss) jugadorActivo.getRaza(),this);

        }else{
            url = this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_ATACAR_ENEMIGO));
            vistaMenu.setLocation(url);
            layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuAtacarEnemigoController controller = vistaMenu.getController();

        }


        Pane finalLayoutVista = layoutVista;

        this.setOnAction(event -> {
            vBoxMenu.getChildren().clear();
            vBoxMenu.getChildren().addAll(finalLayoutVista);
        });

    }
}
