import domicilios.Barrio;
import domicilios.Domicilio;
import habitantes.Habitante;

import java.util.*;
import java.util.stream.Collectors;

public class PapaNoel {
    private final List<Domicilio> domiciliosPorVisitar = new ArrayList<>();
    private final List<Domicilio> domiciliosVisitados = new ArrayList<>();
    private final List<Domicilio> domiciliosBloquedaos = new ArrayList<>();

    private final List<Habitante> recibieronRegalo = new ArrayList<>();

    private boolean yaVisitoDomicilio(Domicilio domicilio) {
        return domiciliosVisitados.contains(domicilio) || domiciliosPorVisitar.contains(domicilio) || domiciliosBloquedaos.contains(domicilio);
    }

    private void marcarComoVisitado(Domicilio domicilio) {
        domiciliosVisitados.add(domicilio);
    }

    private void bloquearDomicilio(Domicilio domicilio) {
        domiciliosBloquedaos.add(domicilio);
    }

    private void removerDePendiente(Domicilio domicilio) {
        domiciliosPorVisitar.remove(domicilio);
    }

    private void entregarRegalos(Domicilio domicilio) {
        recibieronRegalo.addAll(domicilio.merecenRegalos());
    }

    public void visitarDomicilio(Domicilio domicilio) {
        if (domicilio.puedeIngresar()) {
            marcarComoVisitado(domicilio);
            entregarRegalos(domicilio);
        } else {
            bloquearDomicilio(domicilio);
        }
        removerDePendiente(domicilio);
    }

    private void visitarPrimerDomicilio(List<Domicilio> domicilios) {
        if (!domicilios.isEmpty()) {
            visitarDomicilio(domicilios.getFirst());
        }
    }

    public void visitarPrimerDomiclioPendiente() {
        visitarPrimerDomicilio(domiciliosPorVisitar);
    }

    public void visitarPrimerDomiclioBloqueado() {
        visitarPrimerDomicilio(domiciliosBloquedaos);
    }

    public void visitarDomicilios() {
        domiciliosPorVisitar.forEach(this::visitarDomicilio);
    }

    public void agendarVisita(Domicilio domicilio) throws DomicilioException {
        if (yaVisitoDomicilio(domicilio)) throw new DomicilioException("Casa ya visitada");
        domiciliosPorVisitar.add(domicilio);
    }

    public Habitante habitanteConRegaloMasviejo() {
        return recibieronRegalo.stream().max(Comparator.comparingInt(Habitante::edad)).get();
    }

    private List<Domicilio> obtenerDomiciliosAburridos(List<Domicilio> domicilios) {
        return domicilios.stream().filter(Domicilio::esAburrido).toList();
    }

    public List<Domicilio> obtenerDomiciliosAburridosVisitados() {
        return obtenerDomiciliosAburridos(domiciliosVisitados);
    }

    public List<Domicilio> obtenerDomiciliosAburridosPendientes() {
        return obtenerDomiciliosAburridos(domiciliosPorVisitar);
    }

    public HashSet<String> nombresBarriosVisitadosMasDeUnaVez() {
        List<Barrio> nombresBarrios = domiciliosVisitados.stream().map(Domicilio::barrio).toList();
        List<Barrio> nombresFiltrados = nombresBarrios.stream().filter(nombre -> Collections.frequency(nombresBarrios, nombre) > 1).toList();
        return new HashSet<>(nombresFiltrados.stream().map(Barrio::nombre).toList());
    }

    public int cantidadDeHabitantesDelUltimoBarrioQueTuvoUnBloqueo() {
        Barrio barrioConUltimobloqueo = domiciliosBloquedaos.getLast().barrio();
        return barrioConUltimobloqueo.cantidadDeHabitantes();
    }
}
