package paquetes;

import ciudades.Ciudad;
import grupos.Grupo;

public abstract class Actividad {
    private final String nombre;
    private final Ciudad ciudad;

    public Actividad(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public boolean sePuedeRealizarEn(Ciudad ciudad) {
        return this.ciudad == ciudad;
    }

    public abstract boolean puedeSerRealizadaPor(Grupo grupo);

    public abstract int precio(Grupo grupo);

    public Ciudad ciudad() {
        return ciudad;
    }
}
