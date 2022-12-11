package edu.fiuba.algo3.Vista.Botones.Unidades;

import edu.fiuba.algo3.Controlador.ControllerFXML.CargadorFXML;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAtacarEnemigoController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;


public abstract class BotonUnidad extends BotonCeldaTablero {
    private BotonCeldaTablero botonSuperficie;

    public BotonUnidad(BotonCeldaTablero botonSuperficie, String rutaImagen){
        super(botonSuperficie,rutaImagen);
        this.botonSuperficie = botonSuperficie;
    }

    public void colocarSuperficie(){
        this.borrarBotonDelTablero();
        juegoModelo.subscribirseJugadorActivo(botonSuperficie);
        tablero.add(botonSuperficie,ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
    }

    public void cargarMenuEnemigo(){
        FXMLLoader vistaMenu = new FXMLLoader(this.getClass().getResource(CargadorFXML.MAP_RUTAS_FXML.get(RUTAS_FXML.MENU_ATACAR_ENEMIGO)));
        Pane layoutVista = CargadorFXML.prepararLayout(vistaMenu);
        MenuAtacarEnemigoController controller = vistaMenu.getController();
        //controller.setElements(tablero,ubicacion,(RazaProtoss) jugadorActivo.getRaza(),this);
        Pane finalLayoutVista = layoutVista;

        this.setOnAction(event -> {
            vBoxMenu.getChildren().clear();
            vBoxMenu.getChildren().addAll(finalLayoutVista);
        });
    }

}
