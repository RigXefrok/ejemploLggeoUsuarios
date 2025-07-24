package ciudades;

public class Ciudad {
    private  final String nombre;
    private final int tarifaTuristica;

    public Ciudad(String nombre, int tarifaTuristica) {
        this.nombre = nombre;
        this.tarifaTuristica = tarifaTuristica;
    }

    public int tarifaTuristica() {
        return tarifaTuristica;
    }

    public String nombre() {
        return nombre;
    }
}
