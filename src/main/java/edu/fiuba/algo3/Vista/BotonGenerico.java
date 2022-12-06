package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.TIPOSUPERFICIE;
import edu.fiuba.algo3.modelo.tablero.Tipo;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.File;
import java.util.HashMap;

public class BotonGenerico extends Button{

    public BotonGenerico(int TAMANIO, String rutaImagen, Ubicacion ubicacion){
        File mineralFile = new File(rutaImagen);

        Image imagenGenerica = new Image(mineralFile.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage mineralBackGro = new BackgroundImage(
                imagenGenerica,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );

        TIPOSUPERFICIE tiposuperficie = ubicacion.getTipoSuperficie();
        HashMap<TIPOSUPERFICIE,String> hashMapTipoSuperficie = new HashMap<>();
        hashMapTipoSuperficie.put(TIPOSUPERFICIE.MOHO, "images/moho.png");
        hashMapTipoSuperficie.put(TIPOSUPERFICIE.ESPECIAL, "images/especial.png");
        hashMapTipoSuperficie.put(TIPOSUPERFICIE.TIERRA, "images/tierra.png");

        File fileFondo = new File(hashMapTipoSuperficie.get(tiposuperficie) );

        Image imagenFondo = new Image(fileFondo.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage fondoActual = new BackgroundImage(
                imagenFondo,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        if( !rutaImagen.equals("images/tierra.png")){
            this.setGraphic(new ImageView(imagenGenerica) );
        }
        else{
            this.setGraphic(new ImageView(imagenFondo) );
        }

        this.setMinSize(TAMANIO, TAMANIO );
        this.setBackground( new Background(fondoActual) );

    }

}