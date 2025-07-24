public class Artista {
    private final String nombre;

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + nombre;
    }
}
