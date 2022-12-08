package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Vista.Botones.BotonNexoMineral;
import edu.fiuba.algo3.Vista.Botones.BotonRecursoMineral;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MenuNodoMineralProtossController {

    @FXML
    public AnchorPane contenerdorMenu;

    private GridPane tablero;
    private Ubicacion ubicacion;
    private RazaProtoss razaProtoss;
    private BotonRecursoMineral botonRecursoMineral;

    @FXML
    public void onClickedConstruirNexoMineral(MouseEvent event) {
        NexoMineral nexoMineral = new NexoMineral(ubicacion.getNodoMineral());
        razaProtoss.agregarEdificio(nexoMineral);
        botonRecursoMineral.borrarBotonDelTablero();
        tablero.add(new BotonNexoMineral(botonRecursoMineral.getTAMANIO(),ubicacion),ubicacion.coordenada().horizontal(),ubicacion.coordenada().vertical());

    }

    public void setElements(GridPane tablero, Ubicacion ubicacion, RazaProtoss razaProtoss, BotonRecursoMineral botonRecursoMineral){
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.razaProtoss = razaProtoss;
        this.botonRecursoMineral = botonRecursoMineral;
    }


}
