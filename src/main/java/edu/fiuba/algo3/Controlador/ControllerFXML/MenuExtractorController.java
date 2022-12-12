package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.OtrosHandlers.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonExtractor;
import edu.fiuba.algo3.modelo.Edificio.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Edificio.ExtractorCantidadMaximaDeZanganosError;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Extractor;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class MenuExtractorController {

    @FXML
    public AnchorPane contenerdorMenu;

    @FXML
    public Button btnAgregarZangano;

    private BotonCeldaTablero botonCeldaTablero;

    private GridPane tablero;

    private Ubicacion ubicacion;
    private JuegoModelo juegoModelo;

    public void setElements(GridPane tablero, Ubicacion ubicacion, BotonCeldaTablero botonCeldaTablero, JuegoModelo juegoModelo){
        this.botonCeldaTablero = botonCeldaTablero;
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.juegoModelo = juegoModelo;
    }

    @FXML
    public void  onClickedExtraerGas(MouseEvent event) {
        Extractor extractorActual = (Extractor) ((Zangano) ubicacion.getUnidad()).getEstadoZangano();
        GestionRecurso gestionRecurso = extractorActual.extraer( ubicacion.getVolcan() );
        juegoModelo.getJugadorActivo().getRaza().aumentarGas(gestionRecurso);
    }

    @FXML
    public void onClickedAgregarZangano(MouseEvent event) {

        Extractor extractorActual = (Extractor) ((Zangano) ubicacion.getUnidad()).getEstadoZangano();
        int contador = 0;
        ArrayList<Ubicacion>  ubicacionesManhattan =  juegoModelo.getMapa().buscar( this.ubicacion.coordenada(), 1);
        for(Ubicacion ubicacionAdy : ubicacionesManhattan){
            if( ubicacionAdy.existeZangano(this.ubicacion) ){
                agregarZangano(  (Zangano) ubicacionAdy.getUnidad(), extractorActual, ubicacionAdy );
                contador++;
            }
        }
        if(contador == 0) System.out.println("No hay zanganos ");

    }

    void agregarZangano(Zangano zanganoAdyacente, Extractor extractor, Ubicacion ubicacionAdy ){
        try{
            extractor.agregarZangano(zanganoAdyacente);
            Coordenada coordenadaAdy = ubicacionAdy.coordenada();
            BotonCeldaTablero botonCoordAntigua = (BotonCeldaTablero) findNodoDelGridPane(coordenadaAdy.horizontal(), coordenadaAdy.vertical());
            ubicacionAdy.quitarUnidad();
            botonCoordAntigua.borrarBotonDelTablero();

            //ver eliminar un zangano y poner moho o tierra segun corresponda
            // se queda ne n elbnaco el boton dodne estaba el zangano falta ponerle la superficie.
        } catch (EdificioNoOperativoError | ExtractorCantidadMaximaDeZanganosError e){
            MostradorAlertas.mostrarAlerta(e);
        }


    }


    private Node findNodoDelGridPane(int posHorizontal, int posVertical) {
        for (Node node : tablero.getChildren()) {
            if (GridPane.getColumnIndex(node) == posHorizontal && GridPane.getRowIndex(node) == posVertical) {
                return node;
            }
        }
        return null;
    }

}
