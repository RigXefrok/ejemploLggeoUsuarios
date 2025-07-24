import ciudades.Ciudad;
import grupos.Grupo;
import grupos.Viajero;
import paquetes.Actividad;
import paquetes.ActividadCompartida;
import paquetes.ActividadPrivada;
import paquetes.VamosTodos;

public class Main {
    public static void main(String[] args) {
        Ciudad buenosAires = new Ciudad("Buenos aires", 0);
        Ciudad mendoza = new Ciudad("Mendoza", 7);
        Ciudad bariloche = new Ciudad("Bariloche", 0);
        Ciudad mardelPlata = new Ciudad("Mar del plata", 0);


        Viajero martin = new Viajero(18);
        Viajero matias = new Viajero(20);
        Viajero nico = new Viajero(21);

        Grupo grupo1 = new Grupo(2200);
        grupo1.agregar(martin);
        grupo1.agregar(matias);
        grupo1.agregar(nico);
        VamosTodos paquete1 = new VamosTodos(grupo1);
        paquete1.agregar(buenosAires, 2);
        paquete1.agregar(mendoza, 2);
        paquete1.agregar(bariloche, 3);

        Actividad cataDeVinosMendoza = new ActividadCompartida("cata de vinos", mendoza, 245);
        Actividad parapenteEnMarDelPlata = new ActividadCompartida("cata de vinos", mardelPlata, 0);
        Actividad paseoEnVeleroBuenosAires = new ActividadPrivada("paseo en velero buenos aires", buenosAires, 6, 720);

        paquete1.agregar(cataDeVinosMendoza);
        paquete1.agregar(parapenteEnMarDelPlata);
        paquete1.agregar(paseoEnVeleroBuenosAires);

        System.out.println(paquete1.precioTotal());

        System.out.println("Esta dentro del presupuesto? " + paquete1.estaDentroDelPresupuesto());
        System.out.println("Eliminando actividad mas cara...");
        paquete1.eliminarActividadMasCara();
        System.out.println("Esta dentro del presupuesto? " + paquete1.estaDentroDelPresupuesto());

        System.out.println("Donde se gasto mas en actividades? " + paquete1.dondeSeGastaMasEnACtividades());
    }
}