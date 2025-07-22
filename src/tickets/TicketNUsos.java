package tickets;

import artistas.Artista;

public class TicketNUsos extends Ticket {
    private int usosDisponibles;
    public TicketNUsos(int usosDisponibles) {
        this.usosDisponibles = usosDisponibles;
    }

    @Override
    public boolean puedeIngresarAVer(Artista artista) {
        return usosDisponibles > 0;
    }

    @Override
    public void ver(Artista artista) {
        if (puedeIngresarAVer(artista)) {
            usosDisponibles -= 1;
            artista.registrarIngreso();
        }
    }


}
