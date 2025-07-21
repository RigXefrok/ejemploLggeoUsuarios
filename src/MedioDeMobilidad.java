public class MedioDeMobilidad {
    private final String tipo;
    private Premio premio;

    MedioDeMobilidad(String tipo, Premio premio) {
        this.tipo = tipo;
        this.premio = premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public Premio getPremio() {
        return premio;
    }

    @Override
    public String toString() {
        return "Medio:" + tipo;
    }
}
