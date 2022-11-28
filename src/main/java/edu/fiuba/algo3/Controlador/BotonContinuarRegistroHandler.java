package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.ContenedorJuego;
import edu.fiuba.algo3.Vista.ContenedorRegistro;
import edu.fiuba.algo3.modelo.Juego.Juego;
import edu.fiuba.algo3.modelo.Juego.Jugador;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
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

        if(Objects.equals(labelRaza.getText(), "ZERG")){
            zerg = new RazaZerg();
            jugadorNuevo = new Jugador(labelNombre.getText(), labelColorIngresado.getText(), zerg );
        }

        if (Objects.equals(labelRaza.getText(), "PROTOSS")){
            protoss = new RazaProtoss();
            jugadorNuevo = new Jugador(labelNombre.getText(), labelColorIngresado.getText(), protoss);
        }

        juego.agregarJugador(jugadorNuevo);

        if(juego.jugadoresCompletos() ){
            ContenedorJuego contenedorJuego = new ContenedorJuego(stage, juego);
            Scene scenaJuegoPrincipal = new Scene(contenedorJuego);
            stage.setScene(scenaJuegoPrincipal);
        }
        else{
            ContenedorRegistro nuevoContenedorRegistro = new ContenedorRegistro(stage, juego);
            Scene escenaDeRegistro = new Scene( nuevoContenedorRegistro, 1200 ,900);
            stage.setScene(escenaDeRegistro);
        }

    }

}
