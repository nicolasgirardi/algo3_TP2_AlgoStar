package edu.fiuba.algo3.modelo;

public class TrabajoGas extends TrabajoZangano{

    private final int UNIDADES_EXTRACCION = 10;

    public TrabajoGas(Volcan volcan){
        super(volcan);
    }

    @Override
    public void extraer(RazaRecursos razaRecursos) {
        int gas =  recurso.extraer(UNIDADES_EXTRACCION);
        razaRecursos.aumentarGas(gas);
    }
}
