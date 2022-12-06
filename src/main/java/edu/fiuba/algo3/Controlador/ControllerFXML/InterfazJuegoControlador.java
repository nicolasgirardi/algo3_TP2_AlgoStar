package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.JuegoVista;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

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
        empezarTurno();
    }

    public void empezarTurno(){
        labelMenu.setText("Es el turno del jugador " + juegoModelo.getJugadorActivo().getNombre()  );

        if(juegoModelo.getJugadorActivo().getRaza().getEntidad() == ID_RAZA.PROTOSS  ){
            cambiarHandlerSuperficieActualProtoss();
            System.out.println("Entro el turno para el jugador de protoss");
            // cambiamos todos los handleres de todos las tierra
            // cambiamos de los edifciios
            // cambiamos los handler de las unidades
            // cambiamos los handler de los recursos
        }
        else{
            cambiarHandlerSuperficieActualZerg();
            System.out.println("Entro el turno para el jugador de ZERG");

            // cambiamos todos los handleres de todos las tierra
            // cambiamos de los edifciios
            // cambiamos los handler de las unidades
            // cambiamos los handler de los recursos
        }
    }

    private void cambiarHandlerSuperficieActualZerg() {
        juegoVista.cambiarHandlerSuperficieActualZerg(vBoxMenu);
    }

    private void cambiarHandlerSuperficieActualProtoss() {
        juegoVista.cambiarHandlerSuperficieActualProtoss(vBoxMenu);
    }


    @FXML
    public void onClickTerminarTurno(MouseEvent event) {
        juegoModelo.terminarTurno();
        empezarTurno();
    }

}
