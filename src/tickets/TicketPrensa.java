package tickets;

import artistas.Artista;

public class TicketPrensa extends Ticket {
    @Override
    public boolean puedeIngresarAVer(Artista artista) {
        return artista.tienePrensaHabilitada();
    }

    @Override
    public void ver(Artista artista) {
        artista.registrarIngreso();
    }
}
