package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class BotonPilonHandler implements EventHandler<ActionEvent> {
    private  Pilon pilon;
    private  VBox vBoxMenu;

    public BotonPilonHandler(Pilon pilon, VBox vBoxMenu) {
        this.pilon = pilon;
        this.vBoxMenu = vBoxMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label labelPilon = new Label("Edificio Pilon");
        labelPilon.setEffect(new DropShadow(2.0, Color.BLACK));
        labelPilon.setFont(Font.font(40));
        labelPilon.setTextFill(Color.BLACK);
        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(labelPilon);

    }

}
