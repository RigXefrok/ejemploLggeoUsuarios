import centralesProductoras.CentralAtomico;
import centralesProductoras.CentralEolica;
import ciudades.Ciudad;
import consumidores.Consumidor;
import generadores.ReactorNuclear;
import propietario.Propietario;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Propietario seba = new Propietario("Seba", "20 43 000 000 3");
        Propietario magy = new Propietario("magy", "20 39 000 000 3");
        Propietario lucas = new Propietario("Lucas", "20 45 000 000 3");
        Propietario ivi = new Propietario("Ivi", "20 45 000 001 3");

        CentralEolica parqueEolico = new CentralEolica(magy, 156, 12);

        ReactorNuclear reactor1 = new ReactorNuclear(150);
        ReactorNuclear reactor2 = new ReactorNuclear(92);
        CentralAtomico centralNuclearSpringfield = new CentralAtomico(seba, 237, reactor1);
        centralNuclearSpringfield.agregar(reactor2);

        CentralAtomico centralNuclearSpringfield1 = new CentralAtomico(seba, 300, reactor2);

        Consumidor uadePinamar = new Consumidor("Uade pinamar", 32);

        Ciudad springfield = new Ciudad();
        springfield.agregarCentrales(List.of(parqueEolico, centralNuclearSpringfield, centralNuclearSpringfield1));
        springfield.agregarConsumdires(List.of(uadePinamar));

        System.out.println("EL consumo total de springfield es: " + springfield.consumoTotal());
        System.out.println("Las centrales contaminantes de springfield son: " + springfield.centralesContaminantes());
        System.out.println("Springfield es una ciudad eficiente? " + springfield.esEficiente());
        System.out.println("Los propietarios de Springfield son: " + springfield.propietariosCentrales());
        System.out.println("Springfield es una ciudad potencialmente peligrosa? " + springfield.esPotencialmentePeligrosa());

    }
}