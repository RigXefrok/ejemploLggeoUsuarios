package centralesProductoras;

import propietario.Propietario;

public class CentralEolica extends CentralProductora {
    private int cantidadGeneradores;
    private int produccionPorGenerador = 13;

    public CentralEolica(Propietario propietario, int capacidadMaxima, int cantidadGeneradores) {
        super(propietario, capacidadMaxima);
        this.cantidadGeneradores = cantidadGeneradores;
    }

    public CentralEolica(Propietario propietario, int capacidadMaxima, int cantidadGeneradores, int produccionPorGenerador) {
        this(propietario, capacidadMaxima, cantidadGeneradores);
        this.produccionPorGenerador = produccionPorGenerador;
    }

    public void agregar() {
        cantidadGeneradores += 1;
    }

    public void retirar() {
        cantidadGeneradores -= 1;
    }

    @Override
    public int aporta() {
        return cantidadGeneradores * produccionPorGenerador;
    }

    @Override
    public int emite() {
        return 0;
    }
}
