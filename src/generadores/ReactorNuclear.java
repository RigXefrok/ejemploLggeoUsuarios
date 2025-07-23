package generadores;

public class ReactorNuclear {
    private  final int emision = 41;
    private final int produccion;

    public ReactorNuclear(int produccion) {
        this.produccion = produccion;
    }

    public int produccion() {
        return produccion;
    }

    public int emision() {
        return emision;
    }
}
