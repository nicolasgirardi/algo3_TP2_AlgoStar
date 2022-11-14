package edu.fiuba.algo3.modelo.Juego;


import edu.fiuba.algo3.modelo.Raza.Raza;
import javafx.scene.paint.Color;

public class Jugador {
    private String nombre;
    private Color color;
    private Raza raza;

    public Jugador(String nombre, Color color, Raza raza){
        if(nombre.length() < 6) throw new JugadorNombreError();
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }

    public void compatibleCon(Jugador jugador) {
        if(jugador.nombre == nombre) throw  new JugadorMismoNombreError();
        if(jugador.color.equals(color)) throw new JugadorMismoColorError();
        if(jugador.raza.getClass() == raza.getClass()) throw new JugadorMismaRazaError();
    }
}
