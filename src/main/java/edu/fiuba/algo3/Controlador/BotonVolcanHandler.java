package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Recurso.Volcan;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonVolcanHandler implements EventHandler<ActionEvent> {
    private VBox vBoxMenu;
    private Volcan volcan;

    public BotonVolcanHandler(VBox vBoxMenu, Volcan volcan) {
        this.vBoxMenu = vBoxMenu;
        this.volcan = volcan;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label label = new Label("Cantidad Restante de gas en el volcan es " + volcan.cantidadRecurso() );
        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(label);
    }
}
