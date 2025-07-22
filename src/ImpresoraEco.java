public class ImpresoraEco extends ImpresoraCuatroTintas {

    public ImpresoraEco(int recipienteCian, int recipienteMagenta, int recipienteAmarrillo, int recipienteNegro, int bandejaDeHojas) {
        super(recipienteCian, recipienteMagenta, recipienteAmarrillo, recipienteNegro, bandejaDeHojas);
    }

    private boolean esEco(Documento documento) {
        return documento.cantidadTintaTotal() <= 10 && documento.getCantidadDeHojasRequeridas() <= 10;
    }

    @Override
    public boolean podesImprimir(Documento documento) {
        return esEco(documento) && super.podesImprimir(documento);
    }

    @Override
    public Documento imprimi(Documento documento) {
        if (podesImprimir(documento)) {
            super.imprimi(documento);
        }
        return documento;
    }
}
