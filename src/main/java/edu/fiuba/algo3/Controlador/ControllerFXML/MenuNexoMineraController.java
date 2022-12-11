package edu.fiuba.algo3.Controlador.ControllerFXML;

import edu.fiuba.algo3.modelo.Edificio.Protoss.NexoMineral;
import edu.fiuba.algo3.modelo.Raza.RazaProtoss;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MenuNexoMineraController {

    @FXML
    public AnchorPane contenerdorMenu;

    @FXML
    public Label lblCantidadMineral;

    private NexoMineral nexoMineral;
    private RazaProtoss razaProtoss;

    @FXML
    public void onClickedExtraerMineral(MouseEvent event) {
        GestionRecurso mineralExtraido = nexoMineral.extraer();
        razaProtoss.aumentarMineral(mineralExtraido);
        lblCantidadMineral.setText(String.valueOf(nexoMineral.mineralRestante()));
    }

    public void setElements(NexoMineral nexoMineral, RazaProtoss razaProtoss) {
        if(nexoMineral == null) throw new IllegalArgumentException("The argument cannot be null");
        this.nexoMineral = nexoMineral;
        this.razaProtoss = razaProtoss;
        lblCantidadMineral.setText(String.valueOf(nexoMineral.mineralRestante()));
        if(nexoMineral)
    }
}
