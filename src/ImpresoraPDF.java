public class ImpresoraPDF extends Impresora {
    private boolean licenciaActiva = true;

    public boolean podesImprimir() {
        return licenciaActiva;
    }

    @Override
    public Documento imprimi(Documento documento) {
        if (podesImprimir()) {
            super.imprimi(documento);
            evaluarLicencia();
        }
        return documento;
    }

    private void evaluarLicencia() {
        licenciaActiva = getCantidadDeHojasImpresas() < 1000 && getCantidadDeDocumentos() < 500;
    }
}
