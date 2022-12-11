package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.modelo.Edificio.Zerg.ReservaDeReproduccion;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class MenuReservaDeReproduccionController {

    @FXML
    public Button btnEvolucionarLarvaAZerling;

    private ReservaDeReproduccion reservaDeReproduccion;
    private GridPane tablero;
    private JuegoModelo juegoModelo;

    @FXML
    public void onClickEvolucionarLarvaAZangano(MouseEvent mouseEvent) {
        System.out.println("se crearia el zangano");
    }

    public void setElements(ReservaDeReproduccion reservaDeReproduccion, GridPane tablero, JuegoModelo juegoModelo){
        this.reservaDeReproduccion = reservaDeReproduccion;
        this.juegoModelo = juegoModelo;
        this.tablero = tablero;
    }
}
