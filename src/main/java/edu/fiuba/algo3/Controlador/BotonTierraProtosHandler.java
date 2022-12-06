package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Edificio.Protoss.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BotonTierraProtosHandler implements EventHandler<ActionEvent> {
    private  VBox vBoxMenu;

    public BotonTierraProtosHandler(VBox vBoxMenu) {
        this.vBoxMenu = vBoxMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Label labelNuevo = new Label("Edificio para protoss");

        //Button botonNexoMineral = new Button("Crear Nexo mineral");
        //NexoMineral nexoMineral = new NexoMineral();
        //nexoMineral.setOnAction(new BotonNexoMineralHandler(, vBoxMenu) ); ver quilombo con nexoMineral

        Button botonPilon = new Button("Crear Pilon");
        Button botonAcceso = new Button("Crear Acceso");
        Button botonPuertoEstelar = new Button("Crear Puerto estelar");

        Pilon pilon = new Pilon();
        Acceso acceso = new Acceso();
        PuertoEstelar puertoEstelar = new PuertoEstelar();

        botonPilon.setOnAction( new BotonPilonHandler(pilon,vBoxMenu) );
        botonAcceso.setOnAction( new BotonAccesoHandler(acceso,vBoxMenu) );
        botonPuertoEstelar.setOnAction( new BotonPuertoEstelarHandler(puertoEstelar,vBoxMenu) );

        vBoxMenu.getChildren().clear();
        vBoxMenu.getChildren().addAll(labelNuevo, botonAcceso, botonPuertoEstelar, botonPilon);
        vBoxMenu.setPadding(new Insets(1));


    }
}
