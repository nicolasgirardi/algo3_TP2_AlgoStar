package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.Recurso.RecursoOcupadoError;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;

public class BotonCrearNexoMineralHandler implements EventHandler<ActionEvent> {
    private BotonGenerico botonMineral;
    private NexoMineral nexoMineral;
    private NodoMineral nodoMineral;

    public BotonCrearNexoMineralHandler(NexoMineral nexoMineral, VBox vBoxMenu, NodoMineral nodoMineral, BotonGenerico botonMineral) {
        this.nexoMineral = nexoMineral;
        this.nodoMineral = nodoMineral;
        this.botonMineral = botonMineral;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try{
            nexoMineral = new NexoMineral(nodoMineral);
            File mineralFile = new File("images/nexo.png");
            Image imagenNexo = new Image(mineralFile.toURI().toString(), botonMineral.getTAMANIO(), botonMineral.getTAMANIO(), true, true );
            botonMineral.setGraphic(new ImageView(imagenNexo));

        }catch (RecursoOcupadoError e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error NodoMineral Ocupado");
            alert.setContentText("Error ya hay un nexoMineral trabajando sobre el nodoMineral seleccionado");
            alert.showAndWait();
        }

    }

}
