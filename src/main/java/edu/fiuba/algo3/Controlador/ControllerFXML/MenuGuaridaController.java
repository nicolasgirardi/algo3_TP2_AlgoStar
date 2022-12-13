package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Controlador.OtrosHandlers.MostradorAlertas;
import edu.fiuba.algo3.Vista.Botones.BotonCeldaTablero;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonHidralisco;
import edu.fiuba.algo3.Vista.Botones.Unidades.BotonZerling;
import edu.fiuba.algo3.modelo.Edificio.EdificioNoOperativoError;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Guarida;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.NoQuedanLarvasError;
import edu.fiuba.algo3.modelo.Raza.PoblacionExedidaError;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Unidad.Larva;
import edu.fiuba.algo3.modelo.tablero.Coordenada;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class MenuGuaridaController {
    @FXML
    public Button btnEvolucionarLarvaAHidralisco;
    private Guarida guarida;
    private JuegoModelo juegoModelo;
    private GridPane tablero;

    @FXML
    public void onClickEvolucionarLarvaAHidralisco(MouseEvent mouseEvent) {
        Mapa mapa = juegoModelo.getMapa();
        Jugador jugador = juegoModelo.getJugadorActivo();
        try{
            guarida.asignarRaza(jugador.getRaza());
            RazaZerg razaZerg;
            razaZerg = (RazaZerg) juegoModelo.getJugadorZerg().getRaza();
            Larva larva = razaZerg.getLarva();
            guarida.evolucionarLarvaAHidra(larva);

            boolean agregado = false;

            for(int i = 0; i < mapa.getDimension() ; i++){
                for(int j = 0; j < mapa.getDimension(); j++){
                    Coordenada coordenada = new Coordenada(i,j);
                    Ubicacion ubicacion = mapa.buscar(coordenada);
                    if( ubicacion.ubicacionVacia() && !agregado ) {
                        ubicacion.asignarUnidad(jugador.getRaza().getUltimaUnidad());
                        System.out.println("Ubicacion actual Creacion Zerling");
                        System.out.println("horizontal: "+ String.valueOf(ubicacion.coordenada().horizontal() ) +
                                " vertical: "+ String.valueOf(ubicacion.coordenada().vertical()));
                        BotonCeldaTablero botonCeldaTablero = null;
                        for (Node node : tablero.getChildren()) {
                            BotonCeldaTablero boton = (BotonCeldaTablero) node;
                            if(boton.getUbicacion().equals(ubicacion)) {
                                botonCeldaTablero = (BotonCeldaTablero) node;
                                break;
                            }
                        }
                        botonCeldaTablero.borrarBotonDelTablero();
                        BotonHidralisco botonHidralisco = new BotonHidralisco(botonCeldaTablero);
                        tablero.add(botonHidralisco, i, j);
                        agregado = true;
                    }
                }
            }
        }catch (NoQuedanLarvasError e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No hay larvas en ningun criadero");
            alert.showAndWait();
        } catch (EdificioNoOperativoError | PoblacionExedidaError e){
            MostradorAlertas.mostrarAlerta(e);
        }  catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setElements(Guarida guarida, GridPane tablero, JuegoModelo juegoModelo){
        this.guarida = guarida;
        this.juegoModelo = juegoModelo;
        this.tablero = tablero;
    }
}
