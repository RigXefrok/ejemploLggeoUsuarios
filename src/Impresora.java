public class Impresora {
    private int cantidadDeHojasImpresas;
    private int cantidadDeDocumentos;

    public boolean podesImprimir(Documento documento) {
        return false;
    }

    public Documento imprimi(Documento documento) {
        cantidadDeDocumentos += 1;
        cantidadDeHojasImpresas += documento.getCantidadDeHojasRequeridas();
        documento.seImprimio();
        return documento;
    }

    public int getCantidadDeHojasImpresas() {
        return cantidadDeHojasImpresas;
    }

    public int getCantidadDeDocumentos() {
        return cantidadDeDocumentos;
    }
}
