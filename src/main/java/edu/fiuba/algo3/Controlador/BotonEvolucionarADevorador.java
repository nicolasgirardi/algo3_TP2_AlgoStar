package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Criadero;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import edu.fiuba.algo3.modelo.Unidad.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class BotonEvolucionarADevorador implements EventHandler<ActionEvent> {
    private Mutalisco mutalisco;
    private RazaZerg raza;
    private Button boton;

    public BotonEvolucionarADevorador(Mutalisco unidad,Button boton,RazaZerg unaRaza){
        mutalisco = unidad;
        boton = boton;
        raza = unaRaza;
    }

    public void handle(ActionEvent actionEvent){
        mutalisco.evolucionarDevorador(raza);

    }

}