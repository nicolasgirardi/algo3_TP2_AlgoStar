package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Recurso.Volcan;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;

public class BotonVolcan extends Button {

    public BotonVolcan( int TAMANIO){
        File volcanFile = new File("images/Volcan.png");
        Image volcanImage = new Image(volcanFile.toURI().toString(), TAMANIO,  TAMANIO, true, true );
        BackgroundImage volcanBackGro = new BackgroundImage(
                volcanImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        File fileFondo = new File("images/tierra.png");
        Image imagenTierra = new Image(fileFondo.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage fondoTierra = new BackgroundImage(
                imagenTierra,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );

        this.setBackground(new Background(fondoTierra) );
        this.setMinSize(TAMANIO, TAMANIO );
        this.setBackground( new Background(volcanBackGro) );
    }



}
