package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Raza.Raza;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.File;

public class CrearBotonAccesoHandler implements EventHandler<ActionEvent> {
    private RazaProtoss raza;
    private  BotonGenerico botonSuperficie;
    private  VBox vBoxMenu;
    private  Acceso acceso;

    public CrearBotonAccesoHandler(VBox vBoxMenu, BotonGenerico botonSuperficie, Raza raza) {
        //this.acceso = new Acceso();
        this.vBoxMenu = vBoxMenu;
        this.botonSuperficie = botonSuperficie;
        this.raza = (RazaProtoss) raza;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        try{
            botonSuperficie.getUbicacion().ubicar(acceso);
            raza.agregarEdificio(acceso);
            File imagenFile = new File("images/acceso.png");
            Image imagen = new Image(imagenFile.toURI().toString(), botonSuperficie.getTAMANIO(), botonSuperficie.getTAMANIO(), true, true );
            botonSuperficie.setGraphic(new ImageView(imagen));
        } catch(ConstruccionFueraDelRangoPilonError e ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Construccion fuera del rango Pilon");
            alert.setContentText("Error la construccion del acceso esta fuera del rango del pilon mas cercano");
            alert.showAndWait();
        }catch ( RecursosInsuficientesError e ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error recursos insuficientes para construir Acceso");
            alert.showAndWait();
        }

    }
}
