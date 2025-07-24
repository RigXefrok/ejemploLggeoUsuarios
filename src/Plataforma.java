import java.util.*;

public class Plataforma {
    private final HashSet<Cancion> canciones = new HashSet<>();

    public void agregar(Cancion cancion) {
        canciones.add(cancion);
    }

    public void agregar(List<Cancion> canciones) {
        this.canciones.addAll(canciones);
    }

    public Cancion obtenerCancion(String id) throws CancionNoEncontrada {
        List<Cancion> cancion = canciones.stream().filter(c -> Objects.equals(c.id(), id)).toList();
        if (cancion.isEmpty()) {
            throw new CancionNoEncontrada();
        }
        return cancion.getFirst();
    }

    public Cancion masReproducida() throws CancionNoEncontrada {
        Optional<Cancion> cancionMasReproducida = canciones.stream().max(Comparator.comparingInt(Cancion::reproducciones));
        if (cancionMasReproducida.isEmpty()) {
            throw new CancionNoEncontrada();
        }
        return cancionMasReproducida.get();
    }

    public HashSet<Artista> artistas() {
        return new HashSet<Artista>(canciones.stream().map(Cancion::artista).toList());
    }

    public boolean esUnExito() {
        return canciones.stream().allMatch(cancion -> cancion.reproducciones() > 0);
    }

    public HashSet<Cancion> hits() {
        return new HashSet<>(canciones.stream().filter(Cancion::esUnHit).toList());
    }
}
