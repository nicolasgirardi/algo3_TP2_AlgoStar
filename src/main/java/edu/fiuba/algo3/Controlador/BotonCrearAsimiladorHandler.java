package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Recurso.RecursoOcupadoError;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;

public class BotonCrearAsimiladorHandler implements EventHandler<ActionEvent> {

    private Asimilador asimilador;
    private Volcan volcan;
    private VBox vBoxMenu;

    private int contador;

    public BotonCrearAsimiladorHandler(Asimilador asimilador, VBox vBoxMenu, Volcan volcan) {
        this.asimilador = asimilador;
        this.volcan = volcan;
        this.vBoxMenu = vBoxMenu;
        contador = 0;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try{
            asimilador = new Asimilador(volcan);
            contador++;
        }catch (RecursoOcupadoError e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error Volcan Ocupado");
            alert.setContentText("Error ya hay un Asimilador trabajando en el Volcan seleccionado");
            alert.showAndWait();
        }

        System.out.println(contador);

    }
}
