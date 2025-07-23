package habitantes;

public class Habitante {
    private final int edad;
    private static int EDAD_MAXIMA_REGALOS;
    public Habitante(int edad) {
        this.edad = edad;
    }

    public boolean mereceRegalo() {
        return edad < EDAD_MAXIMA_REGALOS;
    }

    public int edad() {
        return edad;
    }
}
