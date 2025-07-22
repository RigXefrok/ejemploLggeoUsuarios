public class ImpresoraEco extends ImpresoraCuatroTintas {

    public ImpresoraEco(int recipienteCian, int recipienteMagenta, int recipienteAmarrillo, int recipienteNegro, int bandejaDeHojas) {
        super(recipienteCian, recipienteMagenta, recipienteAmarrillo, recipienteNegro, bandejaDeHojas);
    }

    private int calcularTintaTotal(Documento documento) {
        return documento.getCantidadDeMagentaRequerida() + documento.getCantidadDeCianRequerida() + documento.getCantidadDeAmarrilloRequerida() + documento.getCantidadDeNegroRequerida();
    }

    @Override
    public boolean podesImprimir(Documento documento) {
        return calcularTintaTotal(documento) <= 10 && documento.getCantidadDeHojasRequeridas() <= 10;
    }

    @Override
    public Documento imprimi(Documento documento) {
        if (podesImprimir(documento)) {
            super.imprimi(documento);

        }
        return documento;
    }
}
