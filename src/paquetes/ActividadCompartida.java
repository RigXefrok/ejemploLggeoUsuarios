package paquetes;

import ciudades.Ciudad;
import grupos.Grupo;

public class ActividadCompartida extends Actividad {
    private final int precioPorPersona;
    public ActividadCompartida(String nombre, Ciudad ciudad, int precioPorPersona) {
        super(nombre, ciudad);
        this.precioPorPersona = precioPorPersona;
    }

    @Override
    public boolean puedeSerRealizadaPor(Grupo grupo) {
        return grupo.esMayoresDeEdad();
    }

    public int precio(Grupo grupo) {
        return precioPorPersona * grupo.cantidadDeViajeros();
    }
}
