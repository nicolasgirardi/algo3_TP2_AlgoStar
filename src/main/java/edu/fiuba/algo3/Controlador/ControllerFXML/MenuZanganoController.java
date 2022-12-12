package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonEspiral;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonExtractor;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonGuarida;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonReservaDeReproduccion;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonUnidad;
import edu.fiuba.algo3.modelo.Edificio.CorrelativaDeConstruccionIncumplidaError;
import edu.fiuba.algo3.modelo.Edificio.Zerg.*;
import edu.fiuba.algo3.modelo.HitPoints.HPZerg;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.TIPOSUPERFICIE;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.Unidad.UnidadNoOperativaError;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.UbicacionOcupadaError;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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


    @FXML
    public Button btnEntrarEnExtractor;

    @FXML
    public Button btnExtraerMineral;

    @FXML
    public Label lblCantidadMineralNodo;

    @FXML
    public Label lblTextMineralRestante;

    private RazaZerg razaZerg;


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

        try {
            //Zangano zangano = (Zangano) ubicacion.getUnidad();
            //zangano.mutarCriadero(razaZerg);
            Criadero criadero = new Criadero();
            razaZerg.agregarEdificio(criadero);
            ubicacion.ubicar(criadero);
            botonUnidad.borrarBotonDelTablero();
            tablero.add(new BotonEspiral(botonUnidad),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        }catch ( RecursosInsuficientesError e ) {
            MostradorAlertas.mostrarAlerta(e,"un Criadero");
        } catch (Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }


    }

    @FXML
    public void onClickedMutarAEspiral(MouseEvent event) {
        Espiral espiral = new Espiral();
        try {
            //Zangano zangano = (Zangano) ubicacion.getUnidad();
            //zangano.mutarEspiral(razaZerg);
            razaZerg.agregarEdificio(espiral);
            ubicacion.ubicar(espiral);
            botonUnidad.borrarBotonDelTablero();
            tablero.add(new BotonEspiral(botonUnidad),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        }catch ( RecursosInsuficientesError e ) {
            MostradorAlertas.mostrarAlerta(e,"un Espiral");
        } catch (CorrelativaDeConstruccionIncumplidaError e){
            MostradorAlertas.mostrarAlerta(e,"Necesitas una Guarida para construir");
        } catch (Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }
    }

    @FXML
    public void onClickedMutarAGuarida(MouseEvent event) {
        try{
            Guarida guarida = new Guarida();
            razaZerg.agregarEdificio(guarida);
            //Zangano zangano = (Zangano) ubicacion.getUnidad();
            //zangano.mutarGuarida(razaZerg);
            ubicacion.ubicar(guarida);
            botonUnidad.borrarBotonDelTablero();
            tablero.add(new BotonGuarida(botonUnidad),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        } catch ( RecursosInsuficientesError e ){
            MostradorAlertas.mostrarAlerta(e,"una Guarida");
        } catch (CorrelativaDeConstruccionIncumplidaError e){
            MostradorAlertas.mostrarAlerta(e,"Necesitas una Reserva de Reproduccion para construir");
        } catch (Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }
    }

    @FXML
    public void onClickedMutarAReservaDeReproduccion(MouseEvent event) {
        try{
            //Zangano zangano = (Zangano) ubicacion.getUnidad();
            //zangano.mutarReservaReproduccion(razaZerg);
            ReservaDeReproduccion reservaDeReproduccion = new ReservaDeReproduccion();
            razaZerg.agregarEdificio(reservaDeReproduccion);
            ubicacion.ubicar(reservaDeReproduccion);
            botonUnidad.borrarBotonDelTablero();
            tablero.add(new BotonReservaDeReproduccion(botonUnidad),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());
        } catch (RecursosInsuficientesError e) {
            MostradorAlertas.mostrarAlerta(e,"una Reserva De Reproduccion");
        } catch( Exception e){
            MostradorAlertas.mostrarAlerta(e);
        }
    }

    @FXML
    public void onClickedEntrarEnExtractor(MouseEvent event) {
        Extractor extractor = (Extractor) ubicacion.getEdificio();
        Zangano zangano = (Zangano) ubicacion.getUnidad();
        extractor.agregarZangano(zangano);
        botonUnidad.borrarBotonDelTablero();
    }

    @FXML
    public void onClickedExtraerMineral(MouseEvent event) {
        Zangano zangano = (Zangano) ubicacion.getUnidad();
        NodoMineral nodoMineral = ubicacion.getNodoMineral();
        GestionRecurso mineralExtraido = zangano.extraerMineral(nodoMineral);
        razaZerg.aumentarMineral(mineralExtraido);
        this.lblCantidadMineralNodo.setText(String.valueOf(nodoMineral.cantidadRecurso()));
        botonUnidad.requestFocus();
    }


    private boolean ubicacionTieneMoho(){
        return ubicacion.getTipoSuperficie().equals(TIPOSUPERFICIE.MOHO);
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
        NodoMineral nodoMineral = ubicacion.getNodoMineral();
        if(nodoMineral != null){
            this.btnExtraerMineral.setDisable(false);
            this.lblTextMineralRestante.setVisible(true);
            this.lblCantidadMineralNodo.setVisible(true);
            this.lblCantidadMineralNodo.setText(String.valueOf(nodoMineral.cantidadRecurso()));
        }


        // falta ver el extractor

    }

}

