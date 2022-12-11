package edu.fiuba.algo3.Vista.Botones.Unidades;

import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuZanganoController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;

public class BotonZangano extends BotonUnidad {

    private BotonCeldaTablero botonSuperficie;

    public BotonZangano(BotonCeldaTablero botonCeldaTablero){
        super(botonCeldaTablero,"images/zangano.png" );
        this.botonSuperficie = botonCeldaTablero;
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

        if(raza.equals(ID_RAZA.PROTOSS)){
            this.cargarMenuEnemigo();
        }else{
            FXMLLoader vistaMenu = new FXMLLoader(this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_ZANGANO)));
            Pane layoutVista = CargadorFXML.prepararLayout(vistaMenu);
            MenuZanganoController controller = vistaMenu.getController();
            controller.setElements(tablero,vBoxMenu,ubicacion,this,juegoModelo);
            Pane finalLayoutVista = layoutVista;

            this.setOnAction(event -> {
                vBoxMenu.getChildren().clear();
                vBoxMenu.getChildren().addAll(finalLayoutVista);
            });
        }


    }

}
