package habitantes;

public class Mascota extends Habitante {

    public Mascota(int edad) {
        super(edad);
    }

    @Override
    public boolean mereceRegalo() {
        return true;
    }
}
