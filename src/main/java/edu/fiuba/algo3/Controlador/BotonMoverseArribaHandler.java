package edu.fiuba.algo3.Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Unidad.*;
import javafx.scene.text.Text;

public class BotonMoverseArribaHandler implements EventHandler<ActionEvent> {

    private Unidad unidad;
    private Button boton;

    private Text texto;


    public BotonMoverseArribaHandler(Unidad unaUnidad, Button unBoton, Text unTexto) {
        unidad = unaUnidad;
        boton = unBoton;
        texto = unTexto;
    }

    public void handle(ActionEvent actionEvent) {
        try {
            unidad.moverseArriba();
            texto.setText("Se puede mover usando las flechas del teclado");
        } catch (Throwable e) {
            texto.setText("La unidad no puede moverse a ese lugar");
        }
    }
}
