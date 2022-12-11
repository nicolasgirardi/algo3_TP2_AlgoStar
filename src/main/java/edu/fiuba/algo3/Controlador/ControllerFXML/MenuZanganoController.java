package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Vista.Botones.Unidades.BotonUnidad;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MenuZanganoController extends UnidadMovibleController {

    @FXML
    public AnchorPane contenerdorMenu;

    @FXML
    public Button btnMutarExtractor;

    private RazaZerg razaZerg;


    @FXML
    public void onClickedMoverArriba(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        unidad.moverseArriba();
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }
    @FXML
    public void onClickedMoverAbajo(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        unidad.moverseAbajo();
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    @FXML
    public void onClickedMoverDerecha(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        unidad.moverseDerecha();
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    @FXML
    public void onClickedMoverIzquierda(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        unidad.moverseIzquierda();
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }
    @FXML
    public void onClickedMutarExtractor(MouseEvent event) {

    }

    @FXML
    public void onClickedMutarACriadero(MouseEvent event) {
        Zangano zangano = (Zangano) ubicacion.getUnidad();
        zangano.mutarCriadero(razaZerg);

    }

    @FXML
    public void onClickedMutarAEspiral(MouseEvent event) {

    }

    @FXML
    public void onClickedMutarAGuarida(MouseEvent event) {

    }

    @FXML
    public void onClickedMutarAReservaDeReproduccion(MouseEvent event) {

    }

    @Override
    public void setElements(GridPane tablero, VBox vBoxMenu , Ubicacion ubicacion, BotonUnidad botonUnidad, JuegoModelo juegoModelo) {
        super.setElements(tablero,vBoxMenu,ubicacion,botonUnidad,juegoModelo);
        this.razaZerg =  (RazaZerg) juegoModelo.getJugadorActivo().getRaza();
        if(ubicacion.getVolcan() == null){
            this.btnMutarExtractor.setVisible(false);
        }
    }

}

