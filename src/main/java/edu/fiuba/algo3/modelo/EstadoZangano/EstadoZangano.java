package edu.fiuba.algo3.modelo.EstadoZangano;

import edu.fiuba.algo3.modelo.Raza.RazaZerg;
import edu.fiuba.algo3.modelo.Recurso.Recurso;
import edu.fiuba.algo3.modelo.Unidad.*;
import edu.fiuba.algo3.modelo.UnidadesRecurso.GestionRecurso;

public interface EstadoZangano {
    public abstract Zangano evolucionarLarva();

    public abstract void agregarseAEstaRaza(RazaZerg razaZerg);

    public abstract   Mutalisco crearMutalisco();

    public abstract void ejecutarTurno();

    public abstract void agregarZangano(Zangano zangano);

    public abstract GestionRecurso extraer(Recurso recurso);

    public abstract Hidralisco evolucionarLarvaAHidra(Larva larva);

    public abstract Zerling evolucionarLarvaAZerli(Larva larva);

}
