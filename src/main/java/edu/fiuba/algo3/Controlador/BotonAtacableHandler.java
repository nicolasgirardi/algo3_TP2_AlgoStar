package edu.fiuba.algo3.Controlador;

import edu.fiuba.algo3.modelo.Atacable;
import edu.fiuba.algo3.modelo.Atacante;
import edu.fiuba.algo3.modelo.tablero.Ubicacion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;

public class BotonAtacableHandler implements EventHandler<ActionEvent> {


    private GridPane tablero;
    private Ubicacion ubicacionAtacable;
    private  Atacante atacante;
    private  Atacable atacable;

    public BotonAtacableHandler(Atacable atacable, Atacante atacante, Ubicacion ubicacionAtacable, GridPane tablero){
        this.atacante = atacante;
        this.atacable = atacable;
        this.ubicacionAtacable = ubicacionAtacable;
        this.tablero = tablero;
    }
    
    @Override
    public void handle(ActionEvent actionEvent) {
        atacante.atacar(atacable);
        System.out.println( "Vida: " + atacable.ubicacion().getUnidad().getVida()
                + "Escudo : " + atacable.ubicacion().getUnidad().getEscudo() );
        if (atacable.ubicacion().getUnidad().getVida() == 0){
            ubicacionAtacable.quitarUnidad();
            tablero.
        }
    }
}
