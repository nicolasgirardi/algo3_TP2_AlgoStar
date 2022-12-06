package edu.fiuba.algo3.Vista.BotonesCelda;

import edu.fiuba.algo3.Controlador.BotonMineralHandler;
import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Recurso.NodoMineral;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class BotonMineral extends BotonGenerico {
    private VBox vBoxMenu;

    public BotonMineral(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu  ) {
        super(TAMANIO, "images/mineral.png", ubicacion);
        this.vBoxMenu = vBoxMenu;
        NodoMineral nodoMineral = ubicacion.getNodoMineral();
        this.setOnAction(new BotonMineralHandler(vBoxMenu, nodoMineral));
        Tooltip tooltip = new Tooltip("Mineral restante: "+nodoMineral.cantidadRecurso());
        tooltip.setShowDelay(new Duration(100));
        this.setTooltip(tooltip);
    }
}
