package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.BotonCriaderoHandler;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.layout.*;

public class BotonEdificioCriadero extends BotonCeldaTablero {

    public BotonEdificioCriadero(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu, Jugador jugador, GridPane tablero , JuegoModelo juegoModelo) {
        super(TAMANIO,"images/criadero.png",ubicacion,vBoxMenu, tablero,juegoModelo);
        this.setOnAction(new BotonCriaderoHandler( (Criadero) ubicacion.getEdificio(), vBoxMenu, jugador, tablero ,juegoModelo.getMapa(), TAMANIO ));
    }


    @Override
    public void actualizar(Jugador jugadorActivo) {

    }
}
