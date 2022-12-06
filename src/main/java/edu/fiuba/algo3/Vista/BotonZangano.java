package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Unidad.Unidad;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;

public class BotonZangano extends Button{

    private Unidad unidad;

    public BotonZangano(int tamanio){
        this.setMinSize(91, 91);
        File fileFondo = new File("images/zangano.png");
        Image imagenRaza = new Image(fileFondo.toURI().toString(), tamanio,  tamanio,  true,  true );

        BackgroundImage primerBackGro = new BackgroundImage(
                imagenRaza,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        this.setBackground( new Background(primerBackGro) );
    }

}
