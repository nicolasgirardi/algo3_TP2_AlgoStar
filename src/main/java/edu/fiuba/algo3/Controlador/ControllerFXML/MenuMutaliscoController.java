package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.OtrosHandlers.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonCriadero;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonDevorador;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonGuardian;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonUnidad;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.UbicacionOcupadaError;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MenuMutaliscoController extends UnidadMovibleController{


    @FXML
    public AnchorPane contenerdorMenu;


    @FXML
    public void onClickedMoverArriba(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        try {
            unidad.moverseArriba();
        } catch (UnidadNoOperativaError | UbicacionOcupadaError e){
            MostradorAlertas.mostrarAlerta(e);
        }
        moverUnidadGraficamente(unidad.ubicacion().coordenada());

    }
    @FXML
    public void onClickedMoverAbajo(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        try{
            unidad.moverseAbajo();
        } catch (UnidadNoOperativaError | UbicacionOcupadaError e){
            MostradorAlertas.mostrarAlerta(e);
        }

        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    @FXML
    public void onClickedMoverDerecha(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        try{
            unidad.moverseDerecha();
        } catch( UnidadNoOperativaError | UbicacionOcupadaError e ){
            MostradorAlertas.mostrarAlerta(e);
        }
        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    @FXML
    public void onClickedMoverIzquierda(MouseEvent event) {
        Unidad unidad = ubicacion.getUnidad();
        try {
            unidad.moverseIzquierda();
        } catch (UnidadNoOperativaError | UbicacionOcupadaError e){
            MostradorAlertas.mostrarAlerta(e);
        }

        moverUnidadGraficamente(unidad.ubicacion().coordenada());
    }

    public  void setElements(GridPane tablero, VBox vBoxMenu , Ubicacion ubicacion, BotonUnidad botonUnidad, JuegoModelo juegoModelo) {
        super.setElements(tablero,vBoxMenu,ubicacion,botonUnidad,juegoModelo);
        if(!ubicacion.getUnidad().esOperativo()){
            int cantidadTurnosParaSerOperativo = ubicacion.getUnidad().getTurnosRestantesParaSerOperativo();
            cargarMenuEnConstruccion(cantidadTurnosParaSerOperativo,contenerdorMenu);
            return;
        }
        activarMovimientoPorTeclado();


    }

    @FXML
    public void onClickedGuardian(MouseEvent mouseEvent) {
        try {
            Mutalisco mutalisco = (Mutalisco) ubicacion.getUnidad();
            mutalisco.evolucionarAGuardian( (RazaZerg) juegoModelo.getJugadorZerg().getRaza());
            ubicacion.quitarUnidad();
            ubicacion.asignarUnidad( (Guardian) mutalisco.getTipoMutalisco() );

            BotonGuardian botonGuardian = new BotonGuardian(botonUnidad);
            tablero.add(botonGuardian, ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        }catch ( RecursosInsuficientesError e ) {
            MostradorAlertas.mostrarAlerta(e,"un Guardian");
        } catch ( PoblacionExedidaError e){
            MostradorAlertas.mostrarAlerta(e);
        } catch (Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }
    }

    @FXML
    public void onClickedDevorador(MouseEvent mouseEvent) {
        try {
            Mutalisco mutalisco = (Mutalisco) ubicacion.getUnidad();
            mutalisco.evolucionarDevorador( (RazaZerg) juegoModelo.getJugadorZerg().getRaza());
            ubicacion.quitarUnidad();
            ubicacion.asignarUnidad( (Devorador) mutalisco.getTipoMutalisco() );
            BotonDevorador botonDevorador = new BotonDevorador(botonUnidad);
            tablero.add(botonDevorador, ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        }catch ( RecursosInsuficientesError e ) {
            MostradorAlertas.mostrarAlerta(e,"un Guardian");
        } catch ( PoblacionExedidaError e){
            MostradorAlertas.mostrarAlerta(e);
        } catch (Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }
    }
}
