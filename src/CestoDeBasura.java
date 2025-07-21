import java.util.ArrayList;
import java.util.List;

public class CestoDeBasura {
    private int capacidad;
    private int nivelDeBasura = 0;
    private boolean estaLimpio = true;
    private Color color = Color.NEGRO;
    private List<Basura> contenido = new ArrayList<>();

    public CestoDeBasura(int capacidad, Color color) {
        this.capacidad = capacidad;
        this.color = color;
    }

    public boolean estaLleno() {
        return capacidad == nivelDeBasura;
    }

    public void ensuciar() {
        estaLimpio = false;
    }

    public void limpiar() {
        estaLimpio = true;
    }

    public boolean estaLimpio() {
        return estaLimpio;
    }

    public void tirarBasura(Basura basura) {
        contenido.add(basura);
        nivelDeBasura += basura.peso();
        if (nivelDeBasura >= capacidad) {
            ensuciar();
        }
    }

    public void vaciar() {
        nivelDeBasura = 0;
        contenido.clear();
    }

    public Color color() {
        return color;
    }
}
