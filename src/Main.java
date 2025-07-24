public class Main {
    public static void main(String[] args) {
        Usuario melina  = new Usuario("Melina");
        Usuario juan  = new Usuario("Juan");
        Usuario luciana  = new Usuario("Luciana");

        Artista lali = new Artista("Lali");

        Cancion fanaticoLali = new Cancion(lali, "fanatico", "1");
        Plataforma sPOOtify = new Plataforma();

        fanaticoLali.reproducirCancion(melina);
        fanaticoLali.reproducirCancion(juan);
        fanaticoLali.reproducirCancion(melina);

        System.out.println("Fanatico lali:");
        System.out.println("Quienes te escucharon? " + fanaticoLali.usuariosReprodujeron());
        System.out.println("Cuantas reproducciones tenes? " + fanaticoLali.reproducciones());
        System.out.println("Cuantos likes tenes? " + fanaticoLali.likes());

        try {
            fanaticoLali.darLike(melina);
            fanaticoLali.darLike(juan);
            fanaticoLali.darLike(luciana);
        } catch (LikeMultiple | LikeSinReproducir e) {
            System.out.println(e);
        }

        try {
            fanaticoLali.darLike(juan);
        } catch (LikeMultiple e) {
            System.out.println(e);
        }

        System.out.println("Cuantos likes tenes? " + fanaticoLali.likes());

        try {
            sPOOtify.obtenerCancion("1");
        } catch (CancionNoEncontrada e) {
            System.out.println(e);
        }

        sPOOtify.agregar(fanaticoLali);
        System.out.println("\nLa cancion buscada es: " + sPOOtify.obtenerCancion(fanaticoLali.id()));

        System.out.println("La cancion mas reproducida es: " + sPOOtify.masReproducida());

        System.out.println("Los artistas de sPOOtify son: " + sPOOtify.artistas());

        System.out.println("Es un exito? " + sPOOtify.esUnExito());

        System.out.println("los hits son: " + sPOOtify.hits());
    }
}