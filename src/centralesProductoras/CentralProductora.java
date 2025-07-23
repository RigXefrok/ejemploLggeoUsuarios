package centralesProductoras;

import propietario.Propietario;

public abstract class CentralProductora {
    private final Propietario propietario;
    private final int capacidadMaxima;
    private static int UMBRAL_CONTAMINANTE = 70;
    private static int UMBRAL_EFICIENTA = 82;

    public CentralProductora(Propietario propietario, int capacidadMaxima) {
        this.propietario = propietario;
        this.capacidadMaxima = capacidadMaxima;
    }

    public abstract int aporta();

    public abstract int emite();

    public Propietario propietario() {
        return propietario;
    }

    public boolean estaExigida() {
        return capacidadMaxima <= aporta();
    }

    public boolean esContaminante() {
        return emite() >= UMBRAL_CONTAMINANTE;
    }

    public boolean esEficiente() {
        return emite() < UMBRAL_EFICIENTA;
    }

}
