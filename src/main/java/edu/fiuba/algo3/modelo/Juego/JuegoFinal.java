package edu.fiuba.algo3.modelo.Juego;

import edu.fiuba.algo3.Controlador.BotonMineralHandler;
import edu.fiuba.algo3.Controlador.BotonVolcanHandler;
import edu.fiuba.algo3.Vista.BotonMineral;
import edu.fiuba.algo3.Vista.BotonVolcan;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;

public class JuegoFinal {
    private GridPane grPane;
    private  JuegoModelo juegoModelo;
    private  final int MAPA_TAMANIO;

    private final int TAMANIO;


    public JuegoFinal(JuegoModelo juegoModelo){
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
                    agregarBotonRecurso(ubicacion, i, j, vBoxMenu);
                    //agregarEdificio(ubicacion,i,j,vBoxMenu);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }

        grPane.setPrefSize(1000,950);
    }


    private void agregarBotonRecurso(Ubicacion ubicacion, int i , int j, VBox vBoxMenu) {
        if(!ubicacion.existeRecurso()){
            Button botonTierra = new Button();
            agregarFondoTierraInicial(botonTierra);
            botonTierra.setMinSize(TAMANIO, TAMANIO );
            grPane.add(botonTierra, i, j);
            return;
        }
        if( ubicacion.contieneNodoMineral() ){
            BotonMineral botonMineral = new BotonMineral(TAMANIO);
            botonMineral.setOnAction(new BotonMineralHandler(vBoxMenu, ubicacion.getNodoMineral() ) );
            grPane.add( botonMineral , i, j);
        }
        else{
            BotonVolcan botonVolcan = new BotonVolcan(TAMANIO);
            botonVolcan.setOnAction( new BotonVolcanHandler(vBoxMenu, ubicacion.getVolcan() ) );
            grPane.add( botonVolcan, i, j);
        }

    }

    private void agregarBotonEdificio(Ubicacion ubicacion, int i , int j) {

    }

    public void agregarContenedor(AnchorPane contenedorMapa){
        contenedorMapa.getChildren().add(grPane);
    }

    private void agregarFondoTierraInicial(Button boton){
        File fileFondo = new File("images/tierra.png");
        Image imagenTierra = new Image(fileFondo.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage fondoTierra = new BackgroundImage(
                imagenTierra,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        boton.setBackground( new Background(fondoTierra) );
    }

}
