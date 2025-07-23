package centralesProductoras;

import generadores.ReactorNuclear;
import propietario.Propietario;

import java.util.ArrayList;
import java.util.List;

public class CentralAtomico extends CentralProductora {
    private final List<ReactorNuclear> reactores = new ArrayList<>();
    private int cantidadMaximaReactores = 5;

    public CentralAtomico(Propietario propietario, int capacidadMaxima, ReactorNuclear reactor) {
        super(propietario, capacidadMaxima);
        agregar(reactor);
    }

    public CentralAtomico(Propietario propietario, int capacidadMaxima, ReactorNuclear reactor, int cantidadMaximaReactores) {
        this(propietario, capacidadMaxima, reactor);
        this.cantidadMaximaReactores = cantidadMaximaReactores;
    }

    private int cantidadReactores() {
        return reactores.size();
    }

    public void agregar(ReactorNuclear reactor) {
        if (cantidadReactores() < cantidadMaximaReactores) {
            reactores.add(reactor);
        }
    }

    @Override
    public int aporta() {
        return reactores.stream().mapToInt(ReactorNuclear::produccion).sum();
    }

    private int obtenerEmision() {
        return reactores.getFirst().emision();
    }

    @Override
    public int emite() {
        return cantidadReactores() * obtenerEmision();
    }
}
