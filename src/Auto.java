public class Auto {
    private boolean enMarcha = false;
    private int nivelDeNafta;

    public void poneteEnMarcha() {
        System.out.println("Estoy en marcha");
        enMarcha = true;
    }

    public boolean estasEnMarcha() {
        return enMarcha;
    }

    public void cargarNafta(int nafta) {
        nivelDeNafta += nafta;
    }

    public int cuantaNaftaTenes() {
        return nivelDeNafta;
    }
}
