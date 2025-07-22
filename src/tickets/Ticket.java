package tickets;

import artistas.Artista;

public abstract class Ticket {
    public abstract boolean puedeIngresarAVer(Artista artista);

    public abstract void ver(Artista artista);
}
