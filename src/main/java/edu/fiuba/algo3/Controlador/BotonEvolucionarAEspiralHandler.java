package edu.fiuba.algo3.Controlador;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Unidad.*;

public class BotonEvolucionarAEspiralHandler implements EventHandler<ActionEvent> {

    private Zangano zangano;
    private RazaZerg raza;
    private Button boton;

    public BotonEvolucionarAEspiralHandler(Zangano unidad,Button boton,RazaZerg unaRaza){
        zangano = unidad;
        boton = boton;
        raza = unaRaza;
    }

    public void handle(ActionEvent actionEvent){
        zangano.mutarEspiral(raza);

    }
}