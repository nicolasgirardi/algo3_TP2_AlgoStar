package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.modelo.Juego.JuegoVista;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class InterfazJuegoControlador{

    @FXML
    public Button btnAccion1;

    @FXML
    public Button btnAccion10;

    @FXML
    public Button btnAccion11;

    @FXML
    public Button btnAccion12;

    @FXML
    public Button btnAccion2;

    @FXML
    public Button btnAccion3;

    @FXML
    public Button btnAccion4;

    @FXML
    public Button btnAccion5;

    @FXML
    public Button btnAccion6;

    @FXML
    public Button btnAccion7;

    @FXML
    public Button btnAccion8;

    @FXML
    public Button btnAccion9;

    @FXML
    public AnchorPane contenedorMapa;

    @FXML
    public VBox vBoxMenu;

    @FXML
    public Button btnTerminarTurno;
    @FXML
    public Label labelMenu;

    @FXML
    public void btnTerminarTurno(ActionEvent event) {
        juegoVista.actualizarMapa(vBoxMenu);
    }

    private JuegoModelo juegoModelo;

    private JuegoVista juegoVista;

    private double contador;


    public void setJuego(JuegoModelo juegoModelo){
        this.juegoModelo = juegoModelo;
        contador = 0;
    }

    public void inicializar(){
        JuegoVista juegoVista = new JuegoVista(juegoModelo);
        juegoVista.iniciar(vBoxMenu);
        juegoVista.agregarContenedor(contenedorMapa);
        this.juegoVista = juegoVista;
        empiezaTurnoJugador1();
    }
    public void empiezaTurnoJugador1(){
        labelMenu.setText("Es el turno del jugador 1");
    }


    @FXML
    public void onClickTerminarTurno(MouseEvent event) {
        if(contador % 2 == 0){
            empiezaTurnoJugador1();
        }
        else empiezaTurnoJugador2();
        contador++;
    }

    public void empiezaTurnoJugador2(){
        labelMenu.setText("Es el turno del jugador 2");
        Button nexoMineral = new Button("Construir NexoMineral");
        Button pilon = new Button("Construir Pilon");
        Button asimilador = new Button("Construir Asimilador");
        Button acceso = new Button("Construir Acceso");
        Button puertoEstelar = new Button("Construir Puerto Estelar");
        //VBox vBox = new VBox(nexoMineral, pilon, asimilador, acceso, puertoEstelar);
        //vBox.getChildren().addAll(vBox);

    }


}
