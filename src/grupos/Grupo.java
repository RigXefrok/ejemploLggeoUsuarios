package grupos;

import java.util.HashSet;

public class Grupo {
    private final HashSet<Viajero> viajeros = new HashSet<>();
    private int presupuesto;

    public Grupo(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void agregar(Viajero viajero) {
        viajeros.add(viajero);
    }

    public void eliminar(Viajero viajero) {
        viajeros.remove(viajero);
    }

    public int cantidadDeViajeros() {
        return viajeros.size();
    }

    public boolean esMayoresDeEdad() {
        return viajeros.stream().allMatch(viajero -> viajero.edad() >= 18);
    }

    public void modificarPresupuesto(int nuevoPresupuesto) {
        presupuesto = nuevoPresupuesto;
    }

    public int presupuesto() {
        return presupuesto;
    }
}
