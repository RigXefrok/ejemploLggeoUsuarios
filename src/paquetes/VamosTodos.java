package paquetes;

import ciudades.Ciudad;
import ciudades.Destino;
import grupos.Grupo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class VamosTodos {
    private final List<Destino> destinos = new ArrayList<>();
    private final List<Actividad> actividades = new ArrayList<>();
    private final Grupo grupo;

    private static int TARIFA = 36;

    public VamosTodos(Grupo grupo) {
        this.grupo = grupo;
    }

    public void agregar(Ciudad ciudad, int dias) {
        destinos.add(new Destino(ciudad, dias));
    }

    private HashSet<Ciudad> ciudades() {
        return new HashSet<>(destinos.stream().map(Destino::ciudad).toList());
    }

    private boolean esGrupoValido(Actividad actividad) {
        return actividad.puedeSerRealizadaPor(grupo);
    }

    private boolean actividadDisponibleEnCiudades(Actividad actividad) {
        return ciudades().stream().anyMatch(actividad::sePuedeRealizarEn);
    }

    public void agregar(Actividad actividad) {
        if (actividadDisponibleEnCiudades(actividad) && esGrupoValido(actividad)) {
            actividades.add(actividad);
        }
    }

    private int dias() {
        return destinos.stream().mapToInt(Destino::dias).sum();
    }

    private int hospedaje() {
        return TARIFA * grupo.cantidadDeViajeros() * dias();
    }

    private int precioDestinos() {
        return destinos.stream().mapToInt(destino -> destino.precioPorPersona(grupo.cantidadDeViajeros())).sum();
    }

    private int precioActividades() {
        return actividades.stream().mapToInt(actividad -> actividad.precio(grupo)).sum();
    }

    public int precioTotal() {
        return hospedaje() + precioDestinos() + precioActividades();
    }

    private int precioActividadesPorCiudad(Ciudad ciudad) {
        return actividades.stream().filter(actividad -> actividad.ciudad() == ciudad).mapToInt(actividad -> actividad.precio(grupo)).sum();
    }

    public String dondeSeGastaMasEnACtividades() {
        return ciudades().stream().max(Comparator.comparingInt(this::precioActividadesPorCiudad)).get().nombre();
    }

    public boolean estaDentroDelPresupuesto() {
        return precioTotal() <= grupo.presupuesto();
    }

    public void eliminarActividadMasCara() {
        Actividad actividadMasCara = actividades.stream().max(Comparator.comparingInt(actividades -> actividades.precio(grupo))).get();
        actividades.remove(actividadMasCara);
    }
}
