package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.RecursoOcupadoError;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;

public class BotonCrearNexoMineralHandler implements EventHandler<ActionEvent> {
    private Raza raza;
    private BotonGenerico botonMineral;
    private NexoMineral nexoMineral;
    private NodoMineral nodoMineral;

    public BotonCrearNexoMineralHandler(VBox vBoxMenu, NodoMineral nodoMineral, BotonGenerico botonMineral, Raza raza) {
        this.nexoMineral = null;
        this.nodoMineral = nodoMineral;
        this.botonMineral = botonMineral;
        this.raza = raza;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        try{
            nexoMineral = new NexoMineral(nodoMineral);
            raza.agregarEdificio(nexoMineral);
            File mineralFile = new File("images/nexo.png");
            Image imagenNexo = new Image(mineralFile.toURI().toString(), botonMineral.getTAMANIO(), botonMineral.getTAMANIO(), true, true );
            botonMineral.setGraphic(new ImageView(imagenNexo));
        }catch (RecursoOcupadoError e){
            alert.setContentText("Error ya hay un nexoMineral trabajando sobre el nodoMineral seleccionado");
            alert.showAndWait();
        } catch (RecursosInsuficientesError e){
            alert.setContentText("Error No hay suficientes recursos para construir el nexo mineral");
            alert.showAndWait();
        }

    }

}
