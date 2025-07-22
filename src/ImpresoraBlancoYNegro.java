public class ImpresoraBlancoYNegro extends Impresora {
    private int recipienteNegro;

    private int bandejaDeHojas;

    public ImpresoraBlancoYNegro(int recipienteNegro, int bandejaDeHojas) {
        this.recipienteNegro = recipienteNegro;
        this.bandejaDeHojas = bandejaDeHojas;
    }

    private int cantidadDeTintaNegra(Documento documento) {
        return documento.getCantidadDeCianRequerida() + documento.getCantidadDeNegroRequerida() + documento.getCantidadDeMagentaRequerida() + documento.getCantidadDeAmarrilloRequerida();
    }

    public boolean podesImprimir(Documento documento) {
        return recipienteNegro >= cantidadDeTintaNegra(documento) &&
                bandejaDeHojas >= documento.getCantidadDeHojasRequeridas();
    }

    public Documento imprimi(Documento documento) {
        if (podesImprimir(documento)) {
            super.imprimi(documento);
            recipienteNegro -= cantidadDeTintaNegra(documento);
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
