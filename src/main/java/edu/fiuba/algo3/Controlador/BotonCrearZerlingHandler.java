package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Edificio.Zerg.ReservaDeReproduccion;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Unidad.InsuficientesRecursosParaCrearUnidadError;
import edu.fiuba.algo3.modelo.Unidad.Larva;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

public class BotonCrearZerlingHandler implements EventHandler<ActionEvent> {

    private ReservaDeReproduccion reservaDeReproduccion;

    public BotonCrearZerlingHandler(ReservaDeReproduccion reservaDeReproduccion){
        this.reservaDeReproduccion = reservaDeReproduccion;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        try{
            reservaDeReproduccion.crearZerling(new Larva()); //ver si hacemos que resiva una larva posta
            //SEGUIR
        }catch (EdificioNoOperativoError e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("El edificio no se encuentra operativo");
            alert.showAndWait();
        }catch (InsuficientesRecursosParaCrearUnidadError e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No cuentas con los recursos necesarios para crear esta Unidad");
            alert.showAndWait();
        }catch (PoblacionExedidaError e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No cuentas con la poblacion necesaria para crear esta Unidad");
            alert.showAndWait();
        }
    }
}
