public class Empleado {
    private final String nombre;
    private MedioDeMobilidad medioDeMobilidad;

    public Empleado(String nombre, MedioDeMobilidad medioDeMobilidad) {
        this.nombre = nombre;
        this.medioDeMobilidad = medioDeMobilidad;
    }

    public Premio getPremio() {
        return medioDeMobilidad.getPremio();
    }

    public void setMedioDeMobilidad(MedioDeMobilidad medioDeMobilidad) {
        this.medioDeMobilidad = medioDeMobilidad;
    }

    @Override
    public String toString() {
        return "Empleado:" + nombre;
    }
}
