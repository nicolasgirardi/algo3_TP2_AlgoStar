package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.BotonPilonHandler;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.BotonTierra;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class BotonEdificioPilon extends BotonCeldaTablero {

    public BotonEdificioPilon(int tamanio, Ubicacion ubicacion, VBox vBoxMenu, GridPane tablero, JuegoModelo juegoModelo) {
        super(tamanio, "images/pilon.png",ubicacion,vBoxMenu,tablero,juegoModelo);
        this.setOnAction(new BotonPilonHandler((Pilon) ubicacion.getEdificio(), vBoxMenu));
    }

    public BotonEdificioPilon(BotonTierra botonTierra) {
        super(botonTierra, "images/pilon.png");
        this.setOnAction(new BotonPilonHandler((Pilon) ubicacion.getEdificio(), vBoxMenu));
    }

    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
