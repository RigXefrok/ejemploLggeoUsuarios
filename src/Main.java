public class Main {
    public static void main(String[] args) {
        Impresora impresoraHitachi = new Impresora(10, 10, 10, 10, 10);

        Documento cvSeba = new Documento(2, 0, 2, 1, 2);
        Documento pdf = new Documento(4, 3, 3, 1, 2);
        Documento archivo = new Documento(1, 0, 0, 0, 3);
        Documento legajo = new Documento(1, 1, 1, 1, 5);

        System.out.println("Cv seba fue impreso: " + impresoraHitachi.imprimi(cvSeba).fueImpreso());
        System.out.println("PDF fue impreso: " + impresoraHitachi.imprimi(pdf).fueImpreso());
        System.out.println("archivo seba fue impreso: " + impresoraHitachi.imprimi(archivo).fueImpreso());
        System.out.println("legajo seba fue impreso: " + impresoraHitachi.imprimi(legajo).fueImpreso());

        System.out.println("\nSe imprimieron " + impresoraHitachi.getCantidadDeDocumentos() + " Documentos");
        System.out.println("Se usaron " + impresoraHitachi.getCantidadDeHojasImpresas() + " Hojas");
    }
}