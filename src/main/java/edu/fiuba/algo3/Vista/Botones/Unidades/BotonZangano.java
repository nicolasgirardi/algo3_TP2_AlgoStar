package edu.fiuba.algo3.Vista.Botones.Unidades;

import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Unidad.Unidad;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.io.File;

public class BotonZangano extends BotonCeldaTablero {

    private Unidad unidad;

    public BotonZangano(BotonCeldaTablero botonCeldaTablero){
        super(botonCeldaTablero,"images/zangano.png" );
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
