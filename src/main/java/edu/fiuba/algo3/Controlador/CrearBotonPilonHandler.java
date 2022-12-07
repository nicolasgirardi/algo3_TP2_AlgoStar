package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;

public class CrearBotonPilonHandler implements EventHandler<ActionEvent> {
    private Raza raza;
    private Mapa mapa;
    private  Pilon pilon;
    private  VBox vBoxMenu;
    private  BotonGenerico botonSuperficie;

    public CrearBotonPilonHandler(VBox vBoxMenu, BotonGenerico botonSuperficie, Mapa mapa, Raza raza) {
        this.pilon = new Pilon();
        this.vBoxMenu = vBoxMenu;
        this.botonSuperficie = botonSuperficie;
        this.mapa = mapa;
        this.raza = raza;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try{
            raza.agregarEdificio(pilon);
            File imagenFile = new File("images/pilon.png");
            Image imagen = new Image(imagenFile.toURI().toString(), botonSuperficie.getTAMANIO(), botonSuperficie.getTAMANIO(), true, true );
            botonSuperficie.setGraphic(new ImageView(imagen));
            botonSuperficie.getUbicacion().ubicar(pilon, mapa); // ubicarPilon de vicky usa ubicar con mapa pero como botengo el mapa se lo paso tambien ?
        } catch ( RecursosInsuficientesError e ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error RecursosInsuficientesError Pilon");
            alert.showAndWait();
        }

    }


}
