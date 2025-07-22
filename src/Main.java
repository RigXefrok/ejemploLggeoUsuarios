public class Main {
    public static void main(String[] args) {
        ImpresoraCuatroTintas impresoraCuatroTintas = new ImpresoraCuatroTintas(10, 10, 10, 10, 10);

        Documento cvSeba = new Documento(2, 0, 2, 1, 2);
        Documento pdf = new Documento(4, 3, 3, 1, 2);
        Documento archivo = new Documento(1, 0, 0, 0, 3);
        Documento legajo = new Documento(1, 1, 1, 1, 5);

        System.out.println("\nImpresora cuatro tintas:");
        System.out.println("Cv seba fue impreso: " + impresoraCuatroTintas.imprimi(cvSeba).fueImpreso());
        System.out.println("PDF fue impreso: " + impresoraCuatroTintas.imprimi(pdf).fueImpreso());
        System.out.println("archivo seba fue impreso: " + impresoraCuatroTintas.imprimi(archivo).fueImpreso());
        System.out.println("legajo seba fue impreso: " + impresoraCuatroTintas.imprimi(legajo).fueImpreso());
        System.out.println("Se imprimieron " + impresoraCuatroTintas.getCantidadDeDocumentos() + " Documentos");
        System.out.println("Se usaron " + impresoraCuatroTintas.getCantidadDeHojasImpresas() + " Hojas");

        System.out.println("\nImpresora blanco y negro:");
        ImpresoraBlancoYNegro impresoraBlancoYNegro = new ImpresoraBlancoYNegro(18, 2);
        Documento documentoLargo = new Documento(1, 3, 4, 1, 6);
        System.out.println("Documento largo fue impreso: " + impresoraBlancoYNegro.imprimi(documentoLargo).fueImpreso());
        System.out.println("Impresora cuanta tinta negra tenes? " + impresoraBlancoYNegro.cuantoDeNegroTeQueda());

        System.out.println("\nImpresora PDF:");
        ImpresoraPDF impresoraPDF = new ImpresoraPDF();
        Documento documentoMuyLargo = new Documento(500, 3,2,1,2);
        impresoraPDF.imprimi(documentoMuyLargo);
        impresoraPDF.imprimi(documentoMuyLargo);
        System.out.println(impresoraPDF.getCantidadDeHojasImpresas());
        System.out.println("Impresora PDF podes imprimir el archivo? " + impresoraPDF.podesImprimir());

        System.out.println("\nImpresora eco:");
        ImpresoraEco impresoraEco = new ImpresoraEco(10, 10, 10, 10, 10);
        Documento documentoOnceHojas = new Documento(11, 1,1,1,1);
        Documento documentoEco = new Documento(1, 1,1,1,1);
        System.out.println("Impresora ECO podes imprimir el documento de once hojas? " + impresoraEco.imprimi(documentoOnceHojas).fueImpreso());
        System.out.println("Impresora ECO podes imprimir el documento eco? " + impresoraEco.imprimi(documentoEco).fueImpreso());
    }
}