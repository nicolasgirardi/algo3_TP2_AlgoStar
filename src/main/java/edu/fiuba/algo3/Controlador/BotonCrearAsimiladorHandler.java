package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.RecursoOcupadoError;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;

public class BotonCrearAsimiladorHandler implements EventHandler<ActionEvent> {

    private Raza raza;
    private BotonGenerico botonVolcan;
    private Asimilador asimilador;
    private Volcan volcan;
    private VBox vBoxMenu;

    private int contador;

    public BotonCrearAsimiladorHandler(VBox vBoxMenu, Volcan volcan, BotonGenerico botonVolcan, Raza raza) {
        this.asimilador = null;
        this.volcan = volcan;
        this.vBoxMenu = vBoxMenu;
        this.botonVolcan = botonVolcan;
        this.raza = raza;
        contador = 0;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        try{
            asimilador = new Asimilador(volcan);
            raza.agregarEdificio(asimilador);
            File volcanFile = new File("images/asimilador.png");
            Image imagenVolcan = new Image(volcanFile.toURI().toString(), botonVolcan.getTAMANIO(), botonVolcan.getTAMANIO(), true, true );
            botonVolcan.setGraphic(new ImageView(imagenVolcan));
            contador++;
        }catch (RecursoOcupadoError e){
            alert.setContentText("Error ya hay un Asimilador trabajando en el Volcan seleccionado");
            alert.showAndWait();
        } catch (RecursosInsuficientesError e){
            alert.setContentText("Error Recurso insufciente para construir el asimilador");
            alert.showAndWait();
        }

        System.out.println(contador);
    }

}
