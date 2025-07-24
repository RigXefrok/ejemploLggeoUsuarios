package domicilios;

public class Departamento extends Domicilio {
    private boolean tieneVentanasAbiertas;
    public Departamento(Barrio barrio, String nombre, boolean tieneVentanasAbiertas) {
        super(barrio, nombre);
        this.tieneVentanasAbiertas = tieneVentanasAbiertas;
    }

    public void cerrarVentanas() {
        tieneVentanasAbiertas = false;
    }

    public void abrirVentanas() {
        tieneVentanasAbiertas = true;
    }

    @Override
    public boolean puedeIngresar() {
        return false;
    }
}
