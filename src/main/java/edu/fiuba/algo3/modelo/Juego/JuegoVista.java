package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.Controlador.*;
import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.IDEDIFICIO;
import edu.fiuba.algo3.modelo.Unidad.Zangano;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

import java.util.HashMap;

public class JuegoVista {
    private GridPane grPane;
    private  JuegoModelo juegoModelo;
    private  final int MAPA_TAMANIO;

    private final int TAMANIO;


    public JuegoVista(JuegoModelo juegoModelo){
        if(juegoModelo == null){
            System.out.println("HUBO ERROR");
        }
        grPane = new GridPane();
        this.juegoModelo = juegoModelo;
        MAPA_TAMANIO = this.juegoModelo.dimensionTablero();
        TAMANIO = (880/MAPA_TAMANIO) +1;

    }

    public void iniciar(VBox vBoxMenu){
        //grPane.setBackground( new Background(new BackgroundFill( Color.rgb(65, 40, 27, 1) , CornerRadii.EMPTY, Insets.EMPTY) ) );
        for(int i = 0; i <= MAPA_TAMANIO; i++){
            for(int j = 0; j <= MAPA_TAMANIO; j++){
                try {
                    Ubicacion ubicacion = juegoModelo.buscar(new Coordenada(i,j));
                    if( !ubicacion.existeRecurso() && !ubicacion.existeEdificio()){
                        BotonGenerico botonSuperficie = new BotonGenerico(TAMANIO,"images/tierra.png", ubicacion);
                        botonSuperficie.setMinSize(TAMANIO, TAMANIO );
                        botonSuperficie.setOnAction(new BotonTierraHandler(vBoxMenu));
                        grPane.add(botonSuperficie, i, j);
                    } else if (ubicacion.existeRecurso() ){
                        agregarBotonRecurso(ubicacion, i, j, vBoxMenu);
                    } else if (ubicacion.existeEdificio() ){
                        agregarEdificioInicial(ubicacion, i, j, vBoxMenu);
                    } else if(ubicacion.existeUnidad()){
                        agregarUnidadInicial(ubicacion,i,j,vBoxMenu);
                    }

                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
        grPane.setPrefSize(1000,950);
    }

    public void actualizarMapa(VBox vBoxMenu){
        for(int i = 0; i <= MAPA_TAMANIO; i++){
            for(int j = 0; j <= MAPA_TAMANIO; j++){
                try {
                    Ubicacion ubicacion = juegoModelo.buscar(new Coordenada(i,j));
                    if (ubicacion.existeEdificio() ){
                        agregarEdificioInicial(ubicacion, i, j, vBoxMenu);
                    } else if (ubicacion.getUnidad() != null){
                        //agregarBotonUnidad();
                    }
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }


    private void agregarBotonRecurso(Ubicacion ubicacion, int i , int j, VBox vBoxMenu) {
        BotonGenerico botonRecurso;
        if( ubicacion.contieneNodoMineral() ){
            botonRecurso = new BotonGenerico(TAMANIO, "images/mineral.png", ubicacion);
            botonRecurso.setOnAction( new BotonMineralHandler(vBoxMenu, ubicacion.getNodoMineral()) );
        }
        else{
            botonRecurso = new BotonGenerico(TAMANIO, "images/Volcan.png", ubicacion);
            botonRecurso.setOnAction( new BotonVolcanHandler(vBoxMenu, ubicacion.getVolcan() ) );
        }
        grPane.add(botonRecurso,i,j);
    }

    private void agregarEdificioInicial(Ubicacion ubicacion, int i , int j, VBox vBoxMenu) {
        Edificio edificio = ubicacion.getEdificio();
        BotonGenerico botonGenerico = null;
        if( edificio.getEntidad() == IDEDIFICIO.CRIADERO ){
            botonGenerico = new BotonGenerico(TAMANIO, "images/criadero.png", ubicacion );
            botonGenerico.setOnAction( new BotonCriaderoHandler( (Criadero) edificio, vBoxMenu, juegoModelo.getJugador1(), grPane ,juegoModelo.getMapa() ) );
        }
        if( edificio.getEntidad() == IDEDIFICIO.PILON ){
            botonGenerico = new BotonGenerico(TAMANIO, "images/pilon.png", ubicacion);
            botonGenerico.setOnAction( new BotonPilonHandler( (Pilon) edificio, vBoxMenu) );
        }
        grPane.add(botonGenerico, i, j );

    }

    //nova a priori no solo ciradero y pilon
    public void mapeoDeEdificios(HashMap<IDEDIFICIO, BotonGenerico> hashMapEdificBot, Ubicacion ubicacion){
        hashMapEdificBot.put(IDEDIFICIO.CRIADERO, new BotonGenerico(TAMANIO, "images/criadero.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.EXTRACTOR, new BotonGenerico(TAMANIO, "images/extractor.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.ESPIRAL, new BotonGenerico(TAMANIO, "images/espiral.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.GUARIDA, new BotonGenerico(TAMANIO, "images/guarida.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.RESERVADEREPRODUCCION, new BotonGenerico(TAMANIO, "images/reservaDeReproduccion.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.PILON, new BotonGenerico(TAMANIO, "images/pilon.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.ACCESO, new BotonGenerico(TAMANIO, "images/acceso.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.ASIMILADOR, new BotonGenerico(TAMANIO, "images/asimilador.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.NEXOMINERAL, new BotonGenerico(TAMANIO, "images/nexo.png", ubicacion) );
        hashMapEdificBot.put(IDEDIFICIO.PUERTOESTELAR, new BotonGenerico(TAMANIO, "images/puertoEstelar.png", ubicacion) );
    }

    public void agregarContenedor(AnchorPane contenedorMapa){
        contenedorMapa.getChildren().add(grPane);
    }

    public void agregarUnidadInicial(Ubicacion ubicacion,int i,int j,VBox vBoxMenu){
        //si es zangano cambia el vbox para que tenga las opciones de zangano
        Button botonUnidad;
        if(ubicacion.getUnidad() instanceof Zangano){
            botonUnidad = new BotonGenerico(TAMANIO, "images/zangano.png", ubicacion);
            Zangano zanganito = (Zangano) ubicacion.getUnidad();
            //botonUnidad.setOnAction(new BotonZanganoHandler(zanganito, vBoxMenu,raza));//falta como saber que raza esta jugando
        }
        //si es mutalisco cambia el vbox para que tenga las opciones de mutalisco
        //si es amo supremo cambia el vbox para que tenga nada
        //si es otra cosa cambia a generico

    }

    public void cambiarHandlerSuperficieActualProtoss(VBox vBoxMenu) {
        for(int i = 0; i <= MAPA_TAMANIO; i++){
            for(int j = 0; j<= MAPA_TAMANIO; j++){
                Ubicacion ubicacion = juegoModelo.buscar(new Coordenada(i,j));
                if( ubicacion.existeRecurso() ){
                    if(ubicacion.contieneNodoMineral()) {
                        BotonGenerico botonMineral = ((BotonGenerico) findNodoDelGridPane(i,j));
                        botonMineral.setOnAction(new NodoMineralHandlerProtoss(vBoxMenu,ubicacion, botonMineral) );
                    }
                    else{
                        ((BotonGenerico) findNodoDelGridPane(i,j)).setOnAction(new VolcanHandlerProtoss(vBoxMenu,ubicacion) );
                    }
                }


                if( ! ubicacion.existeEdificio() && !ubicacion.existeRecurso() ){
                    ((BotonGenerico) findNodoDelGridPane(i,j)).setOnAction(new BotonTierraProtosHandler(vBoxMenu) );
                }
            }
        }
    }

    private Node findNodoDelGridPane(int posX, int posY) {
        for (Node node : grPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == posX && GridPane.getRowIndex(node) == posY) {
                return node;
            }
        }
        return null;
    }

    public void cambiarHandlerSuperficieActualZerg(VBox vBoxMenu) {
        for(int i = 0; i <= MAPA_TAMANIO; i++){
            for(int j = 0; j<= MAPA_TAMANIO; j++){
                Ubicacion ubicacion = juegoModelo.buscar(new Coordenada(i,j));
                if( ! ubicacion.existeEdificio() && !ubicacion.existeRecurso() ){
                    ((BotonGenerico) findNodoDelGridPane(i,j)).setOnAction(new BotonTierraHandlerZerg(vBoxMenu) );
                }
            }
        }
    }
}
