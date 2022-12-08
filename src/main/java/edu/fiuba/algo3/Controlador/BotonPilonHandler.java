package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Controlador.ControllerFXML.MenuPilonController;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;

public class BotonPilonHandler implements EventHandler<ActionEvent> {
    private  Pilon pilon;
    private  VBox vBoxMenu;

    public BotonPilonHandler(Pilon pilon, VBox vBoxMenu) {
        this.pilon = pilon;
        this.vBoxMenu = vBoxMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        BuscadorRutas buscador = new BuscadorRutas();
        try {
            FXMLLoader vistaMenu = new FXMLLoader(this.getClass().getResource(buscador.buscarRuta(RUTAS_FXML.MENU_PILON)));
            Pane vistaLayout = vistaMenu.load();
            MenuPilonController controller = vistaMenu.getController();
            // controller.setElements((Criadero) edificio,vBoxMenu,juegoModelo.getJugador1(),grPane,juegoModelo.getMapa(),TAMANIO);
            vBoxMenu.getChildren().clear();
            vBoxMenu.getChildren().addAll(vistaLayout);
        } catch (IOException e){
            e.printStackTrace();
        }



    }

}
