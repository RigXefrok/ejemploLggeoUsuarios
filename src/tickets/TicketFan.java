package tickets;

import artistas.Artista;

public class TicketFan extends Ticket {
    private final Artista artista;
    public TicketFan(Artista artista) {
        this.artista = artista;
    }

    protected boolean esFanDe(Artista artista) {
        return this.artista == artista;
    }

    @Override
    public boolean puedeIngresarAVer(Artista artista) {
        return esFanDe(artista);
    }

    @Override
    public void ver(Artista artista) {
        if(puedeIngresarAVer(artista)) {
            artista.registrarIngreso();
        }
    }
}
