package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;
import edu.fiuba.algo3.modelo.Edificio.CorrelativaDeConstruccionIncumplidaError;
import edu.fiuba.algo3.modelo.Edificio.Protoss.PuertoEstelar;
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

public class CrearBotonPuertoEstelarHandler implements EventHandler<ActionEvent> {
    private RazaProtoss raza;
    private  PuertoEstelar puertoEstelar;
    private  VBox vBoxMenu;
    private  BotonGenerico botonSuperficie;

    public CrearBotonPuertoEstelarHandler(VBox vBoxMenu, BotonGenerico botonSuperficie, Raza raza) {
        this.puertoEstelar = new PuertoEstelar();
        this.vBoxMenu = vBoxMenu;
        this.botonSuperficie = botonSuperficie;
        this.raza = (RazaProtoss) raza;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        try{
            botonSuperficie.getUbicacion().ubicar(puertoEstelar); // ok??
            raza.agregarEdificio(puertoEstelar);
            File imagenFile = new File("images/puertoEstelar.png");
            Image imagen = new Image(imagenFile.toURI().toString(), botonSuperficie.getTAMANIO(), botonSuperficie.getTAMANIO(), true, true );
            botonSuperficie.setGraphic(new ImageView(imagen) );
        }catch( ConstruccionFueraDelRangoPilonError e){
            alert.setContentText("Error la construccion del acceso esta fuera del rango del pilon mas cercano");
            alert.showAndWait();
        } catch ( RecursosInsuficientesError e ){
            alert.setContentText("Error RecursosInsuficientesError Puerto estelar");
            alert.showAndWait();
        } catch (CorrelativaDeConstruccionIncumplidaError e ){
            alert.setContentText("Error en la correlativa de construccion necesitas un acceso ");
            alert.showAndWait();
        }
    }
}
