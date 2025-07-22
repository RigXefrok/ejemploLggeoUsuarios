import artistas.Artista;
import artistas.Dia;
import artistas.Escenario;
import tickets.*;

public class Main {
    public static void main(String[] args) {
        Dia dia1 = new Dia(1);
        Dia dia2 = new Dia(2);
        Dia dia3 = new Dia(3);

        Escenario escenario = new Escenario("sur");
        Escenario escenario1 = new Escenario("norte-pre", true);

        Artista queen = new Artista("queen", escenario, dia1);
        Artista guns = new Artista("guns", escenario1, dia2);
        Artista cuartetoDeNos = new Artista("cuarteto de nos", escenario, dia3);

        System.out.println("Ticket generales por dia:");
        TicketGeneralDia ticketGeneralDia1 = new TicketGeneralDia(dia1);
        TicketGeneralDia ticketGeneralDia2 = new TicketGeneralDia(dia2);
        System.out.println("Ticket dia 1 Puedo ver a queen? " + ticketGeneralDia1.puedeIngresarAVer(queen));
        System.out.println("Ticket dia 1 Puedo ver a guns? " + ticketGeneralDia1.puedeIngresarAVer(guns));
        System.out.println("Ticket dia 2 Puedo ver a guns? " + ticketGeneralDia2.puedeIngresarAVer(guns));

        System.out.println("\nTicket por usos:");
        TicketNUsos ticketB3 = new TicketNUsos(3);
        System.out.println("Ticket B3 Puedo ver a guns? " + ticketB3.puedeIngresarAVer(guns));
        ticketB3.ver(queen);
        ticketB3.ver(cuartetoDeNos);
        ticketB3.ver(guns);
        System.out.println("Ticket B3 Puedo ver a guns? " + ticketB3.puedeIngresarAVer(guns));

        TicketNUsos ticketB7 = new TicketNUsos(7);
        ticketB7.ver(guns);

        System.out.println("\nTicket fan:");
        TicketFan ticketFanQueen = new TicketFan(queen);
        System.out.println("Ticket fan queen puedo ver a queen? " + ticketFanQueen.puedeIngresarAVer(queen));
        System.out.println("Ticket fan queen puedo ver a guns? " + ticketFanQueen.puedeIngresarAVer(guns));
        TicketFan ticketFanGuns = new TicketFan(guns);
        System.out.println("Ticket fan guns puedo ver a queen? " + ticketFanGuns.puedeIngresarAVer(queen));
        System.out.println("Ticket fan guns puedo ver a guns? " + ticketFanGuns.puedeIngresarAVer(guns));

        System.out.println("\nTicket custom:");
        TicketCustom ticketCustom1 = new TicketCustom();
        ticketCustom1.agregarArtista(cuartetoDeNos);
        ticketCustom1.agregarArtista(guns);
        System.out.println("Ticket custom1 puedo ver a queen? " + ticketCustom1.puedeIngresarAVer(queen));
        System.out.println("Ticket custom1 puedo ver a guns? " + ticketCustom1.puedeIngresarAVer(guns));

        System.out.println("\nTicket plus:");
        TicketPlus ticketPlus = new TicketPlus();
        System.out.println("Ticket plus puedo ver a queen? " + ticketPlus.puedeIngresarAVer(queen));
        System.out.println("Ticket plus puedo ver a guns? " + ticketPlus.puedeIngresarAVer(guns));
        System.out.println("Ticket plus puedo ver a cuarteto de nos? " + ticketPlus.puedeIngresarAVer(cuartetoDeNos));

        System.out.println("\nTicket pensa:");
        TicketPrensa ticketPrensa1 = new TicketPrensa();
        System.out.println("Ticket prensa1 puedo ver a queen? " + ticketPrensa1.puedeIngresarAVer(queen));
        System.out.println("Ticket prensa1 puedo ver a guns? " + ticketPrensa1.puedeIngresarAVer(guns));

        System.out.println("\nCuantos vieron a Queen: " + queen.visitas());
        System.out.println("Cuantos vieron a Guns: " + guns.visitas());
        System.out.println("Cuantos vieron a Cuarteto de nos: " + cuartetoDeNos.visitas());
    }
}