import java.util.Scanner;

public class Main {
    static final String usuarioCorrecto = "sebadlf";
    static final String contrasenaCorrrecta = "adminadmin";

    public static void main(String[] args) {
        short cantidadDeIntentos = 3;
        Scanner scanner = new Scanner(System.in);

        while (cantidadDeIntentos > 0) {
            System.out.print("Ingrese su usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrrecta))  {
                System.out.println("Bienvenido " + usuario);
                cantidadDeIntentos = 0;
            } else {
                System.out.println("El usuario o la contraseña son incorrectos");
                cantidadDeIntentos -= 1;
                if (cantidadDeIntentos == 0) {
                    System.out.println("Se agotaron la cantidad de intentos");
                }
            }
        }
        scanner.close();
    }
}