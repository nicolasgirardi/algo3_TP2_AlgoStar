package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.OtrosHandlers.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonUnidad;
import edu.fiuba.algo3.modelo.ID_UNIDAD;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import edu.fiuba.algo3.modelo.Unidad.UnidadNoOperativaError;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.tablero.UbicacionOcupadaError;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class MenuUnidadController extends UnidadMovibleController{

    @FXML
    public Pane contenedorPadre;

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

    public  void setElements(GridPane tablero, VBox vBoxMenu , Ubicacion ubicacion,BotonUnidad botonUnidad, JuegoModelo juegoModelo) {
        super.setElements(tablero,vBoxMenu,ubicacion,botonUnidad,juegoModelo);
        if(!ubicacion.getUnidad().esOperativo()){
            int cantidadTurnosParaSerOperativo = ubicacion.getUnidad().getTurnosRestantesParaSerOperativo();
            contenerdorMenu.getChildren().clear();
            contenerdorMenu.getChildren().addAll(cargarMenuEnConstruccion(cantidadTurnosParaSerOperativo));
            return;
        }
        aplicarMovimientoPorTeclado();
        completarEnemigosParaAtacar();
    }

    private void completarEnemigosParaAtacar(){
        int rangoAtaque = ubicacion.getUnidad().getRango();
        int i = 0;
        int j = 0;
        ArrayList<Ubicacion> ubicaciones = juegoModelo.getMapa().buscar(ubicacion.coordenada(), rangoAtaque );
        for(Ubicacion ubicacionAdy : ubicaciones){
            if( ubicacionAdy.existeUnidad() &&  ! ubicacionAdy.esIgual(ubicacion) ){
                System.out.println("Coord x " + ubicacionAdy.coordenada().horizontal() + "Coord y: " + ubicacionAdy.coordenada().vertical() );
                System.out.println("Existe unidad para atacar y esa es ");
                Unidad unidadAdy = ubicacionAdy.getUnidad();
                System.out.println(unidadAdy.getEntidad() );
                System.out.println(contenerdorMenu.getChildren().get(0).getClass());
                System.out.println(contenerdorMenu.getChildren().get(1).getClass());
                System.out.println(contenerdorMenu.getChildren().get(2).getClass());
                System.out.println(contenerdorMenu.getChildren().get(3).getClass());
                System.out.println(contenerdorMenu.getChildren().get(4).getClass());
                System.out.println(contenerdorMenu.getChildren().get(5).getClass());
                Coordenada coordenadaEnemigo = ubicacionAdy.coordenada();
                GridPane panelDeEnemigos =  (GridPane) contenerdorMenu.getChildren().get(5);
                panelDeEnemigos.add(  obtenerImagen(unidadAdy.getEntidad() ) , i, j );
                i++;
                if ( i == 3 ){
                    i = 0;
                    j++;
                }
            }
        }
    }

    private Button obtenerImagen(ID_UNIDAD entidad){
        HashMap<ID_UNIDAD,String> imagenesUnidades = new HashMap<>();
        imagenesUnidades.put(ID_UNIDAD.AMOSUPREMO, "images/amoSupremo.png");
        imagenesUnidades.put(ID_UNIDAD.HIDRALISCO, "images/hidralisco.png");
        imagenesUnidades.put(ID_UNIDAD.MUTALISCO, "images/mutalisco.png");
        imagenesUnidades.put(ID_UNIDAD.ZANGANO, "images/zangano.png");
        imagenesUnidades.put(ID_UNIDAD.ZERLING, "images/zerling.png");
        imagenesUnidades.put(ID_UNIDAD.GUARDIAN, "images/guardian.png");
        imagenesUnidades.put(ID_UNIDAD.SCOUT, "images/scout.png");
        imagenesUnidades.put(ID_UNIDAD.DEVORADOR, "images/devorador.png");
        imagenesUnidades.put(ID_UNIDAD.DRAGON, "images/dragon.png");
        imagenesUnidades.put(ID_UNIDAD.ZEALOT, "images/zealot.png");

        File fileImagen = new File(imagenesUnidades.get(entidad) );
        Image imagenGenerica = new Image(fileImagen.toURI().toString(), 50, 50, true, true );
        Button botonGenerico = new Button();
        botonGenerico.setMinSize(30,30);
        botonGenerico.setGraphic( new ImageView(imagenGenerica) );
        return botonGenerico;
    }


    private Node findNodoDelGridPane(int posX, int posY) {
        for (Node node : tablero.getChildren()) {
            if (GridPane.getColumnIndex(node) == posX && GridPane.getRowIndex(node) == posY) {
                return node;
            }
        }
        return null;
    }

}
