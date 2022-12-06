package edu.fiuba.algo3.Vista.BotonesCelda;

import edu.fiuba.algo3.Controlador.BotonMineralHandler;
import edu.fiuba.algo3.Controlador.BotonVolcanHandler;
import edu.fiuba.algo3.Vista.BotonGenerico;
import edu.fiuba.algo3.modelo.Recurso.Volcan;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class BotonVolcan extends BotonGenerico {
    private VBox vBoxMenu;
    public BotonVolcan(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu) {
        super(TAMANIO, "images/Volcan.png", ubicacion);
        this.vBoxMenu = vBoxMenu;
        Volcan volcan = ubicacion.getVolcan();
        this.setOnAction(new BotonVolcanHandler(vBoxMenu, volcan));
        Tooltip tooltip = new Tooltip("Gas restante: "+volcan.cantidadRecurso());
        tooltip.setShowDelay(new Duration(100));
        this.setTooltip(tooltip);
    }
}
