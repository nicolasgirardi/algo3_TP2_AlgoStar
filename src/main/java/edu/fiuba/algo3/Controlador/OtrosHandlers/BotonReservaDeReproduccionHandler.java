package edu.fiuba.algo3.Controlador.OtrosHandlers;

import edu.fiuba.algo3.modelo.Edificio.Zerg.ReservaDeReproduccion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonReservaDeReproduccionHandler implements EventHandler<ActionEvent> {

    private ReservaDeReproduccion reservaDeReproduccion;
    private VBox vboxMenu;
    public BotonReservaDeReproduccionHandler(ReservaDeReproduccion edificio, VBox vBoxMenu) {
        this.reservaDeReproduccion = edificio;
        this.vboxMenu = vBoxMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label labelCostoZerling = new Label("Costo de crear un Zerling: 25 M");
        Button unBoton = new Button("Crear Zerling");
        unBoton.setOnAction(new BotonCrearZerlingHandler(reservaDeReproduccion));
        vboxMenu.getChildren().clear();
        vboxMenu.getChildren().addAll(labelCostoZerling, unBoton);
    }
}
