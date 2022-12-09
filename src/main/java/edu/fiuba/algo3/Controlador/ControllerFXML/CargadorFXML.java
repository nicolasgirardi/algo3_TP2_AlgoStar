package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.HashMap;

public class CargadorFXML {
    static public HashMap<RUTAS_FXML,String> MAP_RUTAS_FXML;

    static{
        MAP_RUTAS_FXML = new HashMap<>();
        MAP_RUTAS_FXML.put(RUTAS_FXML.INTERFACE_JUEGO, "/VistaFxml/interfazJuego.fxml");
        MAP_RUTAS_FXML.put(RUTAS_FXML.MENU_CRIADERO, "/VistaFxml/MenuCriadero.fxml");
        MAP_RUTAS_FXML.put(RUTAS_FXML.MENU_PILON, "/VistaFxml/MenuPilon.fxml");
        MAP_RUTAS_FXML.put(RUTAS_FXML.MENU_NODO_MINERAL_PROTOSS, "/VistaFxml/Menus/NodoMineral/MenuNodoMineralProtoss.fxml");
        MAP_RUTAS_FXML.put(RUTAS_FXML.MENU_NODO_MINERAL_ZERG, "/VistaFxml/Menus/NodoMineral/MenuNodoMineralZerg.fxml");
        MAP_RUTAS_FXML.put(RUTAS_FXML.MENU_VOLCAN_PROTOSS, "/VistaFxml/Menus/Volcan/MenuVolcanProtoss.fxml");
        MAP_RUTAS_FXML.put(RUTAS_FXML.MENU_VOLCAN_ZERG, "/VistaFxml/Menus/Volcan/MenuVolcanZerg.fxml");
    }


    public static Pane prepararLayout(FXMLLoader fxmlLoader){
        Pane pane = null;
        try {
            pane = fxmlLoader.load();
        }catch (IOException e){
            e.printStackTrace();
        }

        return pane;
    }
}
