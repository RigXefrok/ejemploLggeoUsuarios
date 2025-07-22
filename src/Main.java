public class Main {
    public static void main(String[] args) {
        Pan panDePapa = new Pan(4500);
        Pan panDeCampo = new Pan(5500);

        Medallon medallonDeCarne = new Medallon(2900, "carne");
        Medallon medallonDePollo = new Medallon(1500, "pollo");
        Medallon medallonDeVegetariano = new Medallon(1890, "vegetariano");

        IngredienteExtra huevoFrito = new IngredienteExtra(150);
        IngredienteExtra lechuga = new IngredienteExtra(250);
        IngredienteExtra tomate = new IngredienteExtra(200);
        IngredienteExtra cheddar = new IngredienteExtra(600);
        IngredienteExtra berenjena = new IngredienteExtra(350);

        Hamburguesa hamburguesa = new Hamburguesa();
        hamburguesa.seleccionar(panDePapa);
        System.out.println(hamburguesa.puedeSerFacturada());
        hamburguesa.agregar(medallonDeCarne);
        System.out.println(hamburguesa.puedeSerFacturada());
        System.out.println("Precio hamburguesa1: $" + hamburguesa.precioTotal());

        Hamburguesa hamburguesa1 = new Hamburguesa();
        hamburguesa1.seleccionar(panDePapa);
        hamburguesa1.agregar(medallonDePollo);
        hamburguesa1.agregar(medallonDeCarne);
        hamburguesa1.agregar(cheddar);
        hamburguesa1.agregar(berenjena);
        System.out.println("\nHamburguesa1 precio total: $" + hamburguesa1.precioTotal());

        Hamburguesa hamburguesa2 = new Hamburguesa();
        hamburguesa2.seleccionar(panDeCampo);
        hamburguesa2.agregar(medallonDeVegetariano);
        hamburguesa2.agregar(berenjena);
        hamburguesa2.agregar(cheddar);
        System.out.println("\nHamburguesa2 puede ser facturada? " + hamburguesa2.puedeSerFacturada());
    }
}