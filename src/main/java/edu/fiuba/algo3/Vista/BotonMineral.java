package edu.fiuba.algo3.Vista;

import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;

public class BotonMineral extends Button{
    private VBox vBoxMenu;
    public BotonMineral(int TAMANIO){
        File mineralFile = new File("images/mineral.png");
        Image mineralImage = new Image(mineralFile.toURI().toString(),TAMANIO, TAMANIO, true, true );
        BackgroundImage mineralBackGro = new BackgroundImage(
                mineralImage,
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
        this.setBackground( new Background(mineralBackGro) );

    }

}
