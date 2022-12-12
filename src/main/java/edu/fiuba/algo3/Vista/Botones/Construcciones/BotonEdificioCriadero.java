package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.ControllerFXML.*;
import edu.fiuba.algo3.Controlador.OtrosHandlers.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.layout.*;

public class BotonEdificioCriadero extends BotonCeldaTablero {

    public BotonEdificioCriadero(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu, Jugador jugador, GridPane tablero , JuegoModelo juegoModelo) {
        super(TAMANIO,"images/criadero.png",ubicacion,vBoxMenu, tablero,juegoModelo, RUTAS_FXML.MENU_ATACAR_ENEMIGO,RUTAS_FXML.MENU_CRIADERO);
    }

    @Override
    public void setElmentsController() {
        Jugador jugadorActivo = juegoModelo.getJugadorActivo();
        ID_RAZA razaActiva = jugadorActivo.getRaza().getEntidad();
        if(razaActiva.equals(ID_RAZA.ZERG)){
            MenuCriaderoController controller = vistaMenu.getController();
            controller.setElements((Criadero) ubicacion.getEdificio(),vBoxMenu, tablero,juegoModelo,getTAMANIO());
        }else{
            MenuAtacarEnemigoController controller = vistaMenu.getController();
        }
    }
}

