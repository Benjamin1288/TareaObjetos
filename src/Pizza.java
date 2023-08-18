import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;

    public String getPizza() {
        return nombre;
    }

    public void setPizza(String pizza) {
        this.nombre = pizza;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    private List<String>ingredientes;
    public Pizza(String nombre, double precio, List<String>ingredientes){
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }
    public void preparar(){
        System.out.println("La pizza "+nombre+" esta lista para ser servida");
    }
    @Override
    public String toString() {
        System.out.println("Ingrediente para la pizza: "+ingredientes);
        return "Nombre de la pizza: "+nombre+", y su precio es: Q"+precio;
    }

    public void agregarTopping(Topping topping) {
    }
}
