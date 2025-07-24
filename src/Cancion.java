import java.util.HashSet;

public class Cancion {
    private final Artista artista;
    private final String titulo;
    private final String id;

    private int reproducciones;
    private int likes;

    private final HashSet<Usuario> usuariosReprodujeron = new HashSet<>();
    private final HashSet<Usuario> usuaiosLikearon = new HashSet<>();

    public Cancion(Artista artista, String titulo, String id) {
        this.artista = artista;
        this.titulo = titulo;
        this.id = id;
    }

    public String id() {
        return id;
    }

    public Artista artista() {
        return artista;
    }

    public void reproducirCancion(Usuario usuario) {
        reproducciones += 1;
        usuariosReprodujeron.add(usuario);
    }

    private boolean dioLike(Usuario usuario) {
        return usuaiosLikearon.contains(usuario);
    }

    private boolean reprodujo(Usuario usuario) {
        return usuariosReprodujeron.contains(usuario);
    }

    public void darLike(Usuario usuario) throws LikeMultiple, LikeSinReproducir {
        if (dioLike(usuario)) {
            throw new LikeMultiple();
        }
        if (!reprodujo(usuario)){
            throw new LikeSinReproducir();
        }
        likes += 1;
        usuaiosLikearon.add(usuario);
    }

    public int reproducciones() {
        return reproducciones;
    }

    public boolean esUnHit() {
        return reproducciones >= 1000 && likes >= reproducciones * 0.8;
    }

    public HashSet<Usuario> usuariosReprodujeron() {
        return usuariosReprodujeron;
    }

    public int likes() {
        return likes;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + titulo;
    }
}
