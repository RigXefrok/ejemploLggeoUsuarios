public class Premio {
    private final String beneficio;

    public Premio(String beneficio) {
        this.beneficio = beneficio;
    }

    @Override
    public String toString() {
        return "Premio:" + beneficio;
    }
}
