package edu.fiuba.algo3.modelo;

public class Asimilador extends Edificio{
    private final int CANTIDAD_TURNOS_OPERATIVO = 6;
    private final int CANTIDAD_EXTRACCION = 20;
    private Volcan volcan;

    public Asimilador(int cantTurnosParaSerOperativo,HitPoints HP){
        this.cantTurnosParaSerOperativo = cantTurnosParaSerOperativo;
        hp=HP;
    }

    public Asimilador(Volcan volcan, HitPoints HP){
        this.cantTurnosParaSerOperativo = CANTIDAD_TURNOS_OPERATIVO;
        this.volcan = volcan;
        hp=HP;
    }

    public void ejecutarTurno() { //refactoriazar al del parametro
        cantTurnosParaSerOperativo--;
        hp.regenerar();
    }

    public void ejecutarTurno(RazaRecursos razaRecursos){
        cantTurnosParaSerOperativo--;
        hp.regenerar();
        razaRecursos.aumentarGas(volcan.extraer(CANTIDAD_EXTRACCION));
    }

    public void extraer(RazaRecursos razaRecursos){
        this.verificarEdificioEsOperativo();

    }
}
