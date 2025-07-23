package domicilios;

import habitantes.Habitante;

import java.util.ArrayList;
import java.util.List;

public abstract class Domicilio {
    private final String barrio;
    private final String nombre;
    private final List<Habitante> habitantes = new ArrayList<>();

    public Domicilio(String barrio, String nombre) {
        this.barrio = barrio;
        this.nombre = nombre;
    }

    public void agregar(Habitante habitante) {
        habitantes.add(habitante);
    }

    public void remover(Habitante habitante) {
        habitantes.remove(habitante);
    }

    public int cantidadDeHabitantes() {
        return habitantes.size();
    }

    public abstract boolean puedeIngresar();

    public boolean esAburrido() {
        return merecenRegalos().isEmpty();
    }

    public List<Habitante> merecenRegalos() {
        return habitantes.stream().filter(Habitante::mereceRegalo).toList();
    }

}
