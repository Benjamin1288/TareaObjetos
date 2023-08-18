import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        Pizza pizza = new Pizza("Peperoni", 60.00, List.of("queso", "peperoni", "masa","tomate"));
        System.out.println(pizza.toString());
        pizza.preparar();

        System.out.println("----------------------------------------");
        PizzaItaliana pizzaItaliana = new PizzaItaliana("Margarita", 50.50, List.of("queso", "tomate"), "tomate", 15);
        System.out.println(pizzaItaliana.toString());
        pizzaItaliana.preparar();

        System.out.println("----------------------------------------");
        Topping quesoTopping = new Topping("Extra queso");
        quesoTopping.agregar(pizza);
        System.out.println("Pizza después de agregar topping: "+ pizza.toString());
    }
}