import java.util.UUID;

public class Usuario {
    private final String id;
    private final String nombre;

    public Usuario(String nombre) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + nombre;
    }
}
