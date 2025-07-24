public class LikeSinReproducir extends RuntimeException {
    public LikeSinReproducir() {
        super("Error: se intento dar like a una cancion sin haberla reproducido.");
    }
}
