package ciudades;

public class Destino {
    private final int dias;
    private final Ciudad ciudad;

    public Destino(Ciudad ciudad, int dias) {
        this.ciudad = ciudad;
        this.dias = dias;
    }

    public Ciudad ciudad() {
        return ciudad;
    }
    public int precioPorPersona(int cantidadPersonas) {
        return ciudad.tarifaTuristica() * cantidadPersonas * dias;
    }

    public int dias() {
        return dias;
    }
}
