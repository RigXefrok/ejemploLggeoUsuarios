package artistas;

public class Artista {
    private final String nombre;
    private final Escenario escenario;
    private final Dia dia;

    private int contadorDeVisitas;
    public Artista(String nombre, Escenario escenario, Dia dia) {
        this.nombre = nombre;
        this.escenario = escenario;
        this.dia = dia;
    }

    public Dia dia() {
        return dia;
    }

    public void registrarIngreso() {
        contadorDeVisitas += 1;
    }

    public boolean tienePrensaHabilitada() {
        return escenario.admitePrense();
    }

    public int visitas() {
        return contadorDeVisitas;
    }
}
