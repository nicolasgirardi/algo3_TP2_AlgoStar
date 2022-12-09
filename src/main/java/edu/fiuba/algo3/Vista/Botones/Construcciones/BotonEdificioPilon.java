package edu.fiuba.algo3.Vista.Botones.Construcciones;

import edu.fiuba.algo3.Controlador.BotonPilonHandler;
import edu.fiuba.algo3.Vista.Botones.BotonGenerico;
import edu.fiuba.algo3.modelo.Edificio.Protoss.Pilon;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.scene.layout.VBox;

public class BotonEdificioPilon extends BotonGenerico {

    public BotonEdificioPilon(int TAMANIO, Ubicacion ubicacion, VBox vBoxMenu) {
        super(TAMANIO, "images/pilon.png", ubicacion);
        this.setOnAction(new BotonPilonHandler((Pilon) ubicacion.getEdificio(), vBoxMenu));
    }
}
