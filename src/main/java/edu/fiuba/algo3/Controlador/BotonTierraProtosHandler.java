package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.*;
import edu.fiuba.algo3.modelo.Juego.JuegoModelo;
import edu.fiuba.algo3.modelo.tablero.Mapa;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class BotonTierraProtosHandler implements EventHandler<ActionEvent> {
    private JuegoModelo juegoModelo;
    private BotonGenerico botonSuperficie;
    private  VBox vBoxMenu;

    public BotonTierraProtosHandler(VBox vBoxMenu, BotonGenerico botonSuperficie, JuegoModelo juegoModelo) {
        this.vBoxMenu = vBoxMenu;
        this.botonSuperficie = botonSuperficie;
        this.juegoModelo = juegoModelo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label labelNuevo = new Label("Edificios de protoss:");

        Button crearBotonPilon = new Button("Crear Pilon");
        Button crearBotonAcceso = new Button("Crear Acceso");
        Button crearBotonPuertoEstelar = new Button("Crear Puerto estelar");

        crearBotonPilon.setOnAction( new CrearBotonPilonHandler(vBoxMenu, botonSuperficie, juegoModelo.getMapa(), juegoModelo.getJugadorActivo().getRaza()  ) );
        crearBotonAcceso.setOnAction( new CrearBotonAccesoHandler(vBoxMenu,botonSuperficie, juegoModelo.getJugadorActivo().getRaza() ) );
        crearBotonPuertoEstelar.setOnAction( new CrearBotonPuertoEstelarHandler(vBoxMenu, botonSuperficie, juegoModelo.getJugadorActivo().getRaza()) );

        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(labelNuevo, crearBotonAcceso, crearBotonPuertoEstelar, crearBotonPilon);
        vBoxMenu.setPadding(new Insets(1));


    }
}
