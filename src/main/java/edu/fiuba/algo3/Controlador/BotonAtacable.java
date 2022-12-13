package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.Atacante;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class BotonAtacable extends Button  {

    public BotonAtacable(String rutaImagen){
        File fileImagen = new File( rutaImagen);
        Image imagenGenerica = new Image(fileImagen.toURI().toString(), 50, 50, true, true );
        this.setMinSize(30,30);
        this.setGraphic( new ImageView(imagenGenerica) );
    }


}
