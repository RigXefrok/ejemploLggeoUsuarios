package propietario;

public class Propietario {
    private final String cuit;
    private final String nombre;
    public Propietario(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String nombre() {
        return nombre;
    }
}
