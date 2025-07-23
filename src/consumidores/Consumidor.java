package consumidores;

public class Consumidor {
    private final String nombre;
    private int consumo;
    public Consumidor(String nombre, int consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }

    public void modificarConsumo(int nuevoConsumo) {
        consumo = nuevoConsumo;
    }

    public int consumo() {
        return consumo;
    }
}
