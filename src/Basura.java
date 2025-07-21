public class Basura {
    private final int peso;
    private final String nombre;

    Basura (int peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public int peso() {
        return peso;
    }

    public String nombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Basura/" + nombre;
    }
}
