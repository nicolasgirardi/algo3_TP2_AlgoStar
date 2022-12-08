package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controlador.BotonMineralHandler;
import edu.fiuba.algo3.Controlador.BuscadorRutas;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuNodoMineralProtossController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Observers.ObservadorJugadorActivo;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class BotonRecursoMineral extends  BotonGenerico implements ObservadorJugadorActivo {

    private VBox vBoxMenu;
    private Ubicacion ubicacion;

    public BotonRecursoMineral(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu) {
        super(TAMANIO, "images/mineral.png", ubicacion);
        this.vBoxMenu = vBoxMenu;
        this.ubicacion = ubicacion;
        this.setOnAction(new BotonMineralHandler(vBoxMenu, ubicacion.getNodoMineral()));
    }


    @Override
    public void actualizar(Jugador jugadorActivo) {
        ID_RAZA raza = jugadorActivo.getRaza().getEntidad();
        BuscadorRutas buscador = new BuscadorRutas();
        if(raza.equals(ID_RAZA.PROTOSS)){
            this.setOnAction(event -> {
                try {
                    FXMLLoader vistaMenu = new FXMLLoader(this.getClass().getResource(buscador.buscarRuta(RUTAS_FXML.MENU_NODO_MINERAL_PROTOSS)));
                    Pane layoutVista = vistaMenu.load();
                    //MenuNodoMineralProtossController controller = vistaMenu.getController();
                    // controller.setElements(criadero,vbox,jugador,gridPane,mapa,tamanio);

                    vBoxMenu.getChildren().clear();
                    vBoxMenu.getChildren().addAll(layoutVista);
                } catch (IOException e){
                    e.printStackTrace();
                }
            });

            //Mostrar menu
            //this.setOnAction(new NodoMineralProtossHandler(vBoxMenu, ubicacion, botonMineral, juegoModelo ) );
        }else{
            this.setOnAction(event -> {
                try {
                    FXMLLoader vistaMenu = new FXMLLoader(this.getClass().getResource(buscador.buscarRuta(RUTAS_FXML.MENU_NODO_MINERAL_ZERG)));
                    Pane layoutVista = vistaMenu.load();
                    //MenuNodoMineralProtossController controller = vistaMenu.getController();
                    // controller.setElements(criadero,vbox,jugador,gridPane,mapa,tamanio);
                    vBoxMenu.getChildren().clear();
                    vBoxMenu.getChildren().addAll(layoutVista);
                } catch (IOException e){
                    e.printStackTrace();
                }
            });
        }

    }
}
