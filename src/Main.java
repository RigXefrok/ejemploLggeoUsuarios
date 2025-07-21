public class Main {
    public static void main(String[] args) {
        Premio ninguno = new Premio("");
        Premio voucher = new Premio("$50.000");
        Premio cargaSube = new Premio("$80.000");
        Premio kitSeguridad = new Premio("kit seguridad");

        MedioDeMobilidad auto = new MedioDeMobilidad("auto", voucher);
        MedioDeMobilidad moto = new MedioDeMobilidad("moto", voucher);
        MedioDeMobilidad colectivo = new MedioDeMobilidad("colectivo", cargaSube);
        MedioDeMobilidad tren = new MedioDeMobilidad("tren", cargaSube);
        MedioDeMobilidad bicicleta = new MedioDeMobilidad("bicileta", kitSeguridad);

        Empleado seba = new Empleado("seba", moto);
        Empleado magy = new Empleado("magy", colectivo);
        Empleado agus = new Empleado("agus", auto);
        Empleado lucas = new Empleado("lucas", tren);
        Empleado rosa = new Empleado("rosa", bicicleta);

        System.out.println("Premio " + seba + seba.getPremio());
        System.out.println("Premio " + magy + magy.getPremio());
        System.out.println("Premio " + rosa + rosa.getPremio());
        System.out.println("Premio " + agus + agus.getPremio());

        auto.setPremio(ninguno);
        Premio entradaEvento = new Premio("Entrada evento");
        MedioDeMobilidad monopatin = new MedioDeMobilidad("monopatin", entradaEvento);
        Empleado empleadoMonopatin = new Empleado("monopatinomano", monopatin);
        System.out.println("Premio " + agus + agus.getPremio());
        System.out.println("Premio " + empleadoMonopatin + empleadoMonopatin.getPremio());
    }
}