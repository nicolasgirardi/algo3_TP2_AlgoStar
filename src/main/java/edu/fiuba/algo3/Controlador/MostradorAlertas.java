package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.ConstruccionFueraDelRangoPilonError;
import edu.fiuba.algo3.modelo.Edificio.CorrelativaDeConstruccionIncumplidaError;
import edu.fiuba.algo3.modelo.Recurso.RecursosInsuficientesError;
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
       mensajesErrores.put(RecursosInsuficientesError.class.getName(), "Error la construcción esta fuera del rango del pilon mas cercano");
       mensajesErrores.put(CorrelativaDeConstruccionIncumplidaError.class.getName(), "Error en la correlativa de construccion ");
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
