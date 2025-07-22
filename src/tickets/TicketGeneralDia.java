package tickets;

import artistas.Artista;
import artistas.Dia;

public class TicketGeneralDia extends Ticket {
    private final Dia dia;
    public TicketGeneralDia(Dia dia) {
        this.dia = dia;
    }

    @Override
    public boolean puedeIngresarAVer(Artista artista) {
        return artista.dia() == dia;
    }

    @Override
    public void ver(Artista artista) {

    }


}
