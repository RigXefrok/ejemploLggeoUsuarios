import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hamburguesa {
    private Pan pan;
    private List<Medallon> medallones = new ArrayList<>();
    private List<IngredienteExtra> ingredientesExtra = new ArrayList<>();

    public void agregar(Medallon medallon) {
        medallones.add(medallon);
    }

    public void agregar(IngredienteExtra ingredienteEtra) {
        ingredientesExtra.add(ingredienteEtra);
    }

    public void seleccionar(Pan pan) {
        this.pan = pan;
    }

    public boolean puedeSerFacturada() {
        return medallones.size() > ingredientesExtra.size() && medallones.size() >= 1;
    }

    private int precioMedallones() {
        return medallones.stream().collect(Collectors.summingInt(medallon -> medallon.precio()));
    }

    private int precioIngredientesExtra() {
        return ingredientesExtra.stream().collect(Collectors.summingInt(ingrediente -> ingrediente.precio()));
    }

    public int precioTotal() {
        return pan.precio() + precioMedallones() + precioIngredientesExtra();
    }
}
