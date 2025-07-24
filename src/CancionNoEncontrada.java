public class CancionNoEncontrada extends RuntimeException {
    public CancionNoEncontrada() {
        super("Error: La cancion no fue encontrada.");
    }
}
