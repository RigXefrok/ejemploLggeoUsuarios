package artistas;

public class Escenario {
    private final String escenario;
    private final boolean admitePrensa;
    public Escenario(String escenario, boolean admitePrensa) {
        this.escenario = escenario;
        this.admitePrensa = admitePrensa;
    }

    public Escenario(String escenario) {
        this(escenario, false);
    }

    public boolean admitePrense() {
        return admitePrensa;
    }
}
