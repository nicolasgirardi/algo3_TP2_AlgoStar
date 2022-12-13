package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.Vista.Botones.Construcciones.BotonAsimilador;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Acceso;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Asimilador;
import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Edificio.Zerg.Extractor;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class MenuAsimiladorController extends EnContruccion{

    @FXML
    public AnchorPane contenerdorMenu;
    private GridPane tablero;
    private Ubicacion ubicacion;
    private RazaProtoss raza;
    private BotonAsimilador botonAsimilador;


    @FXML
    public void onClickedExtraerGas(MouseEvent event) {
        raza.aumentarGas( ubicacion.getVolcan().extraer() );
    }

    public void setElements(GridPane tablero, Ubicacion ubicacion, RazaProtoss raza, BotonAsimilador botonAsimilador) {
        this.tablero = tablero;
        this.ubicacion = ubicacion;
        this.raza = raza;
        this.botonAsimilador = botonAsimilador;
        Asimilador asimilador = (Asimilador) ubicacion.getEdificio();
        if(!asimilador.estaOperativo()){
            int cantidadTurnosParaSerOperativo = asimilador.getTurnosRestantesParaSerOperativo();
            cargarMenuEnConstruccion(cantidadTurnosParaSerOperativo,contenerdorMenu);
        }
    }


}
