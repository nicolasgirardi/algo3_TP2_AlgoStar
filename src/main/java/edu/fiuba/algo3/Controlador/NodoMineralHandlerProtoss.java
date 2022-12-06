package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class NodoMineralHandlerProtoss implements EventHandler<ActionEvent> {

    private  BotonGenerico botonMineral;
    private NodoMineral nodoMineral;
    private VBox vBoxMenu;

    public NodoMineralHandlerProtoss(VBox vBoxMenu, Ubicacion ubicacion, BotonGenerico botonMineral) {
        this.vBoxMenu = vBoxMenu;
        this.nodoMineral = ubicacion.getNodoMineral();
        this.botonMineral = botonMineral;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        NexoMineral nexoMineral = null;
        Button botonCrearNexoMineral = new Button("Construir Sobre NexoMineral");
        botonCrearNexoMineral.setOnAction( new BotonCrearNexoMineralHandler(nexoMineral, vBoxMenu, nodoMineral,botonMineral) );

        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(botonCrearNexoMineral);
    }
}
