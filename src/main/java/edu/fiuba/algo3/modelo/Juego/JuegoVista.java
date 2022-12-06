package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.Controlador.*;
import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.IDEDIFICIO;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        // Tierra
        //grPane.setBackground( new Background(new BackgroundFill( Color.rgb(65, 40, 27, 1) , CornerRadii.EMPTY, Insets.EMPTY) ) );
        for(int i = 0; i <= MAPA_TAMANIO; i++){
            for(int j = 0; j <= MAPA_TAMANIO; j++){
                try {
                    Ubicacion ubicacion = juegoModelo.buscar(new Coordenada(i,j));
                    if( !ubicacion.existeRecurso() && !ubicacion.existeEdificio()){
                        BotonGenerico botonTierra = new BotonGenerico(TAMANIO,"images/tierra.png", ubicacion);
                        botonTierra.setMinSize(TAMANIO, TAMANIO );
                        botonTierra.setOnAction(new BotonTierraHandler(vBoxMenu));
                        grPane.add(botonTierra, i, j);
                    } else if (ubicacion.existeRecurso() ){
                        agregarBotonRecurso(ubicacion, i, j, vBoxMenu);
                    } else if (ubicacion.existeEdificio() ){
                        agregarBotonEdificio(ubicacion, i, j, vBoxMenu);
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
                        agregarBotonEdificio(ubicacion, i, j, vBoxMenu);
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
        if( ubicacion.contieneNodoMineral() ){
            BotonGenerico botonMineral = new BotonGenerico(TAMANIO, "images/mineral.png", ubicacion);
            botonMineral.setOnAction(new BotonMineralHandler(vBoxMenu, ubicacion.getNodoMineral() ) );
            grPane.add(botonMineral, i, j);
        }
        else{
            BotonGenerico botonVolcan = new BotonGenerico(TAMANIO, "images/Volcan.png", ubicacion);
            botonVolcan.setOnAction( new BotonVolcanHandler(vBoxMenu, ubicacion.getVolcan() ) );
            grPane.add( botonVolcan, i, j);
        }

    }

    private void agregarBotonEdificio(Ubicacion ubicacion, int i , int j, VBox vBoxMenu) {
        Edificio edificio = ubicacion.getEdificio();
        HashMap<IDEDIFICIO, BotonGenerico> hashMapEdificBot = new HashMap<>();

        mapeoDeEdificios(hashMapEdificBot, ubicacion);

        HashMap<IDEDIFICIO, EventHandler<ActionEvent> > hashMapHandlers = new HashMap<>();

        hashMapHandlers.put( IDEDIFICIO.CRIADERO, new BotonCriaderoHandler( ubicacion.getCriadero(), vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.PILON, new BotonPilonHandler( ubicacion.getPilon(), vBoxMenu ) );
        /*
        hashMapHandlers.put( IDEDIFICIO.EXTRACTOR, new BotonExtractorHandler( (Extractor) edificio, vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.ESPIRAL, new BotonEspiralHandler( (Espiral) edificio, vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.GUARIDA, new BotonGuaridaHandler( (Guarida) edificio, vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.RESERVADEREPRODUCCION, new BotonReservaDeReproduccionHandler( (ReservaDeReproduccion) edificio, vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.ACCESO, new BotonAccesoHandler( (Acceso) edificio, vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.ASIMILADOR, new BotonAsimiladorHandler( (Asimilador) edificio, vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.NEXOMINERAL, new BotonNexoMineralHandler( (NexoMineral) edificio, vBoxMenu ) );
        hashMapHandlers.put( IDEDIFICIO.PUERTOESTELAR, new BotonPuertoEstelarHandler( (PuertoEstelar) edificio, vBoxMenu ) );
        */
        BotonGenerico botonGenerico = hashMapEdificBot.get(edificio.getEntidad());
        botonGenerico.setOnAction( hashMapHandlers.get(edificio.getEntidad() ) );
        grPane.add(botonGenerico, i, j );

    }

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

}
