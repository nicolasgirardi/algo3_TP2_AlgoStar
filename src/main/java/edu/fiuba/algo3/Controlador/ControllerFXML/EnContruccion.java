package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class EnContruccion {

    public Pane cargarMenuEnConstruccion(int turnosRestantes){
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_EN_CONSTRUCCION)));
        Pane vistaFxml = CargadorFXML.prepararLayout(fxmlLoader);
        MenuEnConstruccionController menuEnConstruccionController = fxmlLoader.getController();
        menuEnConstruccionController.setElements(turnosRestantes);
        return vistaFxml;

    }
}
