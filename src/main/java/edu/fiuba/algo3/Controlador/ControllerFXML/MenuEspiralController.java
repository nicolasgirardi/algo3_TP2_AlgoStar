package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.modelo.Edificio.Zerg.Espiral;
import edu.fiuba.algo3.modelo.Edificio.Zerg.ReservaDeReproduccion;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class MenuEspiralController {
    @FXML
    public Button btnEvolucionarLarvaAMutalisco;
    private Espiral espiral;
    private JuegoModelo juegoModelo;
    private GridPane tablero;
    @FXML
    public void onClickEvolucionarLarvaAMutalisco(MouseEvent mouseEvent) {
        System.out.println("SE CREARIA EL MUTALISCO");
    }

    public void setElements(Espiral espiral, GridPane tablero, JuegoModelo juegoModelo) {
        this.espiral = espiral;
        this.juegoModelo = juegoModelo;
        this.tablero = tablero;
    }
}
