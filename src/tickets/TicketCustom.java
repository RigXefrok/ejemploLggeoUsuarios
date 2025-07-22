package tickets;

import artistas.Artista;

import java.util.ArrayList;
import java.util.List;

public class TicketCustom extends TicketFan {
    private final List<Artista> artistas = new ArrayList<>();

    public TicketCustom() {
        super(null);
    }

    @Override
    protected boolean esFanDe(Artista artista) {
        return artistas.contains(artista);
    }

    public void agregarArtista(Artista artista) {
        if (!artistas.contains(artista)) {
            artistas.add(artista);
        }
    }

    public void removerArtista(Artista artista) {
        artistas.remove(artista);
    }
}
