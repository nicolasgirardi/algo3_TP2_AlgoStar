package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.*;
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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
public class MoverseConFlechitasHandler implements EventHandler<KeyEvent>{

    private Button  arriba;
    private Button  abajo;
    private Button  derecha;
    private Button  izquierda;

    public MoverseConFlechitasHandler(Button up,Button down,Button left,Button right){
        arriba = up;
        abajo = down;
        derecha = right;
        izquierda = left;
    }

    public void handle(KeyEvent key){

        if (key.getCode() == KeyCode.UP || key.getCode() == KeyCode.W){
            Event.fireEvent(arriba,new ActionEvent());
        }
        if (key.getCode() == KeyCode.DOWN || key.getCode() == KeyCode.S){
            Event.fireEvent(abajo,new ActionEvent());
        }
        if (key.getCode() == KeyCode.RIGHT || key.getCode() == KeyCode.D){
            Event.fireEvent(derecha,new ActionEvent());
        }
        if (key.getCode() == KeyCode.LEFT || key.getCode() == KeyCode.A){
            Event.fireEvent(izquierda,new ActionEvent());
        }
    }
}
