public abstract class Ingrediente {
    private final int precio;

    Ingrediente(int precio) {
        this.precio = precio;
    }

    public int precio() {
        return precio;
    }
}
