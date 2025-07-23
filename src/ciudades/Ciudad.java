package ciudades;

import centralesProductoras.CentralProductora;
import consumidores.Consumidor;
import propietario.Propietario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ciudad {
    private final List<CentralProductora> centrales = new ArrayList<>();
    private final List<Consumidor> consumidores = new ArrayList<>();

    public void agregar(CentralProductora central) {
        centrales.add(central);
    }

    public void agregarCentrales(List<CentralProductora> centrales) {
        this.centrales.addAll(centrales);
    }

    public void agregar(Consumidor consumidor) {
        this.consumidores.add(consumidor);
    }

    public void agregarConsumdires(List<Consumidor> consumidores) {
        this.consumidores.addAll(consumidores);
    }

    public int consumoTotal() {
        return consumidores.stream().mapToInt(Consumidor::consumo).sum();
    }

    public List<CentralProductora> centralesContaminantes() {
        return centrales.stream().filter(CentralProductora::esContaminante).toList();
    }

    public boolean esEficiente() {
        return centrales.stream().allMatch(CentralProductora::esEficiente);
    }

    public List<Propietario> propietariosCentrales() {
        return centrales.stream().map(CentralProductora::propietario).collect(Collectors.toSet()).stream().toList();
    }

    private int produccionTotal() {
        return centrales.stream().mapToInt(CentralProductora::aporta).sum();
    }

    public boolean esSustentable() {
        return consumoTotal() < produccionTotal();
    }

    public boolean esPotencialmentePeligrosa() {
        return centrales.stream().anyMatch(CentralProductora::estaExigida);
    }


}
