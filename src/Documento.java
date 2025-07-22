public class Documento {
    private final int cantidadDeHojasRequeridas;
    private final int cantidadDeCianRequerida;
    private final int cantidadDeMagentaRequerida;
    private final int cantidadDeAmarrilloRequerida;
    private final int cantidadDeNegroRequerida;

    private boolean fueImpreso;

    Documento(int cantidadDeHojasRequeridas, int cantidadDeCianRequerida, int cantidadDeMagentaRequerida, int cantidadDeAmarrilloRequerida, int cantidadDeNegroRequerida){
        this.cantidadDeHojasRequeridas = cantidadDeHojasRequeridas;
        this.cantidadDeCianRequerida = cantidadDeCianRequerida;
        this.cantidadDeMagentaRequerida = cantidadDeMagentaRequerida;
        this.cantidadDeAmarrilloRequerida = cantidadDeAmarrilloRequerida;
        this.cantidadDeNegroRequerida = cantidadDeNegroRequerida;
    }

    public int getCantidadDeAmarrilloRequerida() {
        return cantidadDeAmarrilloRequerida;
    }

    public int getCantidadDeCianRequerida() {
        return cantidadDeCianRequerida;
    }

    public int getCantidadDeHojasRequeridas() {
        return cantidadDeHojasRequeridas;
    }

    public int getCantidadDeMagentaRequerida() {
        return cantidadDeMagentaRequerida;
    }

    public int getCantidadDeNegroRequerida() {
        return cantidadDeNegroRequerida;
    }

    public void seImprimio() {
        fueImpreso = true;
    }

    public boolean fueImpreso() {
        return fueImpreso;
    }

    public int cantidadTintaTotal() {
        return cantidadDeAmarrilloRequerida + cantidadDeCianRequerida + cantidadDeMagentaRequerida + cantidadDeNegroRequerida;
    }

    @Override
    public String toString() {
        return "Docuemento:" + fueImpreso;
    }
}
