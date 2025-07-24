package domicilios;

public class Barrio {
    private final String nombre;
    private int cantidadHabitantes;
    public Barrio(String nombre) {
        this.nombre = nombre;
    }
    public String nombre() {
        return nombre;
    }
    public void agregarHabitante() {
        cantidadHabitantes += 1;
    }
    public void removerHabitante() {
        cantidadHabitantes -= 1;
    }
    public int cantidadDeHabitantes() {
        return cantidadHabitantes;
    }
}
