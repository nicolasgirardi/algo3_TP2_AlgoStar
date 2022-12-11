package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuVolcanProtossController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuVolcanZergController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;

public class BotonRecursoVolcan extends BotonCeldaTablero {

    public BotonRecursoVolcan(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu, GridPane tablero, JuegoModelo juegoModelo) {
        super(TAMANIO, "images/Volcan.png", ubicacion,vBoxMenu,tablero,juegoModelo);
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {
        ID_RAZA raza = jugadorActivo.getRaza().getEntidad();
        if(raza.equals(ID_RAZA.PROTOSS)){
            FXMLLoader vistaMenu = new FXMLLoader(this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_VOLCAN_PROTOSS)));
            Pane layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuVolcanProtossController controller = vistaMenu.getController();
            controller.setElements(tablero,ubicacion,(RazaProtoss) jugadorActivo.getRaza(),this);
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

