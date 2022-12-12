package edu.fiuba.algo3.Controlador.OtrosHandlers;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import edu.fiuba.algo3.modelo.Unidad.*;

public class BotonEvolucionarAGuardianHandler implements EventHandler<ActionEvent> {
    private Mutalisco mutalisco;
    private RazaZerg raza;
    private Button boton;

    public BotonEvolucionarAGuardianHandler(Mutalisco unidad, Button boton, RazaZerg unaRaza){
        mutalisco = unidad;
        boton = boton;
        raza = unaRaza;
    }

    public void handle(ActionEvent actionEvent){
        mutalisco.evolucionarAGuardian(raza);

    }

}
