package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAsimiladorController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuAtacarEnemigoController;
import edu.fiuba.algo3.Controlador.ControllerFXML.MenuNexoMineraController;
import edu.fiuba.algo3.Controlador.RUTAS_FXML;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.ID_RAZA;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;

public class BotonNexoMineral extends BotonCeldaTablero {

    public BotonNexoMineral(BotonCeldaTablero botonCeldaTablero) {
        super(botonCeldaTablero, "images/nexo.png", RUTAS_FXML.MENU_NEXO_MINERAL,RUTAS_FXML.MENU_ATACAR_ENEMIGO);
    }

    @Override
    public void setElmentsController() {
        Jugador jugadorActivo = juegoModelo.getJugadorActivo();
        ID_RAZA razaActiva = jugadorActivo.getRaza().getEntidad();
        if(razaActiva.equals(ID_RAZA.PROTOSS)){
            MenuNexoMineraController controller = vistaMenu.getController();
            controller.setElements((NexoMineral) ubicacion.getEdificio(),(RazaProtoss) jugadorActivo.getRaza());
        }else{
            MenuAtacarEnemigoController controller = vistaMenu.getController();
        }
    }
}
