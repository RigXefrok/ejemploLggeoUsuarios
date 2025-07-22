public class ImpresoraBlancoYNegro extends Impresora {
    private int recipienteNegro;

    private int bandejaDeHojas;

    public ImpresoraBlancoYNegro(int recipienteNegro, int bandejaDeHojas) {
        this.recipienteNegro = recipienteNegro;
        this.bandejaDeHojas = bandejaDeHojas;
    }

    private boolean hayTinta(Documento documento) {
        return recipienteNegro >= documento.cantidadTintaTotal();
    }

    private boolean hayHojas(Documento documento) {
        return bandejaDeHojas >= documento.getCantidadDeHojasRequeridas();
    }

    public boolean podesImprimir(Documento documento) {
        return  hayTinta(documento) && hayHojas(documento);
    }

    public Documento imprimi(Documento documento) {
        if (podesImprimir(documento)) {
            super.imprimi(documento);
            recipienteNegro -= documento.cantidadTintaTotal();
            bandejaDeHojas -= documento.getCantidadDeHojasRequeridas();
        };
        return documento;
    }

    public int cuantoDeNegroTeQueda() {
        return recipienteNegro;
    }

    public void reponerHojas(int nuevasHojas) {
        this.bandejaDeHojas += nuevasHojas;
    }

    public void reponerRecipienteNegro(int recipienteNegro) {
        this.recipienteNegro = recipienteNegro;
    }
}
