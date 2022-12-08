package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuCriaderoController;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class BotonCriaderoHandler implements EventHandler<ActionEvent> {

    private  VBox vbox;
    private  Criadero criadero;
    private Jugador jugador;
    private GridPane gridPane;
    private Mapa mapa;
    private int tamanio;

    public BotonCriaderoHandler(Criadero criadero, VBox cajaParaRellenar, Jugador jugador, GridPane gridPane, Mapa mapa, int tamanio){
        this.vbox = cajaParaRellenar;
        this.criadero = criadero;
        this.jugador = jugador;
        this.gridPane = gridPane;
        this.mapa = mapa;
        this.tamanio = tamanio;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        FXMLLoader vistaMenu = new FXMLLoader(this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_CRIADERO)));
        Pane layoutVista = CargadorFXML.prepararLayout(vistaMenu);
        MenuCriaderoController controller = vistaMenu.getController();
        controller.setElements(criadero,vbox,jugador,gridPane,mapa,tamanio);
        vbox.getChildren().clear();
        vbox.getChildren().addAll(layoutVista);

    }
}
