public class Main {
    public static void main(String[] args) {
        CestoDeBasura basurin = new CestoDeBasura(5, Color.NEGRO);
        Basura botellaDePlastico = new Basura(2, "cocacola");
        Basura botellaDePlastico2 = new Basura(2, "fanta");
        Basura botellaDePlastico3 = new Basura(2, "sprite");
        basurin.tirarBasura(botellaDePlastico);
        System.out.println("Esta limpio? " + basurin.estaLimpio());
        System.out.println("Esta lleno? " + basurin.estaLleno());
        basurin.tirarBasura(botellaDePlastico2);
        basurin.tirarBasura(botellaDePlastico3);
        System.out.println("Esta limpio? " + basurin.estaLimpio());
        System.out.println("Esta lleno? " + basurin.estaLleno());
        basurin.vaciar();
        basurin.limpiar();

    }
}