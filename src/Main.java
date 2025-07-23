import domicilios.Casa;
import domicilios.Departamento;
import habitantes.Habitante;
import habitantes.Mascota;

public class Main {
    public static void main(String[] args) {
        PapaNoel papaNoel = new PapaNoel();

        Casa villaLaAgostura = new Casa("Villa La Angostura", "casaLaAngostura", true);
        Habitante martin = new Habitante(13);
        Habitante melina = new Habitante(13);
        Mascota eva = new Mascota(15);
        Mascota gollum = new Mascota(14);
        Mascota olivia = new Mascota(11);

        System.out.println(olivia.mereceRegalo());

        villaLaAgostura.agregar(martin);
        villaLaAgostura.agregar(melina);
        villaLaAgostura.agregar(eva);
        villaLaAgostura.agregar(gollum);
        villaLaAgostura.agregar(olivia);

        try {
            papaNoel.agendarVisita(villaLaAgostura);
            papaNoel.agendarVisita(villaLaAgostura);
        } catch (DomicilioException e) {
            System.out.println("Se intento agendar una casa no valida");
        }

        Departamento deptoCaba = new Departamento("CABA", "departamento nicolas", false);
        Habitante nicolas = new Habitante(38);
        Habitante mariana = new Habitante(40);
        Habitante hijo1 = new Habitante(3);
        Habitante hijo2 = new Habitante(6);
        deptoCaba.agregar(nicolas);
        deptoCaba.agregar(mariana);
        deptoCaba.agregar(hijo1);
        deptoCaba.agregar(hijo2);

        papaNoel.agendarVisita(deptoCaba);

        Casa casaMiramar = new Casa("Mirama", "casaViejitos", true);
        Habitante rogelio = new Habitante(70);
        Habitante amanda = new Habitante(67);
        casaMiramar.agregar(rogelio);
        casaMiramar.agregar(amanda);

        papaNoel.agendarVisita(casaMiramar);

        papaNoel.visitarPrimerDomiclioPendiente();

        papaNoel.visitarPrimerDomiclioBloqueado();

        System.out.println(papaNoel.habitanteConRegaloMasviejo());

        System.out.println(papaNoel.obtenerDomiciliosAburridosPendientes());
        papaNoel.visitarDomicilio(casaMiramar);
        System.out.println(papaNoel.obtenerDomiciliosAburridosVisitados());

    }
}