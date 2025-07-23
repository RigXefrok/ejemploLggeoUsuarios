package domicilios;

public class Casa extends Domicilio {
    private boolean tieneChimenea;
    public Casa(String barrio, String nombre, boolean tieneChimenea) {
        super(barrio, nombre);
        this.tieneChimenea = tieneChimenea;
    }

    public void sacarChimenea() {
        tieneChimenea = false;
    }

    public void ponerChimenea() {
        tieneChimenea = true;
    }

    @Override
    public boolean puedeIngresar() {
        return tieneChimenea;
    }


}
