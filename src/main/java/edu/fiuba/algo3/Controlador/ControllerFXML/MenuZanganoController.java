package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonExtractor;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonUnidad;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.TIPOSUPERFICIE;
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

    @FXML
    public Button btnMutarACriadero;

    @FXML
    public Button btnMutarAEspiral;

    @FXML
    public Button btnMutarAGuarida;

    @FXML
    public Button btnMutarAReserva;

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
    //TODO: revisar si se agregann correctamente los edificios al modelo
    @FXML
    public void onClickedMutarExtractor(MouseEvent event) {

        Zangano zangano = (Zangano) ubicacion.getUnidad();
        zangano.mutarExtractor(razaZerg);

        botonUnidad.borrarBotonDelTablero();
        BotonExtractor botonExtractor = new BotonExtractor(botonUnidad);
        tablero.add(botonExtractor, ubicacion.coordenada().horizontal(), ubicacion.coordenada().vertical() );
    }

    @FXML
    public void onClickedMutarACriadero(MouseEvent event) {

        Zangano zangano = (Zangano) ubicacion.getUnidad();
        zangano.mutarCriadero(razaZerg);

    }

    @FXML
    public void onClickedMutarAEspiral(MouseEvent event) {
        Zangano zangano = (Zangano) ubicacion.getUnidad();
        zangano.mutarEspiral(razaZerg);
    }

    @FXML
    public void onClickedMutarAGuarida(MouseEvent event) {
        Zangano zangano = (Zangano) ubicacion.getUnidad();
        zangano.mutarGuarida(razaZerg);
    }

    @FXML
    public void onClickedMutarAReservaDeReproduccion(MouseEvent event) {
        Zangano zangano = (Zangano) ubicacion.getUnidad();
        zangano.mutarReservaReproduccion(razaZerg);
    }

    @Override
    public void setElements(GridPane tablero, VBox vBoxMenu , Ubicacion ubicacion, BotonUnidad botonUnidad, JuegoModelo juegoModelo) {
        super.setElements(tablero,vBoxMenu,ubicacion,botonUnidad,juegoModelo);
        this.razaZerg =  (RazaZerg) juegoModelo.getJugadorActivo().getRaza();

        if(ubicacionTieneMoho()){
            this.btnMutarACriadero.setDisable(false);
            this.btnMutarAEspiral.setDisable(false);
            this.btnMutarAGuarida.setDisable(false);
            this.btnMutarAReserva.setDisable(false);

            if(ubicacion.existeRecurso()){
                this.btnMutarACriadero.setDisable(true);
                this.btnMutarAEspiral.setDisable(true);
                this.btnMutarAGuarida.setDisable(true);
                this.btnMutarAReserva.setDisable(true);
            }
           if(ubicacion.getVolcan() != null){
               this.btnMutarExtractor.setDisable(false);
           }

        }

    }

    private boolean ubicacionTieneMoho(){
        return ubicacion.getTipoSuperficie().equals(TIPOSUPERFICIE.MOHO);
    }

}

