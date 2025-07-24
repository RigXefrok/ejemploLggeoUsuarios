package paquetes;

import ciudades.Ciudad;
import grupos.Grupo;

public class ActividadPrivada extends Actividad {
    private final int cantidadDeIntegrantes;
    private final int precio;
    public ActividadPrivada(String nombre, Ciudad ciudad, int cantidadDeIntegrantes, int precio) {
        super(nombre, ciudad);
        this.cantidadDeIntegrantes = cantidadDeIntegrantes;
        this.precio = precio;
    }

    @Override
    public boolean puedeSerRealizadaPor(Grupo grupo) {
        return grupo.cantidadDeViajeros() <= cantidadDeIntegrantes;
    }

    @Override
    public int precio(Grupo grupo) {
        return precio;
    }


}
