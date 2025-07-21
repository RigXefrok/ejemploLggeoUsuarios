import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto();
        System.out.println(miAuto.estasEnMarcha());
        miAuto.poneteEnMarcha();
        System.out.println(miAuto.estasEnMarcha());
        System.out.println(miAuto.cuantaNaftaTenes());
        miAuto.cargarNafta(90);
        System.out.println(miAuto.cuantaNaftaTenes());
    }
}