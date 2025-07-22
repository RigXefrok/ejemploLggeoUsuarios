package tickets;

import artistas.Artista;

public class TicketPlus extends Ticket {

    @Override
    public boolean puedeIngresarAVer(Artista artista) {
        return true;
    }

    @Override
    public void ver(Artista artista) {
        artista.registrarIngreso();
    }
}
