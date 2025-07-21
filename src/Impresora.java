public class Impresora {
    private int recipienteCian;
    private int recipienteMagenta;
    private int recipienteAmarrillo;
    private int recipienteNegro;

    private int bandejaDeHojas;

    private int cantidadDeHojasImpresas;
    private int cantidadDeDocumentos;

    public Impresora(int recipienteCian, int recipienteMagenta, int recipienteAmarrillo, int recipienteNegro, int bandejaDeHojas) {
        this.recipienteCian = recipienteCian;
        this.recipienteMagenta = recipienteMagenta;
        this.recipienteAmarrillo = recipienteAmarrillo;
        this.recipienteNegro = recipienteNegro;
        this.bandejaDeHojas = bandejaDeHojas;
    }


    public boolean podesImprimir(Documento documento) {
        return recipienteCian >= documento.getCantidadDeCianRequerida() &&
                recipienteNegro >= documento.getCantidadDeNegroRequerida() &&
                recipienteAmarrillo >= documento.getCantidadDeAmarrilloRequerida() &&
                recipienteMagenta >= documento.getCantidadDeMagentaRequerida() &&
                bandejaDeHojas >= documento.getCantidadDeHojasRequeridas();
    }

    public Documento imprimi(Documento documento) {
        if (podesImprimir(documento)) {
            cantidadDeDocumentos += 1;
            cantidadDeHojasImpresas += documento.getCantidadDeHojasRequeridas();
            recipienteMagenta -= documento.getCantidadDeMagentaRequerida();
            recipienteAmarrillo -= documento.getCantidadDeAmarrilloRequerida();
            recipienteNegro -= documento.getCantidadDeNegroRequerida();
            recipienteCian -= documento.getCantidadDeCianRequerida();
            bandejaDeHojas -= documento.getCantidadDeHojasRequeridas();
            documento.seImprimio();
        };
        return documento;
    }

    public int cuantoDeCianTeQueda() {
        return recipienteCian;
    }

    public int cuantoDeMagentaTeQueda() {
        return recipienteMagenta;
    }

    public int cuantoDeAmarrilloTeQueda() {
        return recipienteAmarrillo;
    }

    public int cuantoDeNegroTeQueda() {
        return recipienteNegro;
    }

    public void reponerHojas(int nuevasHojas) {
        this.bandejaDeHojas += nuevasHojas;
    }

    public void reponerRecipienteAmarrillo(int recipienteAmarrillo) {
        this.recipienteAmarrillo = recipienteAmarrillo;
    }

    public void reponerRecipienteCian(int recipienteCian) {
        this.recipienteCian = recipienteCian;
    }

    public void reponerRecipienteMagenta(int recipienteMagenta) {
        this.recipienteMagenta = recipienteMagenta;
    }

    public void reponerRecipienteNegro(int recipienteNegro) {
        this.recipienteNegro = recipienteNegro;
    }

    public int getCantidadDeHojasImpresas() {
        return cantidadDeHojasImpresas;
    }

    public int getCantidadDeDocumentos() {
        return cantidadDeDocumentos;
    }
}
