package edu.fiuba.algo3.Controlador;

import javafx.event.*;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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
//TODO: reevisar si see puede usar