package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.BotonCriaderoHandler;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.layout.*;

public class BotonEdificioCriadero extends BotonGenerico {

    public BotonEdificioCriadero(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu, Jugador jugador,GridPane tablero ,Mapa mapa){
        super(TAMANIO,"images/criadero.png",ubicacion);
        this.setOnAction(new BotonCriaderoHandler( (Criadero) ubicacion.getEdificio(), vBoxMenu, jugador, tablero ,mapa, TAMANIO ));
    }





}
