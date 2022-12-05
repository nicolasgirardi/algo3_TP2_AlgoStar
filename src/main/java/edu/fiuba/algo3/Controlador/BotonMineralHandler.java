package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonMineralHandler implements EventHandler<ActionEvent> {

    private VBox vBoxMenu;
    private NodoMineral nodoMineral;

    public BotonMineralHandler(VBox vBoxMenu, NodoMineral nodoMineral) {
        this.vBoxMenu = vBoxMenu;
        this.nodoMineral = nodoMineral;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label label = new Label("Cantidad Restante de mineral en el NodoMineral es " + nodoMineral.cantidadRecurso() );
        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(label);
    }
}
