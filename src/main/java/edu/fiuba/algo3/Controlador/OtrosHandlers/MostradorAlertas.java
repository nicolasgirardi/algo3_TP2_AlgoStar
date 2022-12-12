package edu.fiuba.algo3.Controlador.OtrosHandlers;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;
import edu.fiuba.algo3.modelo.Edificio.CorrelativaDeConstruccionIncumplidaError;
import edu.fiuba.algo3.modelo.Edificio.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Edificio.ExtractorCantidadMaximaDeZanganosError;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
import edu.fiuba.algo3.modelo.Unidad.UnidadNoOperativaError;
import edu.fiuba.algo3.modelo.tablero.UbicacionOcupadaError;
import javafx.scene.control.Alert;

import java.util.HashMap;

public class MostradorAlertas {
   private static HashMap<String,String> mensajesErrores;
   private static Alert alerta;

   static {
       mensajesErrores = new HashMap<>();
       alerta = new Alert(Alert.AlertType.ERROR);
       alerta.setTitle("Error");
       alerta.setHeaderText(null);
       mensajesErrores.put(ConstruccionFueraDelRangoPilonError.class.getName(), "Error la construcción  esta fuera del rango del pilon mas cercano");
       mensajesErrores.put(RecursosInsuficientesError.class.getName(), "Error recursos insuficientes para construir ");
       mensajesErrores.put(CorrelativaDeConstruccionIncumplidaError.class.getName(), "Error en la correlativa de construccion ");
       mensajesErrores.put(UnidadNoOperativaError.class.getName(), "Error La unidad todaiva no esta operativa ");
       mensajesErrores.put(UbicacionOcupadaError.class.getName(), "Error La ubicacion a la que quiere moverse esta ocupada ");
       mensajesErrores.put(EdificioNoOperativoError.class.getName(), "Error el edificio todavia no esta operativo ");
       mensajesErrores.put(ExtractorCantidadMaximaDeZanganosError.class.getName(), "Error El extractor tiene la maxima cantidad de zanganos");


   }


   public static void mostrarAlerta(Exception e){
       String mensaje = null;
       if(mensajesErrores.containsKey(e.getClass().getName())){
           mensaje = mensajesErrores.get(e.getClass().getName());
       }else{
           mensaje = "Error no registrado: " + e.getClass().getName();
       }
       alerta.setContentText(mensaje);
       alerta.showAndWait();
   }

    public static void mostrarAlerta(Exception e, String mensajeAConcatenar){
        String mensaje = null;
        if(mensajesErrores.containsKey(e.getClass().getName())){
            mensaje = mensajesErrores.get(e.getClass().getName());
        }else{
            mensaje = "Error no registrado: " + e.getClass().getName();
        }
        alerta.setContentText(mensaje.concat(mensajeAConcatenar));
        alerta.showAndWait();
    }
}
