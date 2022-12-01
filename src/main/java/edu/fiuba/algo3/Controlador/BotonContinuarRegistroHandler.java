package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorJuego;
import edu.fiuba.algo3.Vista.ContenedorRegistro;
import edu.fiuba.algo3.modelo.Juego.*;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.Objects;

public class BotonContinuarRegistroHandler implements EventHandler<ActionEvent> {

    Stage stage;
    ContenedorRegistro contenedorRegistro;
    Label labelNombre;
    Label labelColorIngresado;
    Label labelRaza;

    Juego juego;

    public BotonContinuarRegistroHandler(Stage stage, ContenedorRegistro contenedorRegistro, Label nombreIngresado, Label colorIngresado, Label razaIngresada, Juego algoStart) {
        this.stage = stage;
        this.contenedorRegistro = contenedorRegistro;
        this.labelNombre = nombreIngresado;
        this.labelColorIngresado = colorIngresado;
        this.labelRaza = razaIngresada;
        this.juego = algoStart;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Jugador jugadorNuevo = null;
        RazaZerg zerg = null;
        RazaProtoss protoss = null;
        jugadorNuevo = crearJugador();

        if(jugadorNuevo != null){
            capturadorDeErroresJugador(jugadorNuevo);
        }
        if(juego.jugadoresCompletos() ){
            ContenedorJuego contenedorJuego = new ContenedorJuego(stage, juego);
            Scene scenaJuegoPrincipal = new Scene(contenedorJuego, 1200, 900); // poner siempre dimensiones
            stage.setScene(scenaJuegoPrincipal);
        }
        else{
            ContenedorRegistro nuevoContenedorRegistro = new ContenedorRegistro(stage, juego);
            Scene escenaDeRegistro = new Scene( nuevoContenedorRegistro, 1200 ,900);
            stage.setScene(escenaDeRegistro);
        }
    }

    private Jugador crearJugador(){
        RazaZerg zerg = null;
        RazaProtoss protoss = null;
        Jugador jugadorNuevo = null;

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");

        if( labelRaza.getText().equals("ZERG") ){
            zerg = new RazaZerg();
            try{
                jugadorNuevo = new Jugador(labelNombre.getText(), labelColorIngresado.getText(), zerg );
            } catch(JugadorNombreError e){
                alert.setContentText("El nombre del jugador tiene que tener mas de 6 caracteres");
                alert.showAndWait();
                resetearScena();
            }
        }

        if ( labelRaza.getText().equals("PROTOSS") ){
            protoss = new RazaProtoss();
            try{
                jugadorNuevo = new Jugador(labelNombre.getText(), labelColorIngresado.getText(), protoss);
            } catch( JugadorNombreError e){
                alert.setContentText("El nombre del jugador tiene que tener mas de 6 caracteres");
                alert.showAndWait();
                resetearScena();
            }
        }

        return jugadorNuevo;
    }

    private void resetearScena(){
        ContenedorRegistro nuevoContenedorRegistro = new ContenedorRegistro(stage, juego);
        Scene escenaDeRegistro = new Scene( nuevoContenedorRegistro, 1200 ,900);
        stage.setScene(escenaDeRegistro);
    }

    private void capturadorDeErroresJugador(Jugador jugadorNuevo){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        try{
            juego.agregarJugador(jugadorNuevo);
        } catch ( JugadorMismaRazaError e){
            alert.setContentText("Error el Jugador 1 Tiene la misma raza");
            alert.showAndWait();
            resetearScena();
        } catch ( JugadorMismoNombreError e){
            alert.setContentText("Error el Jugador 1 Tiene el mismo nombre");
            alert.showAndWait();
            resetearScena();
        } catch (JugadorMismoColorError e){
            alert.setContentText("Error el Jugador 1 Tiene el mismo color");
            alert.showAndWait();
            resetearScena();
        } catch (JugadorNombreError e){
            alert.setContentText("El nombre del jugador tiene que tener mas de 6 caracteres");
            alert.showAndWait();
            resetearScena();
        }

    }
}
