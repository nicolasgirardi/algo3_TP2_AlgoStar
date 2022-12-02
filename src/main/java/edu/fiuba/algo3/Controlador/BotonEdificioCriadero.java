package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.Edificio;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;

public class BotonEdificioCriadero extends Button {
    private Criadero edificio;
    private  RazaZerg razaZerg;

    public BotonEdificioCriadero(Criadero edificio, RazaZerg razaZerg){
        this.edificio = edificio;
        this.razaZerg = razaZerg;
        this.setMinSize(91, 91);
        File fileFondo = new File("images/criadero.png");
        Image imagenRaza = new Image(fileFondo.toURI().toString(), 91,  91,  true,  true );

        BackgroundImage primerBackGro = new BackgroundImage(
                imagenRaza,
                BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT
        );
        this.setBackground( new Background(primerBackGro) );
    }





}
