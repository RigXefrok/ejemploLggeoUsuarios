import domicilios.Barrio;
import domicilios.Casa;
import domicilios.Departamento;
import habitantes.Habitante;
import habitantes.Mascota;

public class Main {
    public static void main(String[] args) {
        PapaNoel papaNoel = new PapaNoel();

        Barrio villaLaAngostura = new Barrio("Villa la Angostura");
        Casa casaVillaLaAgostura = new Casa(villaLaAngostura, "casaLaAngostura", true);
        Habitante martin = new Habitante(13);
        Habitante melina = new Habitante(13);
        Mascota eva = new Mascota(15);
        Mascota gollum = new Mascota(14);
        Mascota olivia = new Mascota(11);
        casaVillaLaAgostura.agregar(martin);
        casaVillaLaAgostura.agregar(melina);
        casaVillaLaAgostura.agregar(eva);
        casaVillaLaAgostura.agregar(gollum);
        casaVillaLaAgostura.agregar(olivia);

        try {
            papaNoel.agendarVisita(casaVillaLaAgostura);
            papaNoel.agendarVisita(casaVillaLaAgostura);
        } catch (DomicilioException e) {
            System.out.println("Se intento agendar una casa no valida");
        }

        Barrio caba = new Barrio("Caba");
        Departamento deptoCaba = new Departamento(caba, "departamento nicolas", false);
        Habitante nicolas = new Habitante(38);
        Habitante mariana = new Habitante(40);
        Habitante hijo1 = new Habitante(3);
        Habitante hijo2 = new Habitante(6);
        deptoCaba.agregar(nicolas);
        deptoCaba.agregar(mariana);
        deptoCaba.agregar(hijo1);
        deptoCaba.agregar(hijo2);

        papaNoel.agendarVisita(deptoCaba);
        papaNoel.visitarDomicilio(deptoCaba);

        Barrio miramar = new Barrio("Miramar");
        Casa casaMiramar = new Casa(miramar, "casaViejitos", true);
        Habitante rogelio = new Habitante(70);
        Habitante amanda = new Habitante(67);
        casaMiramar.agregar(rogelio);
        casaMiramar.agregar(amanda);

        papaNoel.agendarVisita(casaMiramar);

        papaNoel.visitarPrimerDomiclioPendiente();

        papaNoel.visitarPrimerDomiclioBloqueado();

        System.out.println(papaNoel.habitanteConRegaloMasviejo());

        System.out.println("Domicilios aburridos pendientes: " + papaNoel.obtenerDomiciliosAburridosPendientes());
        papaNoel.visitarDomicilio(casaMiramar);
        System.out.println("Domicilios aburridos visitados: " + papaNoel.obtenerDomiciliosAburridosVisitados());

        System.out.println("Barrios visitados mas de una vez: " + papaNoel.nombresBarriosVisitadosMasDeUnaVez());

        System.out.println("Habitantes del barrio con ultimo bloqueo: " + papaNoel.cantidadDeHabitantesDelUltimoBarrioQueTuvoUnBloqueo());

    }
}