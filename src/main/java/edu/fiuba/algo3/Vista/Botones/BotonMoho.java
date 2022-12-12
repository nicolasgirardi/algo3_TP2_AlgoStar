package edu.fiuba.algo3.Vista.Botones;

import edu.fiuba.algo3.Controlador.OtrosHandlers.RUTAS_FXML;

public class BotonMoho extends BotonCeldaTablero {

    public BotonMoho(BotonCeldaTablero botonCeldaTablero) {
        super(botonCeldaTablero, "images/moho.png",RUTAS_FXML.MENU_VACIO,RUTAS_FXML.MENU_VACIO);
        juegoModelo.subscribirseJugadorActivo(this);
    }
    @Override
    public void setElmentsController() {
        //Es menu vacio en ambos
    }


}
